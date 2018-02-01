package com.bumptech.glide.load.p043a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class C1175i extends C1169g<InputStream> {
    private static final UriMatcher f3473a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3473a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f3473a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f3473a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f3473a.addURI("com.android.contacts", "contacts/#", 3);
        f3473a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public C1175i(Context context, Uri uri) {
        super(context, uri);
    }

    protected final /* synthetic */ Object mo1330a(Uri uri, ContentResolver contentResolver) {
        int match = f3473a.match(uri);
        switch (match) {
            case 1:
            case 3:
                if (match == 1) {
                    uri = Contacts.lookupContact(contentResolver, uri);
                    if (uri == null) {
                        throw new FileNotFoundException("Contact cannot be found");
                    }
                }
                return VERSION.SDK_INT < 14 ? Contacts.openContactPhotoInputStream(contentResolver, uri) : Contacts.openContactPhotoInputStream(contentResolver, uri, true);
            default:
                return contentResolver.openInputStream(uri);
        }
    }

    protected final /* synthetic */ void mo1331a(Object obj) {
        ((InputStream) obj).close();
    }
}
