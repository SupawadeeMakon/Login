package com.example.rtp_10305.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 Button login;
 EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);

        login = (Button)findViewById(R.id.button1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

               // intent.putExtra("name",username.getText().toString());
                intent.putExtra("name",username.getText().toString());
                intent.putExtra("passwd",password.getText().toString());


                startActivity(intent);
            }
        });
    }
}
