package com.google.android.gms.internal;

import com.google.android.gms.internal.nu.C1591a;
import com.google.android.gms.internal.nw.C1595a;
import com.google.android.gms.internal.nw.C1595a.C1594a;
import com.google.android.gms.internal.oa.C1608a;
import com.google.android.gms.internal.oa.C1608a.C1607a;
import com.google.android.gms.internal.on.C1622a;
import com.google.android.gms.internal.on.C1622a.C1621a;
import com.google.android.gms.internal.oz.C1637b;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class ps implements op {
    private static final byte[] f6973a = new byte[0];
    private final ECPublicKey f6974b;
    private final qg f6975c;
    private final String f6976d;
    private final byte[] f6977e;
    private final qf f6978f;
    private final pq f6979g;

    public ps(ECPublicKey eCPublicKey, byte[] bArr, String str, C1637b c1637b, od odVar) {
        qf qfVar;
        qc.m6460a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f6974b = eCPublicKey;
        this.f6975c = new qg(eCPublicKey);
        this.f6977e = bArr;
        this.f6976d = str;
        switch (pi.f6959c[odVar.ordinal()]) {
            case 1:
                qfVar = qf.COMPRESSED;
                break;
            case 2:
                qfVar = qf.UNCOMPRESSED;
                break;
            default:
                String valueOf = String.valueOf(odVar);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Unsupported point format:").append(valueOf).toString());
        }
        this.f6978f = qfVar;
        this.f6979g = new pq(c1637b);
    }

    public final byte[] mo2228a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i = 1;
        qg qgVar = this.f6975c;
        String str = this.f6976d;
        byte[] bArr4 = this.f6977e;
        int i2 = this.f6979g.f6966b;
        qf qfVar = this.f6978f;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) qj.f7008d.m6465a("EC");
        keyPairGenerator.initialize(qgVar.f6999a.getParams());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        qc.m6460a(qgVar.f6999a.getW(), qgVar.f6999a.getParams().getCurve());
        KeyAgreement keyAgreement = (KeyAgreement) qj.f7007c.m6465a("ECDH");
        keyAgreement.init(eCPrivateKey);
        keyAgreement.doPhase(qgVar.f6999a, true);
        byte[] generateSecret = keyAgreement.generateSecret();
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        qc.m6460a(w, curve);
        int bitLength = (qc.m6458a(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        Object obj;
        switch (qd.f6992a[qfVar.ordinal()]) {
            case 1:
                obj = new byte[((bitLength * 2) + 1)];
                Object toByteArray = w.getAffineX().toByteArray();
                Object toByteArray2 = w.getAffineY().toByteArray();
                System.arraycopy(toByteArray2, 0, obj, ((bitLength * 2) + 1) - toByteArray2.length, toByteArray2.length);
                System.arraycopy(toByteArray, 0, obj, (bitLength + 1) - toByteArray.length, toByteArray.length);
                obj[0] = (byte) 4;
                bArr3 = obj;
                break;
            case 2:
                bArr3 = new byte[(bitLength + 1)];
                obj = w.getAffineX().toByteArray();
                System.arraycopy(obj, 0, bArr3, (bitLength + 1) - obj.length, obj.length);
                bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                break;
            default:
                String valueOf = String.valueOf(qfVar);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(valueOf).length() + 15).append("invalid format:").append(valueOf).toString());
        }
        generateSecret = qv.m6478a(bArr3, generateSecret);
        Mac mac = (Mac) qj.f7006b.m6465a(str);
        if (i2 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr4 == null || bArr4.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr4, str));
        }
        toByteArray2 = new byte[i2];
        mac.init(new SecretKeySpec(mac.doFinal(generateSecret), str));
        generateSecret = new byte[0];
        int i3 = 0;
        while (true) {
            mac.update(generateSecret);
            mac.update(bArr2);
            mac.update((byte) i);
            generateSecret = mac.doFinal();
            if (generateSecret.length + i3 < i2) {
                System.arraycopy(generateSecret, 0, toByteArray2, i3, generateSecret.length);
                i3 += generateSecret.length;
                i++;
            } else {
                nt ntVar;
                System.arraycopy(generateSecret, 0, toByteArray2, i3, i2 - i3);
                qh qhVar = new qh(bArr3, toByteArray2);
                pq pqVar = this.f6979g;
                bArr3 = qhVar.f7001b;
                if (pqVar.f6965a == pr.f6970a) {
                    ntVar = (nt) oy.f6897a.m6312b("type.googleapis.com/google.cloud.crypto.tink.AesGcmKey", (C1608a) ((C1607a) C1608a.m6197a().m6100a(pqVar.f6967c)).m6196a(ry.m6517a(bArr3)).m6104e());
                } else if (pqVar.f6965a == pr.f6971b) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, pqVar.f6969e);
                    ntVar = (nt) oy.f6897a.m6312b("type.googleapis.com/google.cloud.crypto.tink.AesCtrHmacAeadKey", (C1591a) C1591a.m6130d().m6107a(pqVar.f6968d.f6757a).m6108a((C1595a) ((C1594a) C1595a.m6151b().m6100a(pqVar.f6968d.m6132a())).m6146a(ry.m6517a(copyOfRange)).m6104e()).m6109a((C1622a) ((C1621a) C1622a.m6258b().m6100a(pqVar.f6968d.m6135b())).m6253a(ry.m6517a(Arrays.copyOfRange(bArr3, pqVar.f6969e, pqVar.f6966b))).m6104e()).m6104e());
                } else {
                    throw new GeneralSecurityException("unknown DEM key type");
                }
                byte[] a = ntVar.mo2227a(bArr, f6973a);
                bArr3 = qhVar.f7000a;
                return ByteBuffer.allocate(bArr3.length + a.length).put(bArr3).put(a).array();
            }
        }
    }
}
