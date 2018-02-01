package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.Sensor;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ade;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.id;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
@aqv
public final class zzap extends Thread implements OnFrameAvailableListener, C1452g {
    private static final float[] f4169a = new float[]{-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean f4170A;
    private volatile boolean f4171B;
    private final C1450e f4172b;
    private final float[] f4173c;
    private final float[] f4174d;
    private final float[] f4175e;
    private final float[] f4176f;
    private final float[] f4177g;
    private final float[] f4178h;
    private final float[] f4179i;
    private float f4180j;
    private float f4181k;
    private float f4182l;
    private int f4183m;
    private int f4184n;
    private SurfaceTexture f4185o;
    private SurfaceTexture f4186p;
    private int f4187q;
    private int f4188r;
    private int f4189s;
    private FloatBuffer f4190t = ByteBuffer.allocateDirect(f4169a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private final CountDownLatch f4191u;
    private final Object f4192v;
    private EGL10 f4193w;
    private EGLDisplay f4194x;
    private EGLContext f4195y;
    private EGLSurface f4196z;

    public zzap(Context context) {
        super("SphericalVideoProcessor");
        this.f4190t.put(f4169a).position(0);
        this.f4173c = new float[9];
        this.f4174d = new float[9];
        this.f4175e = new float[9];
        this.f4176f = new float[9];
        this.f4177g = new float[9];
        this.f4178h = new float[9];
        this.f4179i = new float[9];
        this.f4180j = Float.NaN;
        this.f4172b = new C1450e(context);
        this.f4172b.f4122c = this;
        this.f4191u = new CountDownLatch(1);
        this.f4192v = new Object();
    }

    private static int m3678a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m3680a("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m3680a("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m3680a("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m3680a("getShaderiv");
            if (iArr[0] == 0) {
                new StringBuilder(37).append("Could not compile shader ").append(i).append(":");
                GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                m3680a("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    private final void m3679a() {
        while (this.f4189s > 0) {
            this.f4185o.updateTexImage();
            this.f4189s--;
        }
        if (this.f4172b.m3668a(this.f4173c)) {
            if (Float.isNaN(this.f4180j)) {
                float[] fArr = this.f4173c;
                float[] fArr2 = new float[]{0.0f, 1.0f, 0.0f};
                float[] fArr3 = new float[3];
                fArr3[0] = ((fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1])) + (fArr[2] * fArr2[2]);
                fArr3[1] = ((fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1])) + (fArr[5] * fArr2[2]);
                fArr3[2] = (fArr[8] * fArr2[2]) + ((fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1]));
                this.f4180j = -(((float) Math.atan2((double) fArr3[1], (double) fArr3[0])) - 1.5707964f);
            }
            m3683b(this.f4178h, this.f4180j + this.f4181k);
        } else {
            m3681a(this.f4173c, -1.5707964f);
            m3683b(this.f4178h, this.f4181k);
        }
        m3681a(this.f4174d, 1.5707964f);
        m3682a(this.f4175e, this.f4178h, this.f4174d);
        m3682a(this.f4176f, this.f4173c, this.f4175e);
        m3681a(this.f4177g, this.f4182l);
        m3682a(this.f4179i, this.f4177g, this.f4176f);
        GLES20.glUniformMatrix3fv(this.f4188r, 1, false, this.f4179i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m3680a("drawArrays");
        GLES20.glFinish();
        this.f4193w.eglSwapBuffers(this.f4194x, this.f4196z);
    }

    private static void m3680a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            new StringBuilder(String.valueOf(str).length() + 21).append(str).append(": glError ").append(glGetError);
        }
    }

    private static void m3681a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = (float) Math.cos((double) f);
        fArr[5] = (float) (-Math.sin((double) f));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin((double) f);
        fArr[8] = (float) Math.cos((double) f);
    }

