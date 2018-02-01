package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;

final class gu {
    public long f6163a;
    public String f6164b;
    public String f6165c;
    public long f6166d;
    public long f6167e;
    public long f6168f;
    public long f6169g;
    public Map<String, String> f6170h;

    private gu() {
    }

    public gu(String str, mf mfVar) {
        this.f6164b = str;
        this.f6163a = (long) mfVar.f6647a.length;
        this.f6165c = mfVar.f6648b;
        this.f6166d = mfVar.f6649c;
        this.f6167e = mfVar.f6650d;
        this.f6168f = mfVar.f6651e;
        this.f6169g = mfVar.f6652f;
        this.f6170h = mfVar.f6653g;
    }

    public static gu m5566a(InputStream inputStream) {
        gu guVar = new gu();
        if (ev.m5378a(inputStream) != 538247942) {
            throw new IOException();
        }
        guVar.f6164b = ev.m5386c(inputStream);
        guVar.f6165c = ev.m5386c(inputStream);
        if (guVar.f6165c.equals("")) {
            guVar.f6165c = null;
        }
        guVar.f6166d = ev.m5384b(inputStream);
        guVar.f6167e = ev.m5384b(inputStream);
        guVar.f6168f = ev.m5384b(inputStream);
        guVar.f6169g = ev.m5384b(inputStream);
        guVar.f6170h = ev.m5389d(inputStream);
        return guVar;
    }

    public final boolean m5567a(OutputStream outputStream) {
        try {
            ev.m5379a(outputStream, 538247942);
            ev.m5381a(outputStream, this.f6164b);
            ev.m5381a(outputStream, this.f6165c == null ? "" : this.f6165c);
            ev.m5380a(outputStream, this.f6166d);
            ev.m5380a(outputStream, this.f6167e);
            ev.m5380a(outputStream, this.f6168f);
            ev.m5380a(outputStream, this.f6169g);
            Map map = this.f6170h;
            if (map != null) {
                ev.m5379a(outputStream, map.size());
                for (Entry entry : map.entrySet()) {
                    ev.m5381a(outputStream, (String) entry.getKey());
                    ev.m5381a(outputStream, (String) entry.getValue());
                }
            } else {
                ev.m5379a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            C1658y.m7017b("%s", e.toString());
            return false;
        }
    }
}
