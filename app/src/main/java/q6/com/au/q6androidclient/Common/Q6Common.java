package q6.com.au.q6androidclient.Common;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

/**
 * Created by yangwulong on 8/2/17.
 */

public class Q6Common {

    public static int getScreenWidth(AppCompatActivity v) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
       v.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);

       // return Resources.getSystem().getDisplayMetrics().widthPixels;
        return displaymetrics.widthPixels;
    }

    public static int getScreenHeight(AppCompatActivity v) {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

}
