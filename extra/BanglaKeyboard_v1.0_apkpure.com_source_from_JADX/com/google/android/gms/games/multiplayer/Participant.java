package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.C0245d;
import com.google.android.gms.games.Player;

public interface Participant extends Parcelable, C0245d {
    int mo775b();

    String mo776c();

    int mo777d();

    boolean mo778e();

    String mo779f();

    Uri mo780g();

    @Deprecated
    String mo781h();

    Uri mo782i();

    @Deprecated
    String mo783j();

    String mo784k();

    Player mo785l();

    ParticipantResult mo786m();
}
