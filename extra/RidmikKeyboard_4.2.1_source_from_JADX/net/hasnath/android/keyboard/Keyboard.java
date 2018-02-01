package net.hasnath.android.keyboard;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParserException;
import ridmik.keyboard.C0053R;

public class Keyboard {
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    private static final int GRID_HEIGHT = 5;
    private static final int GRID_SIZE = 50;
    private static final int GRID_WIDTH = 10;
    public static final int KEYCODE_ALT = -6;
    public static final int KEYCODE_CANCEL = -3;
    public static final int KEYCODE_DELETE = -5;
    public static final int KEYCODE_DONE = -4;
    public static final int KEYCODE_MODE_CHANGE = -2;
    public static final int KEYCODE_SHIFT = -1;
    private static float SEARCH_DISTANCE = 1.8f;
    static final String TAG = "Keyboard";
    private static final String TAG_KEY = "Key";
    private static final String TAG_KEYBOARD = "Keyboard";
    private static final String TAG_ROW = "Row";
    public boolean isEmoji;
    private int mCellHeight;
    private int mCellWidth;
    private int mDefaultHeight;
    private int mDefaultHorizontalGap;
    private int mDefaultVerticalGap;
    private int mDefaultWidth;
    private int mDisplayHeight;
    private int mDisplayWidth;
    private int[][] mGridNeighbors;
    private int mKeyHeight;
    private int mKeyWidth;
    private int mKeyboardHeightPercentage;
    private int mKeyboardMode;
    private List<Key> mKeys;
    private CharSequence mLabel;
    private List<Key> mModifierKeys;
    private int mProximityThreshold;
    private int[] mShiftKeyIndices;
    private Key[] mShiftKeys;
    private boolean mShifted;
    private int mTotalHeight;
    private int mTotalWidth;
    private ArrayList<Row> rows;

    public static class Key {
        private static final int[] KEY_STATE_NORMAL = new int[0];
        private static final int[] KEY_STATE_NORMAL_OFF = new int[]{16842911};
        private static final int[] KEY_STATE_NORMAL_ON = new int[]{16842911, 16842912};
        private static final int[] KEY_STATE_PRESSED = new int[]{16842919};
        private static final int[] KEY_STATE_PRESSED_OFF = new int[]{16842919, 16842911};
        private static final int[] KEY_STATE_PRESSED_ON = new int[]{16842919, 16842911, 16842912};
        public int[] codes;
        public int edgeFlags;
        public int gap;
        public int height;
        public Drawable icon;
        public Drawable iconPreview;
        private Keyboard keyboard;
        public CharSequence label;
        public boolean modifier;
        public boolean on;
        public CharSequence popupCharacters;
        public int popupResId;
        public boolean pressed;
        public boolean repeatable;
        public boolean sticky;
        public CharSequence text;
        public int width;
        public int f0x;
        public int f1y;

        public Key(Row parent) {
            this.keyboard = parent.parent;
            this.height = parent.defaultHeight;
            this.width = parent.defaultWidth;
            this.gap = parent.defaultHorizontalGap;
            this.edgeFlags = parent.rowEdgeFlags;
        }

        public Key(Resources res, Row parent, int x, int y, XmlResourceParser parser) {
            this(parent);
            this.f0x = x;
            this.f1y = y;
            TypedArray a = res.obtainAttributes(Xml.asAttributeSet(parser), C0053R.styleable.Keyboard);
            this.width = Keyboard.getDimensionOrFraction(a, 0, this.keyboard.mDisplayWidth, parent.defaultWidth);
            this.height = Keyboard.getDimensionOrFraction(a, 1, this.keyboard.mDisplayHeight, parent.defaultHeight);
            this.gap = Keyboard.getDimensionOrFraction(a, 2, this.keyboard.mDisplayWidth, parent.defaultHorizontalGap);
            a.recycle();
            a = res.obtainAttributes(Xml.asAttributeSet(parser), C0053R.styleable.Keyboard_Key);
            this.f0x += this.gap;
            TypedValue codesValue = new TypedValue();
            a.getValue(1, codesValue);
            if (codesValue.type == 16 || codesValue.type == 17) {
                this.codes = new int[]{codesValue.data};
            } else if (codesValue.type == 3) {
                this.codes = parseCSV(codesValue.string.toString());
            }
            this.iconPreview = a.getDrawable(9);
            if (this.iconPreview != null) {
                this.iconPreview.setBounds(0, 0, this.iconPreview.getIntrinsicWidth(), this.iconPreview.getIntrinsicHeight());
            }
            this.popupCharacters = a.getText(3);
            this.popupResId = a.getResourceId(2, 0);
            this.repeatable = a.getBoolean(8, false);
            this.modifier = a.getBoolean(5, false);
            this.sticky = a.getBoolean(6, false);
            this.edgeFlags = a.getInt(4, 0);
            this.edgeFlags |= parent.rowEdgeFlags;
            this.icon = a.getDrawable(14);
            if (this.icon != null) {
                this.icon.setBounds(0, 0, this.icon.getIntrinsicWidth(), this.icon.getIntrinsicHeight());
            }
            this.label = a.getText(11);
            this.text = a.getText(10);
            if (this.codes == null && !TextUtils.isEmpty(this.label)) {
                this.codes = new int[]{this.label.charAt(0)};
            }
            if (this.codes != null && this.codes[0] > 9000) {
                String ll = getEmijoByUnicode(this.codes[0]);
                this.label = ll;
                this.text = ll;
            }
            a.recycle();
        }

