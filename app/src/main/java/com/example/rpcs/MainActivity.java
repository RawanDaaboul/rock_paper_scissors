package com.example.rpcs;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageButton pvp,PvsPC,rules,I;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        pvp=findViewById(R.id.imagebtnpvp);
        PvsPC=findViewById(R.id.imagebtn1vspc);
        rules=findViewById(R.id.imagebtnrules);
        I=findViewById(R.id.imagebtnI);


        MediaPlayer mainaudio = MediaPlayer.create(MainActivity.this, R.raw.mainaudio);
        mainaudio.start();
        mainaudio.setLooping(true);
            pvp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, pvsp.class);
                    startActivity(i);
                }
            });

            PvsPC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(MainActivity.this, pvsp.class);
                    startActivity(a);
                }
            });
            rules.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent b = new Intent(MainActivity.this, Rules.class);
                    startActivity(b);
                }
            });
            I.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent c = new Intent(MainActivity.this, Info.class);
                    mainaudio.stop();
                    startActivity(c);
                }
            });


    }

}