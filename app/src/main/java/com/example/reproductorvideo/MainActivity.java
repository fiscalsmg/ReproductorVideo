package com.example.reproductorvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vv=(VideoView)findViewById(R.id.videoView);
        //switch
        //URI  === identificador de recurso uniforme ....calcu metodo getString
        String loc="android.resource://"+getPackageName()+"/"+R.raw.rode;
        vv.setVideoURI(Uri.parse(loc));
        vv.setMediaController(new MediaController(this));//muestra los botones del video controlador de medios
        vv.start();
        vv.requestFocus();
        //app un solo videoView dependiendo el clic cambiara el video
    }
}
