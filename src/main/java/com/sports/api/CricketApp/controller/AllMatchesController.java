package com.sports.api.CricketApp.controller;

import com.sports.api.CricketApp.service.AllMatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class AllMatchesController {

    @Autowired
    private AllMatchesService allMatchesService;

    @GetMapping(value="/allMatches", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String listAllMatches() {
        return allMatchesService.getAllCurrentMatches();
    }
}
