package net.ivanvega.misserviciosp87a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnIntentSer_click(View view) {
        Intent iIS = new
                Intent(this,
                MisIntentService.class);

        startService(iIS);
        Toast.makeText(this, "IS iniciado",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    public void btnIS_click(View view) {
        Intent iS = new Intent(this, MisServicio.class);

        startService(iS);


    }

    public void btnSS_click(View view) {
        Intent iS = new Intent(this, MisServicio.class);

        stopService(iS);
    }
}
