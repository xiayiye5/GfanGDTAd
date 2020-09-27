package cn.net.gfan.world;

import android.app.Application;

import com.qq.e.comm.managers.GDTADManager;

/**
 * @author Administrator
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        GDTADManager.getInstance().initWith(this, "1111030438");
    }
}
