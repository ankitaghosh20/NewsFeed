package com.example.popularnews.models;

import java.io.Serializable;
import java.util.List;

public class NewsApiResponse implements Serializable {

    String status;
    int totalResults;
    List<newsheadlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<newsheadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<newsheadlines> articles) {
        this.articles = articles;
    }

}