        public String getEmijoByUnicode(int unicode) {
            return new String(Character.toChars(unicode));
        }

        public void onPressed() {
            this.pressed = !this.pressed;
        }

        public void onReleased(boolean inside) {
            boolean z;
            boolean z2 = false;
            if (this.pressed) {
                z = false;
            } else {
                z = true;
            }
            this.pressed = z;
            if (this.sticky) {
                if (!this.on) {
                    z2 = true;
                }
                this.on = z2;
            }
        }

        int[] parseCSV(String value) {
            int count = 0;
            int lastIndex = 0;
            if (value.length() > 0) {
                count = 0 + 1;
                while (true) {
                    lastIndex = value.indexOf(",", lastIndex + 1);
                    if (lastIndex <= 0) {
                        break;
                    }
                    count++;
                }
            }
            int[] values = new int[count];
            count = 0;
            StringTokenizer st = new StringTokenizer(value, ",");
            while (st.hasMoreTokens()) {
                int count2 = count + 1;
                try {
                    values[count] = Integer.parseInt(st.nextToken());
                    count = count2;
                } catch (NumberFormatException e) {
                    Log.e("Keyboard", "Error parsing keycodes " + value);
                    count = count2;
                }
            }
            return values;
        }

        public boolean isInside(int x, int y) {
            boolean bottomEdge;
            boolean leftEdge;
            if ((this.edgeFlags & 1) > 0) {
                leftEdge = true;
            } else {
                leftEdge = false;
            }
            boolean rightEdge;
            if ((this.edgeFlags & 2) > 0) {
                rightEdge = true;
            } else {
                rightEdge = false;
            }
            boolean topEdge;
            if ((this.edgeFlags & 4) > 0) {
                topEdge = true;
            } else {
                topEdge = false;
            }
            if ((this.edgeFlags & 8) > 0) {
                bottomEdge = true;
            } else {
                bottomEdge = false;
            }
            if ((x >= this.f0x || (leftEdge && x <= this.f0x + this.width)) && ((x < this.f0x + this.width || (rightEdge && x >= this.f0x)) && (y >= this.f1y || (topEdge && y <= this.f1y + this.height)))) {
                if (y < this.f1y + this.height) {
                    return true;
                }
                if (bottomEdge && y >= this.f1y) {
                    return true;
                }
            }
            return false;
        }

        public int squaredDistanceFrom(int x, int y) {
            int xDist = (this.f0x + (this.width / 2)) - x;
            int yDist = (this.f1y + (this.height / 2)) - y;
            return (xDist * xDist) + (yDist * yDist);
        }

        public int[] getCurrentDrawableState() {
            int[] states = KEY_STATE_NORMAL;
            if (this.on) {
                if (this.pressed) {
                    return KEY_STATE_PRESSED_ON;
                }
                return KEY_STATE_NORMAL_ON;
            } else if (this.sticky) {
                if (this.pressed) {
                    return KEY_STATE_PRESSED_OFF;
                }
                return KEY_STATE_NORMAL_OFF;
            } else if (this.pressed) {
                return KEY_STATE_PRESSED;
            } else {
                return states;
            }
        }
    }

    public static class Row {
        public int defaultHeight;
        public int defaultHorizontalGap;
        public int defaultWidth;
        ArrayList<Key> mKeys = new ArrayList();
        public int mode;
        private Keyboard parent;
        public int rowEdgeFlags;
        public int verticalGap;

