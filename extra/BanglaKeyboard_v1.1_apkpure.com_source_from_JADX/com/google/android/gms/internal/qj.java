package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public class qj<T_WRAPPER extends qk<T_ENGINE>, T_ENGINE> {
    public static final qj<ql, Cipher> f7005a = new qj(new ql());
    public static final qj<qp, Mac> f7006b = new qj(new qp());
    public static final qj<qm, KeyAgreement> f7007c = new qj(new qm());
    public static final qj<qo, KeyPairGenerator> f7008d = new qj(new qo());
    private static final Logger f7009e = Logger.getLogger(qj.class.getName());
    private static final List<Provider> f7010f;
    private static qj<qr, Signature> f7011g = new qj(new qr());
    private static qj<qq, MessageDigest> f7012h = new qj(new qq());
    private static qj<qn, KeyFactory> f7013i = new qj(new qn());
    private T_WRAPPER f7014j;
    private List<Provider> f7015k = f7010f;
    private boolean f7016l = true;

    static {
        if (qv.m6477a()) {
            String[] strArr = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"};
            List arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                Provider provider = Security.getProvider(strArr[i]);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f7009e.logp(Level.INFO, "com.google.cloud.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{r4}));
                }
            }
            f7010f = arrayList;
        } else {
            f7010f = new ArrayList();
        }
    }

    private qj(T_WRAPPER t_wrapper) {
        this.f7014j = t_wrapper;
    }

    private final boolean m6464a(String str, Provider provider) {
        try {
            this.f7014j.mo2230a(str, provider);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public final T_ENGINE m6465a(String str) {
        for (Provider provider : this.f7015k) {
            if (m6464a(str, provider)) {
                return this.f7014j.mo2230a(str, provider);
            }
        }
        if (this.f7016l) {
            return this.f7014j.mo2230a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
