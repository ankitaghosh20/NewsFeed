package com.example.popularnews;

import com.example.popularnews.models.newsheadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<newsheadlines> list,String message);
    void onError(String message);

}
