package com.demo.votingapplication;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.demo.votingapplication.helper.SQLiteHandler;
import com.demo.votingapplication.helper.SessionManager;

public class MainActivity extends Activity {
    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent window = new Intent(getApplicationContext(), AllProductsActivity.class);
                    startActivity(window);
                    finish();
                }
            }
        };
        thread.start();
    }
}