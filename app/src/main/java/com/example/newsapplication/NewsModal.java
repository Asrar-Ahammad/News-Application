package com.example.newsapplication;

import java.util.ArrayList;

public class NewsModal {
    private int totalResults;
    private ArrayList<Articles> articles;
    private String status;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<Articles> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NewsModal(int totalResults, ArrayList<Articles> articles, String status) {
        this.totalResults = totalResults;
        this.articles = articles;
        this.status = status;
    }
}
