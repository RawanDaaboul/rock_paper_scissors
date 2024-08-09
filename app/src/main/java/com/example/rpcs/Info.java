package com.example.rpcs;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Info extends AppCompatActivity {
ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info);

        back=findViewById(R.id.imagebtnback);
        MediaPlayer bar_noises = MediaPlayer.create(Info.this, R.raw.bar_noises);
        bar_noises.start();
        bar_noises.setLooping(true);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(Info.this, MainActivity.class);
                bar_noises.stop();
                startActivity(e);
            }
        });

    }
}