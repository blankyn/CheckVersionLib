package me.blankm.versionchecklib.utils;

import android.util.Log;


/**
 * Created by admin on 2017/8/16.
 */

public class ALog {
    public static void e(String msg) {
        if (msg != null && !msg.isEmpty())
            Log.e("Allen Checker", msg);
    }
}
