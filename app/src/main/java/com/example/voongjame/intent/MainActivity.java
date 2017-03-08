package com.example.voongjame.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://stackoverflow.com/questions/151777/saving-android-activity-state";
                Intent launchWeb = new Intent(Intent.ACTION_VIEW);
                launchWeb.setData(Uri.parse(url));
                startActivity(launchWeb);
            }
        });

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.voongjame.helloworld");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });
    }
}
