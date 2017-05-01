package com.example.kosta.networkexam01;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager manager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo info = manager.getActiveNetworkInfo();

                if(info.getType() == ConnectivityManager.TYPE_WIFI) {
                    Toast.makeText(MainActivity.this, info.getTypeName(), Toast.LENGTH_SHORT).show();
                } else if(info.getType() == ConnectivityManager.TYPE_MOBILE) {
                    Toast.makeText(MainActivity.this, info.getTypeName(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
