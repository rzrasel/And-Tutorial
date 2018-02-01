package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

final class ads implements Runnable {
    private /* synthetic */ adr f4930a;

    ads(adr com_google_android_gms_internal_adr) {
        this.f4930a = com_google_android_gms_internal_adr;
    }

    public final void run() {
        Throwable e;
        adr com_google_android_gms_internal_adr = this.f4930a;
        while (true) {
            FileOutputStream fileOutputStream;
            try {
                aec com_google_android_gms_internal_aec = (aec) com_google_android_gms_internal_adr.f4921a.take();
                Object b = com_google_android_gms_internal_aec.m4238b();
                if (!TextUtils.isEmpty(b)) {
                    Map a = com_google_android_gms_internal_adr.m4223a(com_google_android_gms_internal_adr.f4922b, com_google_android_gms_internal_aec.m4239c());
                    Builder buildUpon = Uri.parse(com_google_android_gms_internal_adr.f4923c).buildUpon();
                    for (Entry entry : a.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
                    stringBuilder.append("&it=").append(b);
                    String stringBuilder2 = stringBuilder.toString();
                    if (com_google_android_gms_internal_adr.f4926f.get()) {
                        File file = com_google_android_gms_internal_adr.f4927g;
                        if (file != null) {
                            try {
                                fileOutputStream = new FileOutputStream(file, true);
                                try {
                                    fileOutputStream.write(stringBuilder2.getBytes());
                                    fileOutputStream.write(10);
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable e2) {
                                        id.m5371a("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                                    }
                                } catch (IOException e3) {
                                    e2 = e3;
                                    try {
                                        id.m5371a("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e2);
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable e22) {
                                                id.m5371a("CsiReporter: Cannot close file: sdk_csi_data.txt.", e22);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        e22 = th;
                                    }
                                }
                            } catch (IOException e4) {
                                e22 = e4;
                                fileOutputStream = null;
                                id.m5371a("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e22);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Throwable th2) {
                                e22 = th2;
                                fileOutputStream = null;
                            }
                        } else {
                            id.m5370a("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        zzbv.zzea();
                        gb.m5472b(com_google_android_gms_internal_adr.f4924d, com_google_android_gms_internal_adr.f4925e, stringBuilder2);
                    }
                }
            } catch (Throwable e222) {
                id.m5371a("CsiReporter:reporter interrupted", e222);
                return;
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable e5) {
                id.m5371a("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
            }
        }
        throw e222;
        throw e222;
    }
}
