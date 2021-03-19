package com.pro.naughtyindia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<CategoryProducts> categoryProductsArrayList,Top_Views,Trending,Moody,desi,milf,mms,tits,ass,premium;
    FirebaseFirestore firebaseFirestore;
    TimerTask mTimerTask;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firebaseFirestore=FirebaseFirestore.getInstance();



        categoryProductsArrayList = new ArrayList<>();
        firebaseFirestore.collection("new releases").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        categoryProductsArrayList.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });


        Top_Views = new ArrayList<>();
        firebaseFirestore.collection("top views").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        Top_Views.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });


        Trending = new ArrayList<>();
        firebaseFirestore.collection("trending").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        Trending.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });


        Moody = new ArrayList<>();
        firebaseFirestore.collection("moody").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        Moody.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });

        desi = new ArrayList<>();
        firebaseFirestore.collection("desi").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        desi.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });


        tits = new ArrayList<>();
        firebaseFirestore.collection("tits").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        tits.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });

        ass = new ArrayList<>();
        firebaseFirestore.collection("ass").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        ass.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });


        mms = new ArrayList<>();
        firebaseFirestore.collection("mms").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        mms.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });


        milf = new ArrayList<>();
        firebaseFirestore.collection("milf").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        milf.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });


        premium = new ArrayList<>();
        firebaseFirestore.collection("premium").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {

                if(task.isSuccessful())
                {
                    for(QueryDocumentSnapshot queryDocumentSnapshot:task.getResult())
                    {
                        String url=queryDocumentSnapshot.get("url").toString();
                        String name=queryDocumentSnapshot.get("name").toString();
                        String desc=queryDocumentSnapshot.get("desc").toString();
                        String url1=queryDocumentSnapshot.get("url1").toString();
                        String url2=queryDocumentSnapshot.get("url2").toString();
                        String trailer=queryDocumentSnapshot.get("trailer").toString();
                        String video=queryDocumentSnapshot.get("video").toString();
                        premium.add(new CategoryProducts(url,name,desc,url1,url2,trailer,video));
                    }
                }

            }
        });


        final Handler handler = new Handler();
        Timer t = new Timer();


        mTimerTask = new TimerTask() {
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        if(categoryProductsArrayList.size()>0 && Top_Views.size()>0 && Trending.size()>0 && Moody.size()>0 && desi.size()>0 && tits.size()>0 && ass.size()>0 && milf.size()>0 && mms.size()>0 && premium.size()>0) {
                            stopTask();
                            Intent intent = new Intent(MainActivity.this, home_page.class);
                            startActivity(intent);
                        }

                    }
                });
            }};

        // public void schedule (TimerTask task, long delay, long period)
        t.schedule(mTimerTask, 1000, 3000);  //


    }
    public void stopTask(){
        if(mTimerTask!=null){
            mTimerTask.cancel();
        }
    }


}