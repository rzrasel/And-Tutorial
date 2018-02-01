package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.C0245d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.C0337f;

public interface TurnBasedMatch extends Parcelable, C0245d, C0337f {
    public static final int[] a_ = new int[]{0, 1, 2, 3};

    Game mo801b();

    String mo802c();

    String mo803d();

    long mo804e();

    int mo805f();

    int mo806g();

    String mo807h();

    int mo808i();

    String mo809j();

    long mo810l();

    String mo811m();

    byte[] mo812n();

    int mo813o();

    String mo814p();

    byte[] mo815q();

    int mo816r();

    Bundle mo817s();

    int mo818t();

    boolean mo819u();

    String mo820v();
}
