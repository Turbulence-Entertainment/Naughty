package com.pro.naughtyindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

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

public class home_page extends AppCompatActivity {

    public RecyclerView common_recyclerview1,common_recyclerview2,common_recyclerview3,common_recyclerview4,common_recyclerview5,common_recyclerview6,common_recyclerview7,common_recyclerview8,common_recyclerview9,common_recyclerview10;
    public RecyclerView.LayoutManager common_layout_maneger10,common_layout_maneger1,common_layout_maneger2,common_layout_maneger3,common_layout_maneger4,common_layout_maneger5,common_layout_maneger6,common_layout_maneger7,common_layout_maneger8,common_layout_maneger9;
    public static int index,array_pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        index=0;
        array_pos=-1;


        common_recyclerview1=findViewById(R.id.common_recyclerview1);
        common_layout_maneger1=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview1.setLayoutManager(common_layout_maneger1);
        CategoryAdapter categoryAdapter1=new CategoryAdapter(categoryProductsArrayList,this);
        common_recyclerview1.setAdapter(categoryAdapter1);
        categoryAdapter1.notifyDataSetChanged();
        categoryAdapter1.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {

                index=1;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);

            }
        });

        common_recyclerview2=findViewById(R.id.common_recyclerview2);
        common_layout_maneger2=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview2.setLayoutManager(common_layout_maneger2);
        CategoryAdapter categoryAdapter2=new CategoryAdapter(Top_Views,this);
        common_recyclerview2.setAdapter(categoryAdapter2);
        categoryAdapter2.notifyDataSetChanged();
        categoryAdapter2.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {

                index=2;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);
            }
        });




        common_recyclerview3=findViewById(R.id.common_recyclerview3);
        common_layout_maneger3=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview3.setLayoutManager(common_layout_maneger3);
        CategoryAdapter categoryAdapter3=new CategoryAdapter(Trending,this);
        common_recyclerview3.setAdapter(categoryAdapter3);
        categoryAdapter3.notifyDataSetChanged();
        categoryAdapter3.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {
                index=3;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);
            }
        });

        common_recyclerview4=findViewById(R.id.common_recyclerview4);
        common_layout_maneger4=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview4.setLayoutManager(common_layout_maneger4);
        CategoryAdapter categoryAdapter4=new CategoryAdapter(Moody,this);
        common_recyclerview4.setAdapter(categoryAdapter4);
        categoryAdapter4.notifyDataSetChanged();
        categoryAdapter4.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {
                index=4;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);
            }
        });


        common_recyclerview5=findViewById(R.id.common_recyclerview5);
        common_layout_maneger5=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview5.setLayoutManager(common_layout_maneger5);
        CategoryAdapter categoryAdapter5=new CategoryAdapter(desi,this);
        common_recyclerview5.setAdapter(categoryAdapter5);
        categoryAdapter5.notifyDataSetChanged();
        categoryAdapter5.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {
                index=5;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);
            }
        });


        common_recyclerview6=findViewById(R.id.common_recyclerview6);
        common_layout_maneger6=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview6.setLayoutManager(common_layout_maneger6);
        CategoryAdapter categoryAdapter6=new CategoryAdapter(tits,this);
        common_recyclerview6.setAdapter(categoryAdapter6);
        categoryAdapter6.notifyDataSetChanged();
        categoryAdapter6.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {
                index=6;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);
            }
        });


        common_recyclerview7=findViewById(R.id.common_recyclerview7);
        common_layout_maneger7=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview7.setLayoutManager(common_layout_maneger7);
        CategoryAdapter categoryAdapter7=new CategoryAdapter(milf,this);
        common_recyclerview7.setAdapter(categoryAdapter7);
        categoryAdapter7.notifyDataSetChanged();
        categoryAdapter7.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {
                index=7;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);
            }
        });



        common_recyclerview8=findViewById(R.id.common_recyclerview8);
        common_layout_maneger8=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview8.setLayoutManager(common_layout_maneger8);
        CategoryAdapter categoryAdapter8=new CategoryAdapter(mms,this);
        common_recyclerview8.setAdapter(categoryAdapter8);
        categoryAdapter8.notifyDataSetChanged();
        categoryAdapter8.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {
                index=8;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);

            }
        });



        common_recyclerview9=findViewById(R.id.common_recyclerview9);
        common_layout_maneger9=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview9.setLayoutManager(common_layout_maneger9);
        CategoryAdapter categoryAdapter9=new CategoryAdapter(ass,this);
        common_recyclerview9.setAdapter(categoryAdapter9);
        categoryAdapter9.notifyDataSetChanged();
        categoryAdapter9.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {
                index=9;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);
            }
        });



        common_recyclerview10=findViewById(R.id.common_recyclerview10);
        common_layout_maneger10=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        common_recyclerview10.setLayoutManager(common_layout_maneger10);
        CategoryAdapter categoryAdapter10=new CategoryAdapter(premium,this);
        common_recyclerview10.setAdapter(categoryAdapter10);
        categoryAdapter10.notifyDataSetChanged();
        categoryAdapter10.setOnItemClickedLisner(new CategoryAdapter.OnItemClickLisner() {
            @Override
            public void onItemClick(int position) {
                index=10;
                array_pos=position;
                Intent intent=new Intent(home_page.this,download_activity.class);
                startActivity(intent);
            }
        });



    }
}