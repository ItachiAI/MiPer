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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcconnectresponse);
        Textu = (TextView) findViewById(R.id.tv1); // CATCH DATAS FROM HTTP REQUEST
        Textv = (TextView) findViewById(R.id.tv2); // CATCH Datas from previous activity
        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if (b != null) {
            String j = (String) b.get("url");
            Textv.setText(j);
        }

        // Instanciate the RequestQueue
        RequestQueue queue = Volley.newRequestQueue(this);

        //Request a string response from the provider URL
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url_builded, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // Display the first 500 characters of the response string.
                Textu.setText("Response is: "+ response.substring(0,500));
            } }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Textu.setText("That didn't work!");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);

    }
}
