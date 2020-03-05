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
    // START - FCConnect API variables
    public String fc_url = "https://fcp.integ01.dev-franceconnect.fr";
    public String fc_auth = "/api/v1/authorize?";
    public String client_id = "211286433e39cce01db448d80181bdfd005554b19cd51b3fe7943f6b3b86ab6e";
    public String fs_url = "http://localhost:3000/login-callback";
    public String fs_callback = "http://localhost:4242/callback";
    public String logout_callback = "http://localhost:3000/logout";
    public String scope = "openid%20given_name%20family_name%20birthdate%20gender%20birthplace%20birthcountry%20email%20preferred_username%20address%20phone";
    public String state = "home";
    public String nonce = "customNonce11";
    public String url_builded = fc_url + "/api/v1/authorize?response_type=code&client_id=" +
            client_id + "&redirect_uri=" + fs_url + "%2F" + fs_callback + "&scope=" + scope +"&state=" + state + "&nonce=" + nonce;
    // END - FCConnect API variables
    /* ###########################################################################################*/

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcconnect);

        // Onclick Login activity
        fcconnect_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Clicked");
                Intent intent = new Intent(FCConnectActivity.this, FIAuthActivity.class);
                startActivity(intent);
            }
        });
    }
}
