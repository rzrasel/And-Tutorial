package android.support.v4.p016d;

import android.support.v4.p018f.C0499l;
import android.util.Base64;
import java.util.List;

public final class C0444a {
    final String f1429a;
    final String f1430b;
    final String f1431c;
    final List<List<byte[]>> f1432d;
    final int f1433e = 0;
    final String f1434f = new StringBuilder(this.f1429a).append("-").append(this.f1430b).append("-").append(this.f1431c).toString();

    public C0444a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1429a = (String) C0499l.m1295a(str);
        this.f1430b = (String) C0499l.m1295a(str2);
        this.f1431c = (String) C0499l.m1295a(str3);
        this.f1432d = (List) C0499l.m1295a(list);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FontRequest {mProviderAuthority: " + this.f1429a + ", mProviderPackage: " + this.f1430b + ", mQuery: " + this.f1431c + ", mCertificates:");
        for (int i = 0; i < this.f1432d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.f1432d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder.append("mCertificatesArray: " + this.f1433e);
        return stringBuilder.toString();
    }
}
