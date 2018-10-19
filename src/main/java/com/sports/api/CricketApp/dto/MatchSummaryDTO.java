package com.sports.api.CricketApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class MatchSummaryDTO implements Serializable {

    private static final long serialVersionUID = 135l;

    @JsonProperty("unique_id")
    private long uniqueId;

    @JsonProperty("team-2")
    private String team2;

    @JsonProperty("team-1")
    private String team1;

    @JsonProperty("type")
    private String matchType;

    @JsonProperty("date")
    private String matchDate;

    @JsonProperty("dateTimeGMT")
    private String matchDateGMT;
    private boolean squad;

    @JsonProperty("toss_winner_team")
    private String tossWinner;
    private boolean matchStarted;

    public long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public String getMatchDateGMT() {
        return matchDateGMT;
    }

    public void setMatchDateGMT(String matchDateGMT) {
        this.matchDateGMT = matchDateGMT;
    }

    public boolean isSquad() {
        return squad;
    }

    public void setSquad(boolean squad) {
        this.squad = squad;
    }

    public String getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }

    public boolean isMatchStarted() {
        return matchStarted;
    }

    public void setMatchStarted(boolean matchStarted) {
        this.matchStarted = matchStarted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchSummaryDTO that = (MatchSummaryDTO) o;
        return uniqueId == that.uniqueId &&
                squad == that.squad &&
                matchStarted == that.matchStarted &&
                Objects.equals(team2, that.team2) &&
                Objects.equals(team1, that.team1) &&
                Objects.equals(matchType, that.matchType) &&
                Objects.equals(matchDate, that.matchDate) &&
                Objects.equals(matchDateGMT, that.matchDateGMT) &&
                Objects.equals(tossWinner, that.tossWinner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId, team2, team1, matchType, matchDate, matchDateGMT, squad, tossWinner, matchStarted);
    }

    @Override
    public String toString() {
        return "MatchSummaryDTO{" +
                "uniqueId=" + uniqueId +
                ", team2='" + team2 + '\'' +
                ", team1='" + team1 + '\'' +
                ", matchType='" + matchType + '\'' +
                ", matchDate='" + matchDate + '\'' +
                ", matchDateGMT='" + matchDateGMT + '\'' +
                ", squad=" + squad +
                ", tossWinner='" + tossWinner + '\'' +
                ", matchStarted=" + matchStarted +
                '}';
    }
}
