package com.sports.api.CricketApp.dto;

import java.io.Serializable;

public class ApiProviderDTO implements Serializable {

    private String source;
    private String url;
    private String pubDate;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "ApiProviderDTO{" +
                "source='" + source + '\'' +
                ", url='" + url + '\'' +
                ", pubDate='" + pubDate + '\'' +
                '}';
    }
}
