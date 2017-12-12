package com.example.rtp_10305.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ImageButton back;
    TextView name1,passwd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name1 = (TextView)findViewById(R.id.textView2);
        passwd1 = (TextView)findViewById(R.id.textView3);

        back = (ImageButton)findViewById(R.id.imageButton);

        back.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intentback = new Intent(Main2Activity.this,MainActivity.class);
               finish();
           }
       });

        name1.setText(getIntent().getStringExtra("name"));
        passwd1.setText(getIntent().getStringExtra("passwd"));

       // Toast.makeText(this,"Intent Complete",Toast.LENGTH_LONG).show(); // แบบที่1
        Toast toast = Toast.makeText(this,"Complete",Toast.LENGTH_SHORT);// แบบที่2
        toast.show(); // แบบที่2
    }
}
