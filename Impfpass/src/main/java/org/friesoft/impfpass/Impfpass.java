package org.friesoft.impfpass;

import android.app.Application;
import android.content.Context;

/**
 * Created by Bernhard on 23.05.13.
 */
public class Impfpass extends Application {
    private static Context context;

    public void onCreate() {
        super.onCreate();
        Impfpass.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return Impfpass.context;
    }
}
