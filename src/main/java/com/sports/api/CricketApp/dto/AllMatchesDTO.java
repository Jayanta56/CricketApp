package com.sports.api.CricketApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class AllMatchesDTO implements Serializable {

    private static final long serialVersionUID = 175l;

    @JsonProperty("matches")
    private List<MatchSummaryDTO> matches;

    @JsonProperty("v")
    private String version;

    @JsonProperty("ttl")
    private String timeToLive;

    @JsonProperty("provider")
    private ApiProviderDTO apiProvider;

    private long creditsLeft;

    public List<MatchSummaryDTO> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchSummaryDTO> matches) {
        this.matches = matches;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }

    public ApiProviderDTO getApiProvider() {
        return apiProvider;
    }

    public void setApiProvider(ApiProviderDTO apiProvider) {
        this.apiProvider = apiProvider;
    }

    public long getCreditsLeft() {
        return creditsLeft;
    }

    public void setCreditsLeft(long creditsLeft) {
        this.creditsLeft = creditsLeft;
    }

    @Override
    public String toString() {
        return "AllMatchesDTO{" +
                "matches=" + matches +
                ", version='" + version + '\'' +
                ", timeToLive='" + timeToLive + '\'' +
                ", apiProvider=" + apiProvider +
                ", creditsLeft=" + creditsLeft +
                '}';
    }
}
