package com.orange.studio.banglatype;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AndromoAboutActivity extends AppCompatActivity {
    protected Toolbar f7864a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.about_layout);
        this.f7864a = (Toolbar) findViewById(R.id.toolbar);
        if (this.f7864a != null) {
            setSupportActionBar(this.f7864a);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo802a();
            supportActionBar.mo815c(false);
            supportActionBar.mo810b();
            supportActionBar.mo807a(true);
            supportActionBar.mo813b(true);
            supportActionBar.mo806a(getString(R.string.about_dialog_title, new Object[]{getString(R.string.app_name)}));
        }
        TextView textView = (TextView) findViewById(R.id.app_version);
        if (textView != null) {
            textView.setText(Html.fromHtml(getString(R.string.about_dialog_app_version, new Object[]{C1735p.m7516a((Context) this)})));
        }
        textView = (TextView) findViewById(R.id.app_developer);
        if (textView != null) {
            textView.setText(Html.fromHtml(getString(R.string.about_dialog_developed_by, new Object[]{"<b>orange studio bd</b>"})));
            textView.setVisibility(0);
        }
        textView = (TextView) findViewById(R.id.build_version);
        if (textView != null) {
            textView.setText(getString(R.string.about_dialog_build_version, new Object[]{"5.0.9/431"}));
        }
        textView = (TextView) findViewById(R.id.copyright);
        if (textView != null) {
            textView.setText(getString(R.string.about_dialog_copyright, new Object[]{"2017"}));
        }
        View findViewById = findViewById(R.id.analytics_notice);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        findViewById = findViewById(R.id.about_separator);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        findViewById = findViewById(R.id.about_andromo);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        findViewById = findViewById(R.id.andromo_logo);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        findViewById = findViewById(R.id.andromo_banner);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        textView = (TextView) findViewById(R.id.custom_text);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
        new StringBuilder("About ").append(getString(R.string.app_name));
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }
}
