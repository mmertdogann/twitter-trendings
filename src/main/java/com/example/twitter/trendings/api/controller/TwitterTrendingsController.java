package com.example.twitter.trendings.api.controller;

import com.example.twitter.trendings.api.service.TwitterTrendingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class TwitterTrendingsController {

    private final TwitterTrendingsService twitterTrendingsService;

    @Autowired
    public TwitterTrendingsController(TwitterTrendingsService twitterTrendingsService) {
        this.twitterTrendingsService = twitterTrendingsService;
    }
}
