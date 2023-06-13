package com.example.popularnews;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.popularnews.models.newsheadlines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    newsheadlines headlines;
    TextView txt_title,txt_author,txt_time,txt_detail,txt_content;
    ImageView img_news;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txt_title = findViewById(R.id.text_detail_title);
        txt_author = findViewById(R.id.text_detail_author);
        txt_time = findViewById(R.id.text_detail_time);
        txt_content=findViewById(R.id.text_detail_content);
        txt_detail=findViewById(R.id.text_detail_deatil);
        img_news=findViewById(R.id.img_detail_news);
        txt_title.setText(headlines.getTitle());
        txt_author.setText(headlines.getAuthor());
        txt_time.setText(headlines.getPublishedAt());
        txt_detail.setText(headlines.getDescription());
        txt_content.setText(headlines.getContent());
        Picasso.get().load(headlines.getUrlToImage()).into(img_news);



        headlines = (newsheadlines) getIntent().getSerializableExtra("data");
    }
}