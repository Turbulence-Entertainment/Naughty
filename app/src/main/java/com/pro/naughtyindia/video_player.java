package com.pro.naughtyindia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Rational;
import android.view.View;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;

public class video_player extends AppCompatActivity {

    VideoView videoView;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        MediaController mediaController=new MediaController(this);
    //    progressBar=findViewById(R.id.progressBar);


       /* videoView=findViewById(R.id.vid);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        Uri uri=Uri.parse(download_activity.link_common_video);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            @Override
            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i1) {

                if(i==mediaPlayer.MEDIA_INFO_BUFFERING_START)
                {
                    progressBar.setVisibility(View.VISIBLE);
                }else
                {
                    progressBar.setVisibility(View.INVISIBLE);
                }

                return false;
            }
        });*/




        Uri uri=Uri.parse(download_activity.link_common_video);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            PictureInPictureParams pipp = new PictureInPictureParams.Builder().setAspectRatio(new Rational(1, 1)).build();
            enterPictureInPictureMode(pipp);
        }
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            PictureInPictureParams pipp=new PictureInPictureParams.Builder().setAspectRatio(new Rational(1,1)).build();
            enterPictureInPictureMode(pipp);

        }
    }

}