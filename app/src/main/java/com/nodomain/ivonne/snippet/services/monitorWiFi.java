package com.nodomain.ivonne.snippet.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class monitorWiFi extends Service {
    public monitorWiFi() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
