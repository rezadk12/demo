package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.support.CustomSQLExceptionTranslatorRegistrar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value =  "/management/index")
public class Conroller {

    @Autowired
    private FeedBackRepository feedBackRepository;
    @GetMapping(value = "/query", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getAllSortField(
            @RequestParam(required = true) String name,
            @RequestParam(required = true) long docId
    ) throws Exception {

        List<Result> results=feedBackRepository.findFeedBackCount();

        for(Result result:results){
            System.out.println(result.getQuery()+":"+result.getDocId()+":"+result.getCnt());
        }
        System.out.println(results.size());
        return ResponseEntity.ok(true);
    }
}
