package com.rac.stuido.banglakeyboard;

import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

final class C0577l implements Runnable {
    final /* synthetic */ C0570e f2829a;

    private C0577l(C0570e c0570e) {
        this.f2829a = c0570e;
    }

    public final void run() {
        synchronized (this.f2829a.f2806d) {
            List arrayList = new ArrayList(this.f2829a.f2808f);
        }
        try {
            OutputStream openFileOutput = this.f2829a.f2809g.openFileOutput(this.f2829a.f2810h, 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, null);
                newSerializer.startDocument("UTF-8", Boolean.valueOf(true));
                newSerializer.startTag(null, "historical-records");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0574i c0574i = (C0574i) arrayList.remove(0);
                    newSerializer.startTag(null, "historical-record");
                    newSerializer.attribute(null, "activity", c0574i.f2824a.flattenToString());
                    newSerializer.attribute(null, "time", String.valueOf(c0574i.f2825b));
                    newSerializer.attribute(null, "weight", String.valueOf(c0574i.f2826c));
                    newSerializer.endTag(null, "historical-record");
                }
                newSerializer.endTag(null, "historical-records");
                newSerializer.endDocument();
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e) {
                    }
                }
            } catch (IllegalArgumentException e2) {
                C0570e.f2802a;
                "Error writing historical recrod file: " + this.f2829a.f2810h;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (IllegalStateException e4) {
                C0570e.f2802a;
                "Error writing historical recrod file: " + this.f2829a.f2810h;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e5) {
                    }
                }
            } catch (IOException e6) {
                C0570e.f2802a;
                "Error writing historical recrod file: " + this.f2829a.f2810h;
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e7) {
                    }
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e8) {
                    }
                }
            }
        } catch (FileNotFoundException e9) {
            C0570e.f2802a;
            "Error writing historical recrod file: " + this.f2829a.f2810h;
        }
    }
}
