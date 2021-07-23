package com.kuraps.baca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DetailBuku extends AppCompatActivity {
    int Click = 0;
    ImageView back,fav;
    ImageView cover;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);

        back=findViewById(R.id.back);
        btn1=findViewById(R.id.unduh);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        cover = (ImageView) findViewById(R.id.imageView2); // init a ImageView
        Intent intent = getIntent(); // get Intent which was set from adapter of Previous Activity
        cover.setImageResource(intent.getIntExtra("cover", 0)); // get image from Intent and set it in ImageView
        String judulnya = intent.getStringExtra("judul");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (judulnya.equals("Kenali Agamamu")){
                    Uri uri = Uri.parse("https://google.com/link1"); // Link Buku 1
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }else if (judulnya.equals("judul2")){
                    Uri uri = Uri.parse("https://google.com/link2"); // Link Buku 2
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                }else if (judulnya.equals("judul3")){
                    Uri uri = Uri.parse("https://google.com/link3"); // Link Buku 1
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                }else if (judulnya.equals("judul4")){
                    Uri uri = Uri.parse("https://google.com/link4"); // Link Buku 4
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                }else if (judulnya.equals("judul5")){
                    Uri uri = Uri.parse("https://google.com/link5"); // Link Buku 5
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                }else if (judulnya.equals("judul6")){
                    Uri uri = Uri.parse("https://google.com/link6"); // Link Buku 6
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                }
            }
        });


    }
}