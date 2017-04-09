package httpservice.example.com.sharedemo;

import android.app.Application;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by lenovo on 2017/4/9.
 */
public class appppppplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ShareSDK.initSDK(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ShareSDK.stopSDK(this);
    }
}
