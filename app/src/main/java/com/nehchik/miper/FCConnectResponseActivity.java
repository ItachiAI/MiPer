package com.nehchik.miper;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class FCConnectResponseActivity extends AppCompatActivity {
    private TextView Textu;
    private TextView Textv;
    private TextView tv2;

    private String fi_url = "";
    private String post_fi_url = "/user/authorize?response_type=code&client_id=";
    private String client_id = "";
    private String post_client_id = "&redirect_uri=";
    private String fc_url = "";
    private String post_fc_url = "%2Foidc_callback&scope=";
    private String scope = "";
    private String post_scope = "&state=";
    private String state = "";
    private String post_state = "&nonce=";
    private String nonce = "";
    private String post_nonce = "&acr_values=";
    private String acr_values = "";

    private String url_builded = fi_url+post_fi_url+client_id+post_client_id+fc_url+post_fc_url+scope+post_scope+state+post_state+nonce+post_nonce+acr_values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcconnectresponse);
        Textu = (TextView)findViewById(R.id.tv1); //URL AUTH
        Textv = (TextView)findViewById(R.id.tv2); // TEST
        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("url");
            Textv.setText(j);
        }

        Textu.setText(url_builded);
    }

}
