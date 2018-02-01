package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.aqv;

@aqv
final class C1450e implements SensorEventListener {
    final SensorManager f4120a;
    Handler f4121b;
    C1452g f4122c;
    private final Object f4123d = new Object();
    private final Display f4124e;
    private final float[] f4125f = new float[9];
    private final float[] f4126g = new float[9];
    private float[] f4127h;

    C1450e(Context context) {
        this.f4120a = (SensorManager) context.getSystemService("sensor");
        this.f4124e = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void m3666a(int i, int i2) {
        float f = this.f4126g[i];
        this.f4126g[i] = this.f4126g[i2];
        this.f4126g[i2] = f;
    }

    final void m3667a() {
        if (this.f4121b != null) {
            this.f4120a.unregisterListener(this);
            this.f4121b.post(new C1451f());
            this.f4121b = null;
        }
    }

    final boolean m3668a(float[] fArr) {
        boolean z = false;
        synchronized (this.f4123d) {
            if (this.f4127h == null) {
            } else {
                System.arraycopy(this.f4127h, 0, fArr, 0, this.f4127h.length);
                z = true;
            }
        }
        return z;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f4123d) {
                if (this.f4127h == null) {
                    this.f4127h = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f4125f, fArr);
            switch (this.f4124e.getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f4125f, 2, 129, this.f4126g);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f4125f, 129, 130, this.f4126g);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f4125f, 130, 1, this.f4126g);
                    break;
                default:
                    System.arraycopy(this.f4125f, 0, this.f4126g, 0, 9);
                    break;
            }
            m3666a(1, 3);
            m3666a(2, 6);
            m3666a(5, 7);
            synchronized (this.f4123d) {
                System.arraycopy(this.f4126g, 0, this.f4127h, 0, 9);
            }
            if (this.f4122c != null) {
                this.f4122c.zzmr();
            }
        }
    }
}
