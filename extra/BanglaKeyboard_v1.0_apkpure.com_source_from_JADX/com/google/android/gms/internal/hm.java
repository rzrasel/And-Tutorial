package com.google.android.gms.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class hm implements SafeParcelable {
    public static final hm f1584A = m2162a("courthouse");
    public static final hm f1585B = m2162a("dentist");
    public static final hm f1586C = m2162a("department_store");
    public static final lf CREATOR = new lf();
    public static final hm f1587D = m2162a("doctor");
    public static final hm f1588E = m2162a("electrician");
    public static final hm f1589F = m2162a("electronics_store");
    public static final hm f1590G = m2162a("embassy");
    public static final hm f1591H = m2162a("establishment");
    public static final hm f1592I = m2162a("finance");
    public static final hm f1593J = m2162a("fire_station");
    public static final hm f1594K = m2162a("florist");
    public static final hm f1595L = m2162a("food");
    public static final hm f1596M = m2162a("funeral_home");
    public static final hm f1597N = m2162a("furniture_store");
    public static final hm f1598O = m2162a("gas_station");
    public static final hm f1599P = m2162a("general_contractor");
    public static final hm f1600Q = m2162a("grocery_or_supermarket");
    public static final hm f1601R = m2162a("gym");
    public static final hm f1602S = m2162a("hair_care");
    public static final hm f1603T = m2162a("hardware_store");
    public static final hm f1604U = m2162a("health");
    public static final hm f1605V = m2162a("hindu_temple");
    public static final hm f1606W = m2162a("home_goods_store");
    public static final hm f1607X = m2162a("hospital");
    public static final hm f1608Y = m2162a("insurance_agency");
    public static final hm f1609Z = m2162a("jewelry_store");
    public static final hm f1610a = m2162a("accounting");
    public static final hm aA = m2162a("restaurant");
    public static final hm aB = m2162a("roofing_contractor");
    public static final hm aC = m2162a("rv_park");
    public static final hm aD = m2162a("school");
    public static final hm aE = m2162a("shoe_store");
    public static final hm aF = m2162a("shopping_mall");
    public static final hm aG = m2162a("spa");
    public static final hm aH = m2162a("stadium");
    public static final hm aI = m2162a("storage");
    public static final hm aJ = m2162a("store");
    public static final hm aK = m2162a("subway_station");
    public static final hm aL = m2162a("synagogue");
    public static final hm aM = m2162a("taxi_stand");
    public static final hm aN = m2162a("train_station");
    public static final hm aO = m2162a("travel_agency");
    public static final hm aP = m2162a("university");
    public static final hm aQ = m2162a("veterinary_care");
    public static final hm aR = m2162a("zoo");
    public static final hm aS = m2162a("administrative_area_level_1");
    public static final hm aT = m2162a("administrative_area_level_2");
    public static final hm aU = m2162a("administrative_area_level_3");
    public static final hm aV = m2162a("colloquial_area");
    public static final hm aW = m2162a("country");
    public static final hm aX = m2162a("floor");
    public static final hm aY = m2162a("geocode");
    public static final hm aZ = m2162a("intersection");
    public static final hm aa = m2162a("laundry");
    public static final hm ab = m2162a("lawyer");
    public static final hm ac = m2162a("library");
    public static final hm ad = m2162a("liquor_store");
    public static final hm ae = m2162a("local_government_office");
    public static final hm af = m2162a("locksmith");
    public static final hm ag = m2162a("lodging");
    public static final hm ah = m2162a("meal_delivery");
    public static final hm ai = m2162a("meal_takeaway");
    public static final hm aj = m2162a("mosque");
    public static final hm ak = m2162a("movie_rental");
    public static final hm al = m2162a("movie_theater");
    public static final hm am = m2162a("moving_company");
    public static final hm an = m2162a("museum");
    public static final hm ao = m2162a("night_club");
    public static final hm ap = m2162a("painter");
    public static final hm aq = m2162a("park");
    public static final hm ar = m2162a("parking");
    public static final hm as = m2162a("pet_store");
    public static final hm at = m2162a("pharmacy");
    public static final hm au = m2162a("physiotherapist");
    public static final hm av = m2162a("place_of_worship");
    public static final hm aw = m2162a("plumber");
    public static final hm ax = m2162a("police");
    public static final hm ay = m2162a("post_office");
    public static final hm az = m2162a("real_estate_agency");
    public static final hm f1611b = m2162a("airport");
    public static final hm ba = m2162a("locality");
    public static final hm bb = m2162a("natural_feature");
    public static final hm bc = m2162a("neighborhood");
    public static final hm bd = m2162a("political");
    public static final hm be = m2162a("point_of_interest");
    public static final hm bf = m2162a("post_box");
    public static final hm bg = m2162a("postal_code");
    public static final hm bh = m2162a("postal_code_prefix");
    public static final hm bi = m2162a("postal_town");
    public static final hm bj = m2162a("premise");
    public static final hm bk = m2162a("room");
    public static final hm bl = m2162a("route");
    public static final hm bm = m2162a("street_address");
    public static final hm bn = m2162a("sublocality");
    public static final hm bo = m2162a("sublocality_level_1");
    public static final hm bp = m2162a("sublocality_level_2");
    public static final hm bq = m2162a("sublocality_level_3");
    public static final hm br = m2162a("sublocality_level_4");
    public static final hm bs = m2162a("sublocality_level_5");
    public static final hm bt = m2162a("subpremise");
    public static final hm bu = m2162a("transit_station");
    public static final hm bv = m2162a("other");
    public static final hm f1612c = m2162a("amusement_park");
    public static final hm f1613d = m2162a("aquarium");
    public static final hm f1614e = m2162a("art_gallery");
    public static final hm f1615f = m2162a("atm");
    public static final hm f1616g = m2162a("bakery");
    public static final hm f1617h = m2162a("bank");
    public static final hm f1618i = m2162a("bar");
    public static final hm f1619j = m2162a("beauty_salon");
    public static final hm f1620k = m2162a("bicycle_store");
    public static final hm f1621l = m2162a("book_store");
    public static final hm f1622m = m2162a("bowling_alley");
    public static final hm f1623n = m2162a("bus_station");
    public static final hm f1624o = m2162a("cafe");
    public static final hm f1625p = m2162a("campground");
    public static final hm f1626q = m2162a("car_dealer");
    public static final hm f1627r = m2162a("car_rental");
    public static final hm f1628s = m2162a("car_repair");
    public static final hm f1629t = m2162a("car_wash");
    public static final hm f1630u = m2162a("casino");
    public static final hm f1631v = m2162a("cemetery");
    public static final hm f1632w = m2162a("church");
    public static final hm f1633x = m2162a("city_hall");
    public static final hm f1634y = m2162a("clothing_store");
    public static final hm f1635z = m2162a("convenience_store");
    final int bw;
    final String bx;

    hm(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.bw = i;
        this.bx = str;
    }

    private static hm m2162a(String str) {
        return new hm(0, str);
    }

    public final int describeContents() {
        lf lfVar = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hm) && this.bx.equals(((hm) obj).bx);
    }

    public final int hashCode() {
        return this.bx.hashCode();
    }

    public final String toString() {
        return this.bx;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        lf lfVar = CREATOR;
        lf.m2534a(this, parcel);
    }
}
