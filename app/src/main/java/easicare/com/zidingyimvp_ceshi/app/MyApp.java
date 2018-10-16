package easicare.com.zidingyimvp_ceshi.app;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application{
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        this.context=this;
    }


    public static Context getAppContext() {
        return  context;
    }
}
