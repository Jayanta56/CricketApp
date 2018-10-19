package com.sports.api.CricketApp.controller;

import com.sports.api.CricketApp.service.AllMatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class AllMatchesController {

    @Autowired
    private AllMatchesService allMatchesService;

    @GetMapping(value="/matches.html", produces = MediaType.TEXT_HTML_VALUE)
    public String listAllMatches() {
        return allMatchesService.getAllCurrentMatches();
    }

    @GetMapping(value="/matchScore/{matchId}", produces = MediaType.TEXT_HTML_VALUE)
    public String viewMatchScore(@PathVariable String matchId) {
        return allMatchesService.getSelectedMatchScore(matchId);
    }
}
