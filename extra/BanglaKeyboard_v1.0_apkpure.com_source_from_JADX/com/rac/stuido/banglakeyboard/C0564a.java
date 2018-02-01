package com.rac.stuido.banglakeyboard;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.app.NotificationCompat;
import android.text.Html;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import com.actionbarsherlock.C0126R;

final class C0564a {
    static AlertDialog m3857a(Context context) {
        CharSequence string = context.getString(C0126R.string.about_dialog_title, new Object[]{context.getString(C0126R.string.app_name)});
        Context contextThemeWrapper = new ContextThemeWrapper(context, C0126R.style.AboutDialog);
        View inflate = View.inflate(contextThemeWrapper, C0126R.layout.about_dialog, null);
        TextView textView = (TextView) inflate.findViewById(C0126R.id.app_version);
        if (textView != null) {
            textView.setText(Html.fromHtml(context.getString(C0126R.string.about_dialog_app_version, new Object[]{C0564a.m3858b(context)})));
        }
        textView = (TextView) inflate.findViewById(C0126R.id.app_developer);
        if (textView != null) {
            textView.setText(Html.fromHtml(context.getString(C0126R.string.about_dialog_developed_by, new Object[]{"<b>RAC Studio</b>"})));
            textView.setVisibility(0);
        }
        textView = (TextView) inflate.findViewById(C0126R.id.build_version);
        if (textView != null) {
            textView.setText(context.getString(C0126R.string.about_dialog_build_version, new Object[]{"4.2.0/319"}));
        }
        textView = (TextView) inflate.findViewById(C0126R.id.copyright);
        if (textView != null) {
            textView.setText(context.getString(C0126R.string.about_dialog_copyright, new Object[]{"2015"}));
        }
        View findViewById = inflate.findViewById(C0126R.id.about_separator);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        findViewById = inflate.findViewById(C0126R.id.about_andromo);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        findViewById = inflate.findViewById(C0126R.id.andromo_logo);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        findViewById = inflate.findViewById(C0126R.id.andromo_banner);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        textView = (TextView) inflate.findViewById(C0126R.id.custom_text);
        if (textView != null) {
            textView.setVisibility(8);
        }
        bt.m3981a();
        findViewById = inflate.findViewById(C0126R.id.analytics_notice);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        return new Builder(contextThemeWrapper).setTitle(string).setView(inflate).setPositiveButton(17039370, null).setIcon(C0126R.drawable.ic_launcher_icon).create();
    }

    private static String m3858b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY).versionName;
        } catch (NameNotFoundException e) {
            return "";
        }
    }
}
