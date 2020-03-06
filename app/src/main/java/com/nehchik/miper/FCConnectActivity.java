package com.nehchik.miper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FCConnectActivity extends AppCompatActivity {
    // START - Variables elements
    private TextView panel_heading;
    private TextView head_ants;
    private TextView id_ants_title;
    private TextView pwd_ants_title;
    private TextView head_fc_connect;
    private EditText ants_id;
    private EditText ants_pwd;
    private ImageButton fcconnect_btn;
    private ImageView fr_band;
    private Button connect_btn;

    // END - Variables elements
    /* ###########################################################################################*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcconnect);

        fcconnect_btn = findViewById(R.id.fcconnect_btn);

        // Onclick Login activitY
        fcconnect_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FCConnectActivity.this, FCConnectResponseActivity.class);
                //intent.putExtra("url", url_builded);
                startActivity(intent);
            }
        });
    }
}
