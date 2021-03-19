package com.pro.naughtyindia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.net.URL;

import static com.pro.naughtyindia.MainActivity.Moody;
import static com.pro.naughtyindia.MainActivity.Top_Views;
import static com.pro.naughtyindia.MainActivity.Trending;
import static com.pro.naughtyindia.MainActivity.ass;
import static com.pro.naughtyindia.MainActivity.categoryProductsArrayList;
import static com.pro.naughtyindia.MainActivity.desi;
import static com.pro.naughtyindia.MainActivity.milf;
import static com.pro.naughtyindia.MainActivity.mms;
import static com.pro.naughtyindia.MainActivity.premium;
import static com.pro.naughtyindia.MainActivity.tits;

public class download_activity extends AppCompatActivity {

    ImageView profile,url1,url2;
    String thumb,url1_link,url2_link;
    public static String trailer_link,full_video_link,link_common_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_activity);

        profile=findViewById(R.id.profile);
        url1=findViewById(R.id.url1);
        url2=findViewById(R.id.url2);



        switch (home_page.index)
        {
            case 1:
                Toast.makeText(this, ""+categoryProductsArrayList.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=categoryProductsArrayList.get(home_page.array_pos).getImage_url().toString();
                url1_link=categoryProductsArrayList.get(home_page.array_pos).getImage_url1().toString();
                url2_link=categoryProductsArrayList.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=categoryProductsArrayList.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=categoryProductsArrayList.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 2:
                Toast.makeText(this, ""+Top_Views.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=Top_Views.get(home_page.array_pos).getImage_url().toString();
                url1_link=Top_Views.get(home_page.array_pos).getImage_url1().toString();
                url2_link=Top_Views.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=Top_Views.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=Top_Views.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 3:
                Toast.makeText(this, ""+Trending.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=Trending.get(home_page.array_pos).getImage_url().toString();
                url1_link=Trending.get(home_page.array_pos).getImage_url1().toString();
                url2_link=Trending.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=Trending.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=Trending.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 4:
                Toast.makeText(this, ""+Moody.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=Moody.get(home_page.array_pos).getImage_url().toString();
                url1_link=Moody.get(home_page.array_pos).getImage_url1().toString();
                url2_link=Moody.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=Moody.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=Moody.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 5:
                Toast.makeText(this, ""+desi.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=desi.get(home_page.array_pos).getImage_url().toString();
                url1_link=desi.get(home_page.array_pos).getImage_url1().toString();
                url2_link=desi.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=desi.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=desi.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 6:
                Toast.makeText(this, ""+tits.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=tits.get(home_page.array_pos).getImage_url().toString();
                url1_link=tits.get(home_page.array_pos).getImage_url1().toString();
                url2_link=tits.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=tits.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=tits.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 7:
                Toast.makeText(this, ""+milf.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=milf.get(home_page.array_pos).getImage_url().toString();
                url1_link=milf.get(home_page.array_pos).getImage_url1().toString();
                url2_link=milf.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=milf.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=milf.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 8:
                Toast.makeText(this, ""+mms.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=mms.get(home_page.array_pos).getImage_url().toString();
                url1_link=mms.get(home_page.array_pos).getImage_url1().toString();
                url2_link=mms.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=mms.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=mms.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 9:
                Toast.makeText(this, ""+ass.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=ass.get(home_page.array_pos).getImage_url().toString();
                url1_link=ass.get(home_page.array_pos).getImage_url1().toString();
                url2_link=ass.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=ass.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=ass.get(home_page.array_pos).getVideo_link().toString();
                break;
            case 10:
                Toast.makeText(this, ""+premium.get(home_page.array_pos).getVideo_link(), Toast.LENGTH_SHORT).show();
                thumb=premium.get(home_page.array_pos).getImage_url().toString();
                url1_link=premium.get(home_page.array_pos).getImage_url1().toString();
                url2_link=premium.get(home_page.array_pos).getImage_url2().toString();
                trailer_link=premium.get(home_page.array_pos).getTrailer_link().toString();
                full_video_link=premium.get(home_page.array_pos).getVideo_link().toString();
                break;
            default:
                Toast.makeText(this, "Some kind of error", Toast.LENGTH_SHORT).show();
                break;
        }

        try {

            RequestOptions options=new RequestOptions().centerCrop().placeholder(R.mipmap.ic_launcher_round).error(R.mipmap.ic_launcher_round);

            Glide.with(this).load(thumb).apply(options).into(profile);
            Glide.with(this).load(url1_link).apply(options).into(url1);
            Glide.with(this).load(url2_link).apply(options).into(url2);


        }catch (Exception f)
        {
            Toast.makeText(this, ""+f.getMessage(), Toast.LENGTH_SHORT).show();
        }

        url1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(trailer_link != null) {
                    link_common_video=trailer_link;
                    Intent intent = new Intent(download_activity.this, video_player.class);
                    startActivity(intent);
                }
            }
        });

        url2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(full_video_link!=null)
                {
                    link_common_video=full_video_link;
                    Intent intent = new Intent(download_activity.this, video_player.class);
                    startActivity(intent);

                }

            }
        });

    }
}