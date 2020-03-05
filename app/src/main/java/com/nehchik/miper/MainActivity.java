package com.nehchik.miper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private TextView top_title;
    private TextView top_sub;
    private TextView login_title;
    private TextView register_title;
    private TextView copyright;
    private ImageButton loginBtn;
    private ImageButton registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Variables declaration
        top_title = findViewById(R.id.top_title);
        top_sub = findViewById(R.id.top_sub);
        login_title = findViewById(R.id.login_title);
        register_title = findViewById(R.id.register_title);
        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);
        copyright = findViewById(R.id.copyright);

        // Onclick Login activity
        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Clicked");
                Intent intent = new Intent(MainActivity.this, FCConnectActivity.class);
                startActivity(intent);
            }
        });

        // Onclick Register activity
        /*registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FCRegistertActivity.class);
                startActivity(intent);
            }
        });*/
    }

}
