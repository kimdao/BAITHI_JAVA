package com.example.nguyenminhtien.appbaothuc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by NguyenMinhTien on 6/13/2017.
 */

public class AlarmReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("Toi Trong Receiver", "Xin Chao");

        String Chuoi_string = intent.getExtras().getString("extra");
        Log.e("Ban truyen key",Chuoi_string);
        Intent myIntent = new Intent(context,Music.class);
        myIntent.putExtra("extra", Chuoi_string);
        context.startService(myIntent);

    }
}
