package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

public final class jg {
    public static String m2483a(String str, String str2, Context context, AttributeSet attributeSet, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !attributeValue.startsWith("@string/")) {
            return attributeValue;
        }
        String substring = attributeValue.substring(8);
        String packageName = context.getPackageName();
        TypedValue typedValue = new TypedValue();
        try {
            context.getResources().getValue(packageName + ":string/" + substring, typedValue, true);
        } catch (NotFoundException e) {
            Log.w(str3, "Could not find resource for " + str2 + ": " + attributeValue);
        }
        if (typedValue.string != null) {
            return typedValue.string.toString();
        }
        Log.w(str3, "Resource " + str2 + " was not a string: " + typedValue);
        return attributeValue;
    }
}