    private static void m3682a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = ((fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3])) + (fArr2[2] * fArr3[6]);
        fArr[1] = ((fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4])) + (fArr2[2] * fArr3[7]);
        fArr[2] = ((fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5])) + (fArr2[2] * fArr3[8]);
        fArr[3] = ((fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3])) + (fArr2[5] * fArr3[6]);
        fArr[4] = ((fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4])) + (fArr2[5] * fArr3[7]);
        fArr[5] = ((fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5])) + (fArr2[5] * fArr3[8]);
        fArr[6] = ((fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3])) + (fArr2[8] * fArr3[6]);
        fArr[7] = ((fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4])) + (fArr2[8] * fArr3[7]);
        fArr[8] = ((fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5])) + (fArr2[8] * fArr3[8]);
    }

    private static void m3683b(float[] fArr, float f) {
        fArr[0] = (float) Math.cos((double) f);
        fArr[1] = (float) (-Math.sin((double) f));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin((double) f);
        fArr[4] = (float) Math.cos((double) f);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private final boolean m3684b() {
        boolean z = false;
        if (!(this.f4196z == null || this.f4196z == EGL10.EGL_NO_SURFACE)) {
            z = (this.f4193w.eglMakeCurrent(this.f4194x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | 0) | this.f4193w.eglDestroySurface(this.f4194x, this.f4196z);
            this.f4196z = null;
        }
        if (this.f4195y != null) {
            z |= this.f4193w.eglDestroyContext(this.f4194x, this.f4195y);
            this.f4195y = null;
        }
        if (this.f4194x == null) {
            return z;
        }
        z |= this.f4193w.eglTerminate(this.f4194x);
        this.f4194x = null;
        return z;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4189s++;
        synchronized (this.f4192v) {
            this.f4192v.notifyAll();
        }
    }

    public final void run() {
        int i = 1;
        if (this.f4186p == null) {
            id.m5372a(6);
            this.f4191u.countDown();
            return;
        }
        boolean z;
        int i2;
        this.f4193w = (EGL10) EGLContext.getEGL();
        this.f4194x = this.f4193w.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.f4194x == EGL10.EGL_NO_DISPLAY) {
            z = false;
        } else {
            if (this.f4193w.eglInitialize(this.f4194x, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (!this.f4193w.eglChooseConfig(this.f4194x, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) || iArr[0] <= 0) ? null : eGLConfigArr[0];
                if (eGLConfig == null) {
                    z = false;
                } else {
                    this.f4195y = this.f4193w.eglCreateContext(this.f4194x, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    if (this.f4195y == null || this.f4195y == EGL10.EGL_NO_CONTEXT) {
                        z = false;
                    } else {
                        this.f4196z = this.f4193w.eglCreateWindowSurface(this.f4194x, eGLConfig, this.f4186p, null);
                        z = (this.f4196z == null || this.f4196z == EGL10.EGL_NO_SURFACE) ? false : this.f4193w.eglMakeCurrent(this.f4194x, this.f4196z, this.f4196z, this.f4195y);
                    }
                }
            } else {
                z = false;
            }
        }
        ade com_google_android_gms_internal_ade = ado.aS;
        int a = m3678a(35633, !((String) zzbv.zzen().m4217a(com_google_android_gms_internal_ade)).equals(com_google_android_gms_internal_ade.f4852c) ? (String) zzbv.zzen().m4217a(com_google_android_gms_internal_ade) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (a == 0) {
            i2 = 0;
        } else {
            ade com_google_android_gms_internal_ade2 = ado.aT;
            int a2 = m3678a(35632, !((String) zzbv.zzen().m4217a(com_google_android_gms_internal_ade2)).equals(com_google_android_gms_internal_ade2.f4852c) ? (String) zzbv.zzen().m4217a(com_google_android_gms_internal_ade2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (a2 == 0) {
                i2 = 0;
            } else {
                i2 = GLES20.glCreateProgram();
                m3680a("createProgram");
                if (i2 != 0) {
                    GLES20.glAttachShader(i2, a);
                    m3680a("attachShader");
                    GLES20.glAttachShader(i2, a2);
                    m3680a("attachShader");
                    GLES20.glLinkProgram(i2);
                    m3680a("linkProgram");
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(i2, 35714, iArr2, 0);
                    m3680a("getProgramiv");
                    if (iArr2[0] != 1) {
                        GLES20.glGetProgramInfoLog(i2);
                        GLES20.glDeleteProgram(i2);
                        m3680a("deleteProgram");
                        i2 = 0;
                    } else {
                        GLES20.glValidateProgram(i2);
                        m3680a("validateProgram");
                    }
                }
            }
        }
        this.f4187q = i2;
        GLES20.glUseProgram(this.f4187q);
        m3680a("useProgram");
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f4187q, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, this.f4190t);
        m3680a("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        m3680a("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        m3680a("genTextures");
        i2 = iArr3[0];
        GLES20.glBindTexture(36197, i2);
        m3680a("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        m3680a("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m3680a("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m3680a("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m3680a("texParameteri");
        this.f4188r = GLES20.glGetUniformLocation(this.f4187q, "uVMat");
        GLES20.glUniformMatrix3fv(this.f4188r, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        if (this.f4187q == 0) {
            i = 0;
        }
        if (!z || r4 == 0) {
            String str = "EGL initialization failed: ";
            String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.f4193w.eglGetError()));
            valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            id.m5372a(6);
            zzbv.zzee().m5336a(new Throwable(valueOf), "SphericalVideoProcessor.run.1");
            m3684b();
            this.f4191u.countDown();
            return;
        }
        this.f4185o = new SurfaceTexture(i2);
        this.f4185o.setOnFrameAvailableListener(this);
        this.f4191u.countDown();
        Object obj = this.f4172b;
        if (obj.f4121b == null) {
            Sensor defaultSensor = obj.f4120a.getDefaultSensor(11);
            if (defaultSensor == null) {
                id.m5372a(6);
            } else {
                HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                handlerThread.start();
                obj.f4121b = new Handler(handlerThread.getLooper());
                if (!obj.f4120a.registerListener(obj, defaultSensor, 0, obj.f4121b)) {
                    id.m5372a(6);
                    obj.m3667a();
                }
            }
        }
        try {
            this.f4170A = true;
            while (!this.f4171B) {
                m3679a();
                if (this.f4170A) {
                    GLES20.glViewport(0, 0, this.f4184n, this.f4183m);
                    m3680a("viewport");
                    i2 = GLES20.glGetUniformLocation(this.f4187q, "uFOVx");
                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.f4187q, "uFOVy");
                    if (this.f4184n > this.f4183m) {
                        GLES20.glUniform1f(i2, 0.87266463f);
                        GLES20.glUniform1f(glGetUniformLocation, (0.87266463f * ((float) this.f4183m)) / ((float) this.f4184n));
                    } else {
                        GLES20.glUniform1f(i2, (0.87266463f * ((float) this.f4184n)) / ((float) this.f4183m));
                        GLES20.glUniform1f(glGetUniformLocation, 0.87266463f);
                    }
                    this.f4170A = false;
                }
                try {
                    synchronized (this.f4192v) {
                        if (!(this.f4171B || this.f4170A || this.f4189s != 0)) {
                            this.f4192v.wait();
                        }
                    }
                } catch (InterruptedException e) {
                }
            }
        } catch (IllegalStateException e2) {
            id.m5370a("SphericalVideoProcessor halted unexpectedly.");
        } catch (Throwable th) {
            id.m5372a(6);
            zzbv.zzee().m5336a(th, "SphericalVideoProcessor.run.2");
        } finally {
            this.f4172b.m3667a();
            this.f4185o.setOnFrameAvailableListener(null);
            this.f4185o = null;
            m3684b();
        }
    }

    public final void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f4184n = i;
        this.f4183m = i2;
        this.f4186p = surfaceTexture;
    }

    public final void zzb(float f, float f2) {
        float f3;
        float f4;
        if (this.f4184n > this.f4183m) {
            f3 = (1.7453293f * f) / ((float) this.f4184n);
            f4 = (1.7453293f * f2) / ((float) this.f4184n);
        } else {
            f3 = (1.7453293f * f) / ((float) this.f4183m);
            f4 = (1.7453293f * f2) / ((float) this.f4183m);
        }
        this.f4181k -= f3;
        this.f4182l -= f4;
        if (this.f4182l < -1.5707964f) {
            this.f4182l = -1.5707964f;
        }
        if (this.f4182l > 1.5707964f) {
            this.f4182l = 1.5707964f;
        }
    }

    public final void zzf(int i, int i2) {
        synchronized (this.f4192v) {
            this.f4184n = i;
            this.f4183m = i2;
            this.f4170A = true;
            this.f4192v.notifyAll();
        }
    }

    public final void zzmr() {
        synchronized (this.f4192v) {
            this.f4192v.notifyAll();
        }
    }

    public final void zzni() {
        synchronized (this.f4192v) {
            this.f4171B = true;
            this.f4186p = null;
            this.f4192v.notifyAll();
        }
    }

    public final SurfaceTexture zznj() {
        if (this.f4186p == null) {
            return null;
        }
        try {
            this.f4191u.await();
        } catch (InterruptedException e) {
        }
        return this.f4185o;
    }
}