        public Row(Keyboard parent) {
            this.parent = parent;
        }

        public Row(Resources res, Keyboard parent, XmlResourceParser parser) {
            this.parent = parent;
            TypedArray a = res.obtainAttributes(Xml.asAttributeSet(parser), C0053R.styleable.Keyboard);
            this.defaultWidth = Keyboard.getDimensionOrFraction(a, 0, parent.mDisplayWidth, parent.mDefaultWidth);
            this.defaultHeight = Keyboard.getDimensionOrFraction(a, 1, parent.mDisplayHeight, parent.mDefaultHeight);
            this.defaultHorizontalGap = Keyboard.getDimensionOrFraction(a, 2, parent.mDisplayWidth, parent.mDefaultHorizontalGap);
            this.verticalGap = Keyboard.getDimensionOrFraction(a, 3, parent.mDisplayHeight, parent.mDefaultVerticalGap);
            a.recycle();
            a = res.obtainAttributes(Xml.asAttributeSet(parser), C0053R.styleable.Keyboard_Row);
            this.rowEdgeFlags = a.getInt(0, 0);
            this.mode = a.getResourceId(1, 0);
        }
    }

    public Keyboard(Context context, int xmlLayoutResId) {
        this(context, xmlLayoutResId, 0, 100);
    }

    public Keyboard(Context context, int xmlLayoutResId, int modeId, int width, int height) {
        this.mShiftKeys = new Key[2];
        this.mShiftKeyIndices = new int[]{-1, -1};
        this.mKeyboardHeightPercentage = 100;
        this.isEmoji = false;
        this.rows = new ArrayList();
        this.mDisplayWidth = width;
        this.mDisplayHeight = height;
        this.mDefaultHorizontalGap = 0;
        this.mDefaultWidth = this.mDisplayWidth / 10;
        this.mDefaultVerticalGap = 0;
        this.mDefaultHeight = this.mDefaultWidth;
        this.mKeys = new ArrayList();
        this.mModifierKeys = new ArrayList();
        this.mKeyboardMode = modeId;
        loadKeyboard(context, context.getResources().getXml(xmlLayoutResId));
    }

    public Keyboard(Context context, int xmlLayoutResId, int modeId, int keyboardHeightPercentage) {
        this.mShiftKeys = new Key[2];
        this.mShiftKeyIndices = new int[]{-1, -1};
        this.mKeyboardHeightPercentage = 100;
        this.isEmoji = false;
        this.rows = new ArrayList();
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        this.mDisplayWidth = dm.widthPixels;
        this.mDisplayHeight = dm.heightPixels;
        this.mKeyboardHeightPercentage = keyboardHeightPercentage;
        this.mDefaultHorizontalGap = 0;
        this.mDefaultWidth = this.mDisplayWidth / 10;
        this.mDefaultVerticalGap = 0;
        this.mDefaultHeight = this.mDefaultWidth;
        this.mKeys = new ArrayList();
        this.mModifierKeys = new ArrayList();
        this.mKeyboardMode = modeId;
        loadKeyboard(context, context.getResources().getXml(xmlLayoutResId));
    }

    public Keyboard(Context context, int layoutTemplateResId, CharSequence characters, int columns, int horizontalPadding) {
        int maxColumns;
        this(context, layoutTemplateResId);
        int x = 0;
        int y = 0;
        int column = 0;
        this.mTotalWidth = 0;
        Row row = new Row(this);
        row.defaultHeight = this.mDefaultHeight;
        row.defaultWidth = this.mDefaultWidth;
        row.defaultHorizontalGap = this.mDefaultHorizontalGap;
        row.verticalGap = this.mDefaultVerticalGap;
        row.rowEdgeFlags = 12;
        if (columns == -1) {
            maxColumns = Integer.MAX_VALUE;
        } else {
            maxColumns = columns;
        }
        for (int i = 0; i < characters.length(); i++) {
            char c = characters.charAt(i);
            if (column >= maxColumns || (this.mDefaultWidth + x) + horizontalPadding > this.mDisplayWidth) {
                x = 0;
                y += this.mDefaultVerticalGap + this.mDefaultHeight;
                column = 0;
            }
            Key key = new Key(row);
            key.f0x = x;
            key.f1y = y;
            key.label = String.valueOf(c);
            key.codes = new int[]{c};
            column++;
            x += key.width + key.gap;
            this.mKeys.add(key);
            row.mKeys.add(key);
            if (x > this.mTotalWidth) {
                this.mTotalWidth = x;
            }
        }
        this.mTotalHeight = this.mDefaultHeight + y;
        this.rows.add(row);
    }

