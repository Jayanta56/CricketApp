package com.sports.api.CricketApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class MatchScoreSummaryDTO implements Serializable {

    private String score;
    private String description;
    private boolean matchStarted;

    @JsonProperty("team-1")
    private String team1;
    @JsonProperty("team-2")
    private String team2;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMatchStarted() {
        return matchStarted;
    }

    public void setMatchStarted(boolean matchStarted) {
        this.matchStarted = matchStarted;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchScoreSummaryDTO that = (MatchScoreSummaryDTO) o;
        return matchStarted == that.matchStarted &&
                Objects.equals(score, that.score) &&
                Objects.equals(description, that.description) &&
                Objects.equals(team1, that.team1) &&
                Objects.equals(team2, that.team2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, description, matchStarted, team1, team2);
    }

    @Override
    public String toString() {
        return "MatchScoreSummaryDTO{" +
                "score='" + score + '\'' +
                ", description='" + description + '\'' +
                ", matchStarted=" + matchStarted +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                '}';
    }
}
