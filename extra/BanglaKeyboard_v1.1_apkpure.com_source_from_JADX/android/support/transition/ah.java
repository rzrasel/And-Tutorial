package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ah {
    public final Map<String, Object> f1273a = new HashMap();
    public View f1274b;
    final ArrayList<Transition> f1275c = new ArrayList();

    public final boolean equals(Object obj) {
        return (obj instanceof ah) && this.f1274b == ((ah) obj).f1274b && this.f1273a.equals(((ah) obj).f1273a);
    }

    public final int hashCode() {
        return (this.f1274b.hashCode() * 31) + this.f1273a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1274b + "\n") + "    values:";
        String str2 = str;
        for (String str3 : this.f1273a.keySet()) {
            str2 = str2 + "    " + str3 + ": " + this.f1273a.get(str3) + "\n";
        }
        return str2;
    }
}
