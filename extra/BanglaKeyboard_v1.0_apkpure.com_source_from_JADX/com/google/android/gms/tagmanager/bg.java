package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.kc;
import com.google.android.gms.internal.kd;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class bg implements C0518g {
    private static final String f2347a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", "key", "value", "expires"});
    private final Executor f2348b;
    private final Context f2349c;
    private bj f2350d;
    private kc f2351e;
    private int f2352f;

    public bg(Context context) {
        this(context, kd.m2514b(), "google_tagmanager.db", Executors.newSingleThreadExecutor());
    }

    private bg(Context context, kc kcVar, String str, Executor executor) {
        this.f2349c = context;
        this.f2351e = kcVar;
        this.f2352f = 2000;
        this.f2348b = executor;
        this.f2350d = new bj(this, this.f2349c, str);
    }

    private SQLiteDatabase m3685a(String str) {
        try {
            return this.f2350d.getWritableDatabase();
        } catch (SQLiteException e) {
            C0535t.m3731a(str);
            return null;
        }
    }

    private static Object m3686a(byte[] bArr) {
        Object readObject;
        Throwable th;
        ObjectInputStream objectInputStream = null;
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2;
        try {
            objectInputStream2 = new ObjectInputStream(byteArrayInputStream);
            try {
                readObject = objectInputStream2.readObject();
                try {
                    objectInputStream2.close();
                    byteArrayInputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (ClassNotFoundException e4) {
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e5) {
                    }
                }
                byteArrayInputStream.close();
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e6) {
                        throw th;
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (ClassNotFoundException e8) {
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            byteArrayInputStream.close();
            return readObject;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectInputStream2 = objectInputStream;
            th = th4;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        return readObject;
    }

    private List m3688a(int i) {
        SQLiteException e;
        Throwable th;
        List arrayList = new ArrayList();
        if (i <= 0) {
            C0535t.m3731a("Invalid maxEntries specified. Skipping.");
            return arrayList;
        }
        SQLiteDatabase a = m3685a("Error opening database for peekEntryIds.");
        if (a == null) {
            return arrayList;
        }
        Cursor query;
        try {
            query = a.query("datalayer", new String[]{"ID"}, null, null, null, null, String.format("%s ASC", new Object[]{"ID"}), Integer.toString(i));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(String.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    C0535t.m3731a("Error in peekEntries fetching entryIds: " + e.getMessage());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            C0535t.m3731a("Error in peekEntries fetching entryIds: " + e.getMessage());
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    private void m3690a(long j) {
        SQLiteDatabase a = m3685a("Error opening database for deleteOlderThan.");
        if (a != null) {
            try {
                "Deleted " + a.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)}) + " expired items";
                C0535t.m3734d();
            } catch (SQLiteException e) {
                C0535t.m3731a("Error deleting old entries.");
            }
        }
    }

    private static byte[] m3692a(Object obj) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        byte[] bArr = null;
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayOutputStream.close();
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e4) {
                        throw th;
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e5) {
            objectOutputStream = bArr;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            return bArr;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            objectOutputStream = bArr;
            th = th4;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            byteArrayOutputStream.close();
            throw th;
        }
        return bArr;
    }

    private List m3694b() {
        try {
            m3690a(this.f2351e.mo937a());
            List<bk> c = m3696c();
            List arrayList = new ArrayList();
            for (bk bkVar : c) {
                arrayList.add(new C0523e(bkVar.f2359a, m3686a(bkVar.f2360b)));
            }
            return arrayList;
        } finally {
            m3699e();
        }
    }

    private synchronized void m3695b(List list, long j) {
        String[] strArr;
        long a;
        try {
            a = this.f2351e.mo937a();
            m3690a(a);
            int size = list.size() + (m3698d() - this.f2352f);
            if (size > 0) {
                List a2 = m3688a(size);
                "DataLayer store full, deleting " + a2.size() + " entries to make room.";
                C0535t.m3733c();
                strArr = (String[]) a2.toArray(new String[0]);
                if (!(strArr == null || strArr.length == 0)) {
                    SQLiteDatabase a3 = m3685a("Error opening database for deleteEntries.");
                    if (a3 != null) {
                        a3.delete("datalayer", String.format("%s in (%s)", new Object[]{"ID", TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                    }
                }
            }
        } catch (SQLiteException e) {
            C0535t.m3731a("Error deleting entries " + Arrays.toString(strArr));
        } catch (Throwable th) {
            m3699e();
        }
        m3697c(list, a + j);
        m3699e();
    }

    private List m3696c() {
        SQLiteDatabase a = m3685a("Error opening database for loadSerialized.");
        List arrayList = new ArrayList();
        if (a == null) {
            return arrayList;
        }
        Cursor query = a.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new bk(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    private void m3697c(List list, long j) {
        SQLiteDatabase a = m3685a("Error opening database for writeEntryToDatabase.");
        if (a != null) {
            for (bk bkVar : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("expires", Long.valueOf(j));
                contentValues.put("key", bkVar.f2359a);
                contentValues.put("value", bkVar.f2360b);
                a.insert("datalayer", null, contentValues);
            }
        }
    }

    private int m3698d() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase a = m3685a("Error opening database for getNumStoredEntries.");
        if (a != null) {
            try {
                cursor = a.rawQuery("SELECT COUNT(*) from datalayer", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                C0535t.m3731a("Error getting numStoredEntries");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return i;
    }

    private void m3699e() {
        try {
            this.f2350d.close();
        } catch (SQLiteException e) {
        }
    }

    public final void mo1323a(C0521h c0521h) {
        this.f2348b.execute(new bi(this, c0521h));
    }

    public final void mo1324a(List list, long j) {
        List arrayList = new ArrayList();
        for (C0523e c0523e : list) {
            arrayList.add(new bk(c0523e.f2363a, m3692a(c0523e.f2364b)));
        }
        this.f2348b.execute(new bh(this, arrayList, j));
    }
}
