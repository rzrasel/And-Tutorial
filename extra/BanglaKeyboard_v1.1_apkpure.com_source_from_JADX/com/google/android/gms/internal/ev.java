package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class ev implements lc {
    private final Map<String, gu> f6066a;
    private long f6067b;
    private final File f6068c;
    private final int f6069d;

    private ev(File file) {
        this.f6066a = new LinkedHashMap(16, 0.75f, true);
        this.f6067b = 0;
        this.f6068c = file;
        this.f6069d = 5242880;
    }

    public ev(File file, byte b) {
        this(file);
    }

    static int m5378a(InputStream inputStream) {
        return (((m5390e(inputStream) | 0) | (m5390e(inputStream) << 8)) | (m5390e(inputStream) << 16)) | (m5390e(inputStream) << 24);
    }

    static void m5379a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void m5380a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void m5381a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m5380a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void m5382a(String str, gu guVar) {
        if (this.f6066a.containsKey(str)) {
            gu guVar2 = (gu) this.f6066a.get(str);
            this.f6067b = (guVar.f6163a - guVar2.f6163a) + this.f6067b;
        } else {
            this.f6067b += guVar.f6163a;
        }
        this.f6066a.put(str, guVar);
    }

    private static byte[] m5383a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    static long m5384b(InputStream inputStream) {
        return (((((((0 | (((long) m5390e(inputStream)) & 255)) | ((((long) m5390e(inputStream)) & 255) << 8)) | ((((long) m5390e(inputStream)) & 255) << 16)) | ((((long) m5390e(inputStream)) & 255) << 24)) | ((((long) m5390e(inputStream)) & 255) << 32)) | ((((long) m5390e(inputStream)) & 255) << 40)) | ((((long) m5390e(inputStream)) & 255) << 48)) | ((((long) m5390e(inputStream)) & 255) << 56);
    }

    private final synchronized void m5385b(String str) {
        boolean delete = m5388d(str).delete();
        gu guVar = (gu) this.f6066a.get(str);
        if (guVar != null) {
            this.f6067b -= guVar.f6163a;
            this.f6066a.remove(str);
        }
        if (!delete) {
            C1658y.m7017b("Could not delete cache entry for key=%s, filename=%s", str, m5387c(str));
        }
    }

    static String m5386c(InputStream inputStream) {
        return new String(m5383a(inputStream, (int) m5384b(inputStream)), "UTF-8");
    }

    private static String m5387c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File m5388d(String str) {
        return new File(this.f6068c, m5387c(str));
    }

    static Map<String, String> m5389d(InputStream inputStream) {
        int a = m5378a(inputStream);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(m5386c(inputStream).intern(), m5386c(inputStream).intern());
        }
        return emptyMap;
    }

    private static int m5390e(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public final synchronized mf mo2091a(String str) {
        mf mfVar;
        hu huVar;
        IOException e;
        hu huVar2;
        Throwable th;
        NegativeArraySizeException e2;
        gu guVar = (gu) this.f6066a.get(str);
        if (guVar == null) {
            mfVar = null;
        } else {
            File d = m5388d(str);
            try {
                huVar = new hu(new BufferedInputStream(new FileInputStream(d)));
                try {
                    gu.m5566a((InputStream) huVar);
                    byte[] a = m5383a((InputStream) huVar, (int) (d.length() - ((long) huVar.f6225a)));
                    mf mfVar2 = new mf();
                    mfVar2.f6647a = a;
                    mfVar2.f6648b = guVar.f6165c;
                    mfVar2.f6649c = guVar.f6166d;
                    mfVar2.f6650d = guVar.f6167e;
                    mfVar2.f6651e = guVar.f6168f;
                    mfVar2.f6652f = guVar.f6169g;
                    mfVar2.f6653g = guVar.f6170h;
                    try {
                        huVar.close();
                        mfVar = mfVar2;
                    } catch (IOException e3) {
                        mfVar = null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    huVar2 = huVar;
                    try {
                        C1658y.m7017b("%s: %s", d.getAbsolutePath(), e.toString());
                        m5385b(str);
                        if (huVar2 != null) {
                            try {
                                huVar2.close();
                            } catch (IOException e5) {
                                mfVar = null;
                            }
                        }
                        mfVar = null;
                        return mfVar;
                    } catch (Throwable th2) {
                        th = th2;
                        huVar = huVar2;
                        if (huVar != null) {
                            try {
                                huVar.close();
                            } catch (IOException e6) {
                                mfVar = null;
                            }
                        }
                        throw th;
                    }
                } catch (NegativeArraySizeException e7) {
                    e2 = e7;
                    try {
                        C1658y.m7017b("%s: %s", d.getAbsolutePath(), e2.toString());
                        m5385b(str);
                        if (huVar != null) {
                            try {
                                huVar.close();
                            } catch (IOException e8) {
                                mfVar = null;
                            }
                        }
                        mfVar = null;
                        return mfVar;
                    } catch (Throwable th3) {
                        th = th3;
                        if (huVar != null) {
                            huVar.close();
                        }
                        throw th;
                    }
                }
            } catch (IOException e9) {
                e = e9;
                huVar2 = null;
                C1658y.m7017b("%s: %s", d.getAbsolutePath(), e.toString());
                m5385b(str);
                if (huVar2 != null) {
                    huVar2.close();
                }
                mfVar = null;
                return mfVar;
            } catch (NegativeArraySizeException e10) {
                e2 = e10;
                huVar = null;
                C1658y.m7017b("%s: %s", d.getAbsolutePath(), e2.toString());
                m5385b(str);
                if (huVar != null) {
                    huVar.close();
                }
                mfVar = null;
                return mfVar;
            } catch (Throwable th4) {
                th = th4;
                huVar = null;
                if (huVar != null) {
                    huVar.close();
                }
                throw th;
            }
        }
        return mfVar;
    }

    public final synchronized void mo2092a() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        if (this.f6068c.exists()) {
            File[] listFiles = this.f6068c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            gu a = gu.m5566a((InputStream) bufferedInputStream);
                            a.f6163a = file.length();
                            m5382a(a.f6164b, a);
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e) {
                            }
                        } catch (IOException e2) {
                            if (file != null) {
                                try {
                                    file.delete();
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    bufferedInputStream2 = bufferedInputStream;
                                    th = th3;
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e3) {
                                }
                            }
                        }
                    } catch (IOException e4) {
                        bufferedInputStream = null;
                        if (file != null) {
                            file.delete();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
        } else if (!this.f6068c.mkdirs()) {
            C1658y.m7018c("Unable to create cache dir %s", this.f6068c.getAbsolutePath());
        }
        return;
        if (bufferedInputStream2 != null) {
            try {
                bufferedInputStream2.close();
            } catch (IOException e5) {
            }
        }
        throw th;
        throw th;
    }

    public final synchronized void mo2093a(String str, mf mfVar) {
        int i = 0;
        synchronized (this) {
            int length = mfVar.f6647a.length;
            if (this.f6067b + ((long) length) >= ((long) this.f6069d)) {
                int i2;
                if (C1658y.f7464a) {
                    C1658y.m7016a("Pruning old cache entries.", new Object[0]);
                }
                long j = this.f6067b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator it = this.f6066a.entrySet().iterator();
                while (it.hasNext()) {
                    gu guVar = (gu) ((Entry) it.next()).getValue();
                    if (m5388d(guVar.f6164b).delete()) {
                        this.f6067b -= guVar.f6163a;
                    } else {
                        C1658y.m7017b("Could not delete cache entry for key=%s, filename=%s", guVar.f6164b, m5387c(guVar.f6164b));
                    }
                    it.remove();
                    i2 = i + 1;
                    if (((float) (this.f6067b + ((long) length))) < ((float) this.f6069d) * 0.9f) {
                        break;
                    }
                    i = i2;
                }
                i2 = i;
                if (C1658y.f7464a) {
                    C1658y.m7016a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f6067b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
            File d = m5388d(str);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
                gu guVar2 = new gu(str, mfVar);
                if (guVar2.m5567a(bufferedOutputStream)) {
                    bufferedOutputStream.write(mfVar.f6647a);
                    bufferedOutputStream.close();
                    m5382a(str, guVar2);
                } else {
                    bufferedOutputStream.close();
                    C1658y.m7017b("Failed to write header for %s", d.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException e) {
                if (!d.delete()) {
                    C1658y.m7017b("Could not clean up file %s", d.getAbsolutePath());
                }
            }
        }
    }
}
