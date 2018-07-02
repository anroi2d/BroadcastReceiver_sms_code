package com.myapp.anit.broadcastreceiver_sms_code;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NetworkOnOff extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "ok", Toast.LENGTH_SHORT).show();
    }
}