    final void resize(int newWidth, int newHeight) {
        int numRows = this.rows.size();
        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            int keyIndex;
            Row row = (Row) this.rows.get(rowIndex);
            int numKeys = row.mKeys.size();
            int totalGap = 0;
            int totalWidth = 0;
            for (keyIndex = 0; keyIndex < numKeys; keyIndex++) {
                Key key = (Key) row.mKeys.get(keyIndex);
                if (keyIndex > 0) {
                    totalGap += key.gap;
                }
                totalWidth += key.width;
            }
            if (totalGap + totalWidth > newWidth) {
                int x = 0;
                float scaleFactor = ((float) (newWidth - totalGap)) / ((float) totalWidth);
                for (keyIndex = 0; keyIndex < numKeys; keyIndex++) {
                    key = (Key) row.mKeys.get(keyIndex);
                    key.width = (int) (((float) key.width) * scaleFactor);
                    key.f0x = x;
                    x += key.width + key.gap;
                }
            }
        }
        this.mTotalWidth = newWidth;
    }

    public List<Key> getKeys() {
        return this.mKeys;
    }

    public List<Key> getModifierKeys() {
        return this.mModifierKeys;
    }

    protected int getHorizontalGap() {
        return this.mDefaultHorizontalGap;
    }

    protected void setHorizontalGap(int gap) {
        this.mDefaultHorizontalGap = gap;
    }

    protected int getVerticalGap() {
        return this.mDefaultVerticalGap;
    }

    protected void setVerticalGap(int gap) {
        this.mDefaultVerticalGap = gap;
    }

    protected int getKeyHeight() {
        return this.mDefaultHeight;
    }

    protected void setKeyHeight(int height) {
        this.mDefaultHeight = height;
    }

    protected int getKeyWidth() {
        return this.mDefaultWidth;
    }

    protected void setKeyWidth(int width) {
        this.mDefaultWidth = width;
    }

    public int getHeight() {
        return this.mTotalHeight;
    }

    public int getMinWidth() {
        return this.mTotalWidth;
    }

    public boolean setShifted(boolean shiftState) {
        for (Key shiftKey : this.mShiftKeys) {
            if (shiftKey != null) {
                shiftKey.on = shiftState;
            }
        }
        if (this.mShifted == shiftState) {
            return false;
        }
        this.mShifted = shiftState;
        return true;
    }

    public boolean isShifted() {
        return this.mShifted;
    }

    public int[] getShiftKeyIndices() {
        return this.mShiftKeyIndices;
    }

    public int getShiftKeyIndex() {
        return this.mShiftKeyIndices[0];
    }

    private void computeNearestNeighbors() {
        this.mCellWidth = ((getMinWidth() + 10) - 1) / 10;
        this.mCellHeight = ((getHeight() + 5) - 1) / 5;
        this.mGridNeighbors = new int[GRID_SIZE][];
        int[] indices = new int[this.mKeys.size()];
        int gridWidth = this.mCellWidth * 10;
        int gridHeight = this.mCellHeight * 5;
        int x = 0;
        while (x < gridWidth) {
            int y = 0;
            while (y < gridHeight) {
                int count = 0;
                for (int i = 0; i < this.mKeys.size(); i++) {
                    Key key = (Key) this.mKeys.get(i);
                    if (key.squaredDistanceFrom(x, y) < this.mProximityThreshold || key.squaredDistanceFrom((this.mCellWidth + x) - 1, y) < this.mProximityThreshold || key.squaredDistanceFrom((this.mCellWidth + x) - 1, (this.mCellHeight + y) - 1) < this.mProximityThreshold || key.squaredDistanceFrom(x, (this.mCellHeight + y) - 1) < this.mProximityThreshold) {
                        int count2 = count + 1;
                        indices[count] = i;
                        count = count2;
                    }
                }
                int[] cell = new int[count];
                System.arraycopy(indices, 0, cell, 0, count);
                this.mGridNeighbors[((y / this.mCellHeight) * 10) + (x / this.mCellWidth)] = cell;
                y += this.mCellHeight;
            }
            x += this.mCellWidth;
        }
    }

    public int[] getNearestKeys(int x, int y) {
        if (this.mGridNeighbors == null) {
            computeNearestNeighbors();
        }
        if (x >= 0 && x < getMinWidth() && y >= 0 && y < getHeight()) {
            int index = ((y / this.mCellHeight) * 10) + (x / this.mCellWidth);
            if (index < GRID_SIZE) {
                return this.mGridNeighbors[index];
            }
        }
        return new int[0];
    }

    protected Row createRowFromXml(Resources res, XmlResourceParser parser) {
        return new Row(res, this, parser);
    }

    protected Key createKeyFromXml(Resources res, Row parent, int x, int y, XmlResourceParser parser) {
        return new Key(res, parent, x, y, parser);
    }

    private void loadKeyboard(Context context, XmlResourceParser parser) {
        boolean inKey = false;
        boolean inRow = false;
        int row = 0;
        int x = 0;
        int y = 0;
        Key key = null;
        Row currentRow = null;
        Resources res = context.getResources();
        while (true) {
            int event = parser.next();
            if (event == 1) {
                break;
            } else if (event == 2) {
                try {
                    String tag = parser.getName();
                    if (TAG_ROW.equals(tag)) {
                        inRow = true;
                        x = 0;
                        currentRow = createRowFromXml(res, parser);
                        this.rows.add(currentRow);
                        boolean skipRow = (currentRow.mode == 0 || currentRow.mode == this.mKeyboardMode) ? false : true;
                        if (skipRow) {
                            skipToEndOfRow(parser);
                            inRow = false;
                        }
                    } else if (TAG_KEY.equals(tag)) {
                        inKey = true;
                        key = createKeyFromXml(res, currentRow, x, y, parser);
                        if (key.codes != null && key.codes[0] > 9000) {
                            this.isEmoji = true;
                        }
                        this.mKeys.add(key);
                        if (key.codes[0] == -1) {
                            for (int i = 0; i < this.mShiftKeys.length; i++) {
                                if (this.mShiftKeys[i] == null) {
                                    this.mShiftKeys[i] = key;
                                    this.mShiftKeyIndices[i] = this.mKeys.size() - 1;
                                    break;
                                }
                            }
                            this.mModifierKeys.add(key);
                        } else if (key.codes[0] == -6) {
                            this.mModifierKeys.add(key);
                        }
                        currentRow.mKeys.add(key);
                    } else if ("Keyboard".equals(tag)) {
                        parseKeyboardAttributes(res, parser);
                    }
                } catch (Exception e) {
                    Log.e("Keyboard", "Parse error:" + e);
                    e.printStackTrace();
                }
            } else if (event == 3) {
                if (inKey) {
                    inKey = false;
                    x += key.gap + key.width;
                    if (x > this.mTotalWidth) {
                        this.mTotalWidth = x;
                    }
                } else if (inRow) {
                    inRow = false;
                    y = (y + currentRow.verticalGap) + currentRow.defaultHeight;
                    row++;
                }
            }
        }
        this.mTotalHeight = y - this.mDefaultVerticalGap;
    }

    private void skipToEndOfRow(XmlResourceParser parser) throws XmlPullParserException, IOException {
        while (true) {
            int event = parser.next();
            if (event != 1) {
                if (event == 3 && parser.getName().equals(TAG_ROW)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void parseKeyboardAttributes(Resources res, XmlResourceParser parser) {
        TypedArray a = res.obtainAttributes(Xml.asAttributeSet(parser), C0053R.styleable.Keyboard);
        this.mDefaultWidth = getDimensionOrFraction(a, 0, this.mDisplayWidth, this.mDisplayWidth / 10);
        this.mDefaultHeight = getDimensionOrFraction(a, 1, this.mDisplayHeight, GRID_SIZE);
        this.mDefaultHeight = (this.mDefaultHeight * this.mKeyboardHeightPercentage) / 100;
        this.mDefaultHorizontalGap = getDimensionOrFraction(a, 2, this.mDisplayWidth, 0);
        this.mDefaultVerticalGap = getDimensionOrFraction(a, 3, this.mDisplayHeight, 0);
        this.mProximityThreshold = (int) (((float) this.mDefaultWidth) * SEARCH_DISTANCE);
        this.mProximityThreshold *= this.mProximityThreshold;
        a.recycle();
    }

    static int getDimensionOrFraction(TypedArray a, int index, int base, int defValue) {
        TypedValue value = a.peekValue(index);
        if (value == null) {
            return defValue;
        }
        if (value.type == 5) {
            return a.getDimensionPixelOffset(index, defValue);
        }
        if (value.type == 6) {
            return Math.round(a.getFraction(index, base, base, (float) defValue));
        }
        return defValue;
    }
}
