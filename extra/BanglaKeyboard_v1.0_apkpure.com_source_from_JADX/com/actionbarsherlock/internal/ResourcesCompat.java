package com.actionbarsherlock.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.actionbarsherlock.C0126R;

public final class ResourcesCompat {
    private ResourcesCompat() {
    }

    public static boolean getResources_getBoolean(Context context, int i) {
        if (VERSION.SDK_INT >= 13) {
            return context.getResources().getBoolean(i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.density;
        if (f < f2) {
            f2 = f;
        }
        if (i == C0126R.bool.abs__action_bar_embed_tabs) {
            return f >= 480.0f;
        } else {
            if (i == C0126R.bool.abs__split_action_bar_is_narrow) {
                return f < 480.0f;
            } else {
                if (i == C0126R.bool.abs__action_bar_expanded_action_views_exclusive) {
                    return f2 < 600.0f;
                } else {
                    if (i == C0126R.bool.abs__config_allowActionMenuItemTextWithIcon) {
                        return f >= 480.0f;
                    } else {
                        throw new IllegalArgumentException("Unknown boolean resource ID " + i);
                    }
                }
            }
        }
    }

    public static int getResources_getInteger(Context context, int i) {
        if (VERSION.SDK_INT >= 13) {
            return context.getResources().getInteger(i);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
        if (i == C0126R.integer.abs__max_action_buttons) {
            return f >= 600.0f ? 5 : f >= 500.0f ? 4 : f >= 360.0f ? 3 : 2;
        } else {
            throw new IllegalArgumentException("Unknown integer resource ID " + i);
        }
    }
}
