package com.nehchik.miper;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FIAuthActivity extends AppCompatActivity {
    private ImageView fr_band;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiauth);

        fr_band = findViewById(R.id.fr_band);

        // Onclick Login activity
        /*fcconnect_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Clicked");
                Intent intent = new Intent(FCConnectActivity.this, FCConnectActivity.class);
                startActivity(intent);
            }
        });*/
    }

}
