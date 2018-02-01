package android.support.v4.content;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

final class C0042c implements C0041b {
    final HashMap f45a = new HashMap();
    private final String f46b;

    public C0042c(String str) {
        this.f46b = str;
    }

    public final File mo143a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f45a.get(decode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (canonicalFile.getPath().startsWith(file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
