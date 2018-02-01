package com.google.android.gms.games.request;

import android.os.Parcelable;
import com.google.android.gms.common.data.C0245d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import java.util.List;

public interface GameRequest extends Parcelable, C0245d {
    int mo765a(String str);

    String mo766d();

    Game mo767e();

    Player mo768f();

    byte[] mo769g();

    int mo770h();

    long mo771i();

    long mo772j();

    int mo773k();

    List mo774l();
}
