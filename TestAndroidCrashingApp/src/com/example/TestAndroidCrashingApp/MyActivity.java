package com.example.TestAndroidCrashingApp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //throw new NullPointerException("PRIVET ot exception");

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("ShareApps", "Catching error: click");
                throw new NullPointerException("PRIVET ot exception");
            }
        });
    }
}
