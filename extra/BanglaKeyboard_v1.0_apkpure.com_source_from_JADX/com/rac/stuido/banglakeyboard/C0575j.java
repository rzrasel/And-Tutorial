package com.rac.stuido.banglakeyboard;

final class C0575j implements Runnable {
    final /* synthetic */ C0570e f2827a;

    private C0575j(C0570e c0570e) {
        this.f2827a = c0570e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r9 = this;
        r8 = 1;
        r0 = r9.f2827a;	 Catch:{ FileNotFoundException -> 0x0131 }
        r0 = r0.f2809g;	 Catch:{ FileNotFoundException -> 0x0131 }
        r1 = r9.f2827a;	 Catch:{ FileNotFoundException -> 0x0131 }
        r1 = r1.f2810h;	 Catch:{ FileNotFoundException -> 0x0131 }
        r2 = r0.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x0131 }
        r1 = android.util.Xml.newPullParser();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r0 = 0;
        r1.setInput(r2, r0);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r0 = 0;
    L_0x001a:
        if (r0 == r8) goto L_0x0024;
    L_0x001c:
        r3 = 2;
        if (r0 == r3) goto L_0x0024;
    L_0x001f:
        r0 = r1.next();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        goto L_0x001a;
    L_0x0024:
        r0 = "historical-records";
        r3 = r1.getName();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r0 = r0.equals(r3);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        if (r0 != 0) goto L_0x0056;
    L_0x0030:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r1 = "Share records file does not start with historical-records tag.";
        r0.<init>(r1);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
    L_0x0038:
        r0 = move-exception;
        com.rac.stuido.banglakeyboard.C0570e.f2802a;	 Catch:{ all -> 0x00c1 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c1 }
        r1 = "Error reading historical recrod file: ";
        r0.<init>(r1);	 Catch:{ all -> 0x00c1 }
        r1 = r9.f2827a;	 Catch:{ all -> 0x00c1 }
        r1 = r1.f2810h;	 Catch:{ all -> 0x00c1 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00c1 }
        r0.toString();	 Catch:{ all -> 0x00c1 }
        if (r2 == 0) goto L_0x0055;
    L_0x0052:
        r2.close();	 Catch:{ IOException -> 0x012c }
    L_0x0055:
        return;
    L_0x0056:
        r0 = new java.util.ArrayList;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r0.<init>();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
    L_0x005b:
        r3 = r1.next();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        if (r3 == r8) goto L_0x00c8;
    L_0x0061:
        r4 = 3;
        if (r3 == r4) goto L_0x005b;
    L_0x0064:
        r4 = 4;
        if (r3 == r4) goto L_0x005b;
    L_0x0067:
        r3 = r1.getName();	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r4 = "historical-record";
        r3 = r4.equals(r3);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        if (r3 != 0) goto L_0x009b;
    L_0x0073:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r1 = "Share records file not well-formed.";
        r0.<init>(r1);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        com.rac.stuido.banglakeyboard.C0570e.f2802a;	 Catch:{ all -> 0x00c1 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c1 }
        r1 = "Error reading historical recrod file: ";
        r0.<init>(r1);	 Catch:{ all -> 0x00c1 }
        r1 = r9.f2827a;	 Catch:{ all -> 0x00c1 }
        r1 = r1.f2810h;	 Catch:{ all -> 0x00c1 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00c1 }
        r0.toString();	 Catch:{ all -> 0x00c1 }
        if (r2 == 0) goto L_0x0055;
    L_0x0095:
        r2.close();	 Catch:{ IOException -> 0x0099 }
        goto L_0x0055;
    L_0x0099:
        r0 = move-exception;
        goto L_0x0055;
    L_0x009b:
        r3 = 0;
        r4 = "activity";
        r3 = r1.getAttributeValue(r3, r4);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r4 = 0;
        r5 = "time";
        r4 = r1.getAttributeValue(r4, r5);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r6 = 0;
        r7 = "weight";
        r6 = r1.getAttributeValue(r6, r7);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r6 = java.lang.Float.parseFloat(r6);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r7 = new com.rac.stuido.banglakeyboard.i;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r7.<init>(r3, r4, r6);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r0.add(r7);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        goto L_0x005b;
    L_0x00c1:
        r0 = move-exception;
        if (r2 == 0) goto L_0x00c7;
    L_0x00c4:
        r2.close();	 Catch:{ IOException -> 0x012f }
    L_0x00c7:
        throw r0;
    L_0x00c8:
        r1 = r9.f2827a;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r3 = r1.f2806d;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        monitor-enter(r3);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        r4 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x0129 }
        r4.<init>(r0);	 Catch:{ all -> 0x0129 }
        r0 = r9.f2827a;	 Catch:{ all -> 0x0129 }
        r5 = r0.f2808f;	 Catch:{ all -> 0x0129 }
        r0 = r5.size();	 Catch:{ all -> 0x0129 }
        r0 = r0 + -1;
        r1 = r0;
    L_0x00e1:
        if (r1 < 0) goto L_0x00f0;
    L_0x00e3:
        r0 = r5.get(r1);	 Catch:{ all -> 0x0129 }
        r0 = (com.rac.stuido.banglakeyboard.C0574i) r0;	 Catch:{ all -> 0x0129 }
        r4.add(r0);	 Catch:{ all -> 0x0129 }
        r0 = r1 + -1;
        r1 = r0;
        goto L_0x00e1;
    L_0x00f0:
        r0 = r5.size();	 Catch:{ all -> 0x0129 }
        r1 = r4.size();	 Catch:{ all -> 0x0129 }
        if (r0 != r1) goto L_0x0105;
    L_0x00fa:
        monitor-exit(r3);	 Catch:{ all -> 0x0129 }
        if (r2 == 0) goto L_0x0055;
    L_0x00fd:
        r2.close();	 Catch:{ IOException -> 0x0102 }
        goto L_0x0055;
    L_0x0102:
        r0 = move-exception;
        goto L_0x0055;
    L_0x0105:
        r5.clear();	 Catch:{ all -> 0x0129 }
        r5.addAll(r4);	 Catch:{ all -> 0x0129 }
        r0 = r9.f2827a;	 Catch:{ all -> 0x0129 }
        r0.f2816n = true;	 Catch:{ all -> 0x0129 }
        r0 = r9.f2827a;	 Catch:{ all -> 0x0129 }
        r0 = r0.f2817o;	 Catch:{ all -> 0x0129 }
        r1 = new com.rac.stuido.banglakeyboard.k;	 Catch:{ all -> 0x0129 }
        r1.<init>(r9);	 Catch:{ all -> 0x0129 }
        r0.post(r1);	 Catch:{ all -> 0x0129 }
        monitor-exit(r3);	 Catch:{ all -> 0x0129 }
        if (r2 == 0) goto L_0x0055;
    L_0x0121:
        r2.close();	 Catch:{ IOException -> 0x0126 }
        goto L_0x0055;
    L_0x0126:
        r0 = move-exception;
        goto L_0x0055;
    L_0x0129:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x007b }
    L_0x012c:
        r0 = move-exception;
        goto L_0x0055;
    L_0x012f:
        r1 = move-exception;
        goto L_0x00c7;
    L_0x0131:
        r0 = move-exception;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rac.stuido.banglakeyboard.j.run():void");
    }
}
