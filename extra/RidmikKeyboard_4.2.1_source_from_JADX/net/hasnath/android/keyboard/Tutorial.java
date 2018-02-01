package net.hasnath.android.keyboard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import ridmik.keyboard.C0053R;

public class Tutorial implements OnTouchListener {
    private static final int MSG_SHOW_BUBBLE = 0;
    private int mBubbleIndex;
    private List<Bubble> mBubbles = new ArrayList();
    Handler mHandler = new C00411();
    private LatinIME mIme;
    private View mInputView;
    private int[] mLocation = new int[2];

    class C00411 extends Handler {
        C00411() {
        }

        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    msg.obj.show(Tutorial.this.mLocation[0], Tutorial.this.mLocation[1]);
                    return;
                default:
                    return;
            }
        }
    }

    class Bubble {
        Drawable bubbleBackground;
        boolean dismissOnClose;
        boolean dismissOnTouch;
        int gravity = 51;
        View inputView;
        CharSequence text;
        TextView textView;
        int width;
        PopupWindow window;
        int f2x;
        int f3y;

        class C00421 implements OnTouchListener {
            C00421() {
            }

            public boolean onTouch(View view, MotionEvent me) {
                Tutorial.this.next();
                return true;
            }
        }

        Bubble(Context context, View inputView, int backgroundResource, int bx, int by, int textResource1, int textResource2) {
            this.bubbleBackground = context.getResources().getDrawable(backgroundResource);
            this.f2x = bx;
            this.f3y = by;
            this.width = (int) (((double) inputView.getWidth()) * 0.9d);
            this.text = new SpannableStringBuilder().append(context.getResources().getText(textResource1)).append("\n").append(context.getResources().getText(textResource2));
            this.dismissOnTouch = true;
            this.dismissOnClose = false;
            this.inputView = inputView;
            this.window = new PopupWindow(context);
            this.window.setBackgroundDrawable(null);
            this.textView = (TextView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0053R.layout.bubble_text, null);
            this.textView.setBackgroundDrawable(this.bubbleBackground);
            this.textView.setText(this.text);
            this.window.setContentView(this.textView);
            this.window.setFocusable(false);
            this.window.setTouchable(true);
            this.window.setOutsideTouchable(false);
        }

        private int chooseSize(PopupWindow pop, View parentView, CharSequence text, TextView tv) {
            int ht = tv.getPaddingTop() + tv.getPaddingBottom();
            CharSequence charSequence = text;
            Layout l = new StaticLayout(charSequence, tv.getPaint(), this.width - (tv.getPaddingLeft() + tv.getPaddingRight()), Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            float max = 0.0f;
            for (int i = 0; i < l.getLineCount(); i++) {
                max = Math.max(max, l.getLineWidth(i));
            }
            pop.setWidth(this.width);
            pop.setHeight(l.getHeight() + ht);
            return l.getHeight();
        }

        void show(int offx, int offy) {
            offy -= this.textView.getPaddingTop() + chooseSize(this.window, this.inputView, this.text, this.textView);
            if (this.inputView.getVisibility() == 0 && this.inputView.getWindowVisibility() == 0) {
                try {
                    if ((this.gravity & 80) == 80) {
                        offy -= this.window.getHeight();
                    }
                    if ((this.gravity & 5) == 5) {
                        offx -= this.window.getWidth();
                    }
                    this.textView.setOnTouchListener(new C00421());
                    this.window.showAtLocation(this.inputView, 0, this.f2x + offx, this.f3y + offy);
                } catch (Exception e) {
                }
            }
        }

        void hide() {
            if (this.window.isShowing()) {
                this.textView.setOnTouchListener(null);
                this.window.dismiss();
            }
        }

        boolean isShowing() {
            return this.window.isShowing();
        }
    }

    public Tutorial(LatinIME ime, LatinKeyboardView inputView) {
        Context context = inputView.getContext();
        this.mIme = ime;
        int x = inputView.getWidth() / 20;
        this.mBubbles.add(new Bubble(context, inputView, C0053R.drawable.dialog_bubble_step02, x, 0, C0053R.string.tip_to_open_keyboard, C0053R.string.touch_to_continue));
        this.mBubbles.add(new Bubble(context, inputView, C0053R.drawable.dialog_bubble_step02, x, 0, C0053R.string.tip_to_view_accents, C0053R.string.touch_to_continue));
        this.mBubbles.add(new Bubble(context, inputView, C0053R.drawable.dialog_bubble_step07, x, 0, C0053R.string.tip_to_open_symbols, C0053R.string.touch_to_continue));
        this.mBubbles.add(new Bubble(context, inputView, C0053R.drawable.dialog_bubble_step07, x, 0, C0053R.string.tip_to_close_symbols, C0053R.string.touch_to_continue));
        this.mBubbles.add(new Bubble(context, inputView, C0053R.drawable.dialog_bubble_step07, x, 0, C0053R.string.tip_to_launch_settings, C0053R.string.touch_to_continue));
        this.mBubbles.add(new Bubble(context, inputView, C0053R.drawable.dialog_bubble_step02, x, 0, C0053R.string.tip_to_start_typing, C0053R.string.touch_to_finish));
        this.mInputView = inputView;
    }

    void start() {
        this.mInputView.getLocationInWindow(this.mLocation);
        this.mBubbleIndex = -1;
        this.mInputView.setOnTouchListener(this);
        next();
    }

    boolean next() {
        if (this.mBubbleIndex >= 0) {
            if (!((Bubble) this.mBubbles.get(this.mBubbleIndex)).isShowing()) {
                return true;
            }
            for (int i = 0; i <= this.mBubbleIndex; i++) {
                ((Bubble) this.mBubbles.get(i)).hide();
            }
        }
        this.mBubbleIndex++;
        if (this.mBubbleIndex >= this.mBubbles.size()) {
            this.mInputView.setOnTouchListener(null);
            this.mIme.sendDownUpKeyEvents(-1);
            this.mIme.tutorialDone();
            return false;
        }
        if (this.mBubbleIndex == 3 || this.mBubbleIndex == 4) {
            this.mIme.mKeyboardSwitcher.toggleSymbols();
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, this.mBubbles.get(this.mBubbleIndex)), 500);
        return true;
    }

    void hide() {
        for (int i = 0; i < this.mBubbles.size(); i++) {
            ((Bubble) this.mBubbles.get(i)).hide();
        }
        this.mInputView.setOnTouchListener(null);
    }

    boolean close() {
        this.mHandler.removeMessages(0);
        hide();
        return true;
    }

    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == 0) {
            next();
        }
        return true;
    }
}
