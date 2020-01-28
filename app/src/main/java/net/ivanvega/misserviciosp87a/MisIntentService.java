package net.ivanvega.misserviciosp87a;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MisIntentService extends IntentService {

    /**
     * A constructor is required, and must call the super <code><a href="/reference/android/app/IntentService.html#IntentService(java.lang.String)">IntentService(String)</a></code>
     * constructor with a name for the worker thread.
     */
    public MisIntentService(){
        super("MisIntentService");
    }

    @Override
    public void onCreate() {
        Log.d("MISS", "S onCreate");
        super.onCreate();
    }

    /**
     * The IntentService calls this method from the default worker thread with
     * the intent that started the service. When this method returns, IntentService
     * stops the service, as appropriate.
     */
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("MISS", "Trabajando DUro");
        // Normally we would do some work here, like download a file.
        // For our sample, we just sleep for 5 seconds.
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            // Restore interrupt status.
            Thread.currentThread().interrupt();
        }

    }

    @Override
    public void onDestroy() {
        Log.d("MISS", "IS Destruido");
        super.onDestroy();

    }
}
