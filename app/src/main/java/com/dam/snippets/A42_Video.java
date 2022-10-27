package com.dam.snippets;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class A42_Video extends AppCompatActivity {

    MediaController mediaController;
    int position;

    VideoView vvVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a42_video);

        // Phase 1 lacement automatique de la video
        //VideoView vvVideo = findViewById(R.id.vvVideo);

        //String uriPath = ("android.resource://" + getPackageName() + "/raw/" + R.raw.mp_ts_drunk);
        //Uri uri = Uri.parse(uriPath);
        //vvVideo.setVideoURI(uri);
        //vvVideo.start();

        //phase 2 avec le mediacontroller
       vvVideo = findViewById(R.id.vvVideo);
        String uriPath = ("android.resource://" + getPackageName() + "/raw/" + R.raw.mp_ts_drunk);
        Uri uri = Uri.parse(uriPath);
        vvVideo.setVideoURI(uri);

        // creation d'un nouvel objet mediacontroller que l'on associe a la vue
        if(this.mediaController == null) {
            this.mediaController = new MediaController(A42_Video.this);
        }

        mediaController.setAnchorView(vvVideo);
        vvVideo.setMediaController(mediaController);

        vvVideo.start();

        if(savedInstanceState != null){
            position = savedInstanceState.getInt("current-position");
            vvVideo.seekTo(position);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        position = vvVideo.getCurrentPosition();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("current-position", position);
        vvVideo.pause();
    }
}
