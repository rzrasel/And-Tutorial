package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0679r;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0775f;
import android.support.v7.p021a.C0780a.C0776g;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.view.menu.C0119p.C0117a;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements C0117a {
    private C0967j f2962a;
    private ImageView f2963b;
    private RadioButton f2964c;
    private TextView f2965d;
    private CheckBox f2966e;
    private TextView f2967f;
    private ImageView f2968g;
    private Drawable f2969h;
    private int f2970i;
    private Context f2971j;
    private boolean f2972k;
    private Drawable f2973l;
    private int f2974m;
    private LayoutInflater f2975n;
    private boolean f2976o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0770a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, C0779j.MenuView, i, 0);
        this.f2969h = obtainStyledAttributes.getDrawable(C0779j.MenuView_android_itemBackground);
        this.f2970i = obtainStyledAttributes.getResourceId(C0779j.MenuView_android_itemTextAppearance, -1);
        this.f2972k = obtainStyledAttributes.getBoolean(C0779j.MenuView_preserveIconSpacing, false);
        this.f2971j = context;
        this.f2973l = obtainStyledAttributes.getDrawable(C0779j.MenuView_subMenuArrow);
        obtainStyledAttributes.recycle();
    }

    private void m2763b() {
        this.f2964c = (RadioButton) getInflater().inflate(C0776g.abc_list_menu_item_radio, this, false);
        addView(this.f2964c);
    }

    private void m2764c() {
        this.f2966e = (CheckBox) getInflater().inflate(C0776g.abc_list_menu_item_checkbox, this, false);
        addView(this.f2966e);
    }

    private LayoutInflater getInflater() {
        if (this.f2975n == null) {
            this.f2975n = LayoutInflater.from(getContext());
        }
        return this.f2975n;
    }

    private void setShortcut$25d965e(boolean z) {
        int i = (z && this.f2962a.m2821d()) ? 0 : 8;
        if (i == 0) {
            CharSequence charSequence;
            TextView textView = this.f2967f;
            char c = this.f2962a.m2818c();
            if (c == '\u0000') {
                charSequence = "";
            } else {
                StringBuilder stringBuilder = new StringBuilder(C0967j.f3063f);
                switch (c) {
                    case '\b':
                        stringBuilder.append(C0967j.f3065h);
                        break;
                    case '\n':
                        stringBuilder.append(C0967j.f3064g);
                        break;
                    case ' ':
                        stringBuilder.append(C0967j.f3066i);
                        break;
                    default:
                        stringBuilder.append(c);
                        break;
                }
                charSequence = stringBuilder.toString();
            }
            textView.setText(charSequence);
        }
        if (this.f2967f.getVisibility() != i) {
            this.f2967f.setVisibility(i);
        }
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f2968g != null) {
            this.f2968g.setVisibility(z ? 0 : 8);
        }
    }

    public final void mo42a(C0967j c0967j) {
        int i = 0;
        this.f2962a = c0967j;
        this.f2974m = 0;
        setVisibility(c0967j.isVisible() ? 0 : 8);
        setTitle(c0967j.m2812a((C0117a) this));
        setCheckable(c0967j.isCheckable());
        boolean d = c0967j.m2821d();
        c0967j.m2818c();
        if (!(d && this.f2962a.m2821d())) {
            i = 8;
        }
        if (i == 0) {
            CharSequence charSequence;
            TextView textView = this.f2967f;
            char c = this.f2962a.m2818c();
            if (c == '\u0000') {
                charSequence = "";
            } else {
                StringBuilder stringBuilder = new StringBuilder(C0967j.f3063f);
                switch (c) {
                    case '\b':
                        stringBuilder.append(C0967j.f3065h);
                        break;
                    case '\n':
                        stringBuilder.append(C0967j.f3064g);
                        break;
                    case ' ':
                        stringBuilder.append(C0967j.f3066i);
                        break;
                    default:
                        stringBuilder.append(c);
                        break;
                }
                charSequence = stringBuilder.toString();
            }
            textView.setText(charSequence);
        }
        if (this.f2967f.getVisibility() != i) {
            this.f2967f.setVisibility(i);
        }
        setIcon(c0967j.getIcon());
        setEnabled(c0967j.isEnabled());
        setSubMenuArrowVisible(c0967j.hasSubMenu());
        setContentDescription(c0967j.getContentDescription());
    }

    public final boolean mo43a() {
        return false;
    }

    public C0967j getItemData() {
        return this.f2962a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        C0679r.m1912a((View) this, this.f2969h);
        this.f2965d = (TextView) findViewById(C0775f.title);
        if (this.f2970i != -1) {
            this.f2965d.setTextAppearance(this.f2971j, this.f2970i);
        }
        this.f2967f = (TextView) findViewById(C0775f.shortcut);
        this.f2968g = (ImageView) findViewById(C0775f.submenuarrow);
        if (this.f2968g != null) {
            this.f2968g.setImageDrawable(this.f2973l);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f2963b != null && this.f2972k) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2963b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        if (z || this.f2964c != null || this.f2966e != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f2962a.m2822e()) {
                if (this.f2964c == null) {
                    m2763b();
                }
                compoundButton = this.f2964c;
                compoundButton2 = this.f2966e;
            } else {
                if (this.f2966e == null) {
                    m2764c();
                }
                compoundButton = this.f2966e;
                compoundButton2 = this.f2964c;
            }
            if (z) {
                compoundButton.setChecked(this.f2962a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f2966e != null) {
                this.f2966e.setVisibility(8);
            }
            if (this.f2964c != null) {
                this.f2964c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2962a.m2822e()) {
            if (this.f2964c == null) {
                m2763b();
            }
            compoundButton = this.f2964c;
        } else {
            if (this.f2966e == null) {
                m2764c();
            }
            compoundButton = this.f2966e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2976o = z;
        this.f2972k = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2962a.f3077b.f497i || this.f2976o;
        if (!z && !this.f2972k) {
            return;
        }
        if (this.f2963b != null || drawable != null || this.f2972k) {
            if (this.f2963b == null) {
                this.f2963b = (ImageView) getInflater().inflate(C0776g.abc_list_menu_item_icon, this, false);
                addView(this.f2963b, 0);
            }
            if (drawable != null || this.f2972k) {
                ImageView imageView = this.f2963b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f2963b.getVisibility() != 0) {
                    this.f2963b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f2963b.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f2965d.setText(charSequence);
            if (this.f2965d.getVisibility() != 0) {
                this.f2965d.setVisibility(0);
            }
        } else if (this.f2965d.getVisibility() != 8) {
            this.f2965d.setVisibility(8);
        }
    }
}
