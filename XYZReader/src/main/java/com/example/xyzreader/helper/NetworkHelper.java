package com.example.xyzreader.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by moizarsiwala on 19/10/15.
 */
public class NetworkHelper {

    private static String TAG = NetworkHelper.class.getName();

    /**
     * Get the network info
     *
     * @param context
     * @return
     */
    private static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo();
    }

    /**
     * isConnected and isNetworkAvailable ust to maintain previous legacy
     */
    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo info = NetworkHelper.getNetworkInfo(context);
        return (info != null && info.isConnected());
    }
}