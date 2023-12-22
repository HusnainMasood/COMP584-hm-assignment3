package com.project.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/business")
public class BusinessController {

    private List<Data> dataset; // Simulated dataset

    // Endpoint to get paginated data with filters
    @GetMapping
    public ResponseEntity<List<Data>> getFilteredData(
            @RequestParam(required = false) Long businessID,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Long address,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state,
            @RequestParam(required = false) Long postal,
            @RequestParam(required = false) Long star,
            @RequestParam(required = false) Long review,
            @RequestParam(required = false) Long open,
            @RequestParam(required = false) String ctg,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "25") int pageSize
    ) {
        // Apply filters (you can modify this based on your actual filtering logic)
        List<Data> filteredData = dataset.stream()
                .filter(data -> businessID == null || ((List<Data>) data).contains(businessID))
                .filter(data -> name == null || ((List<Data>) data).contains(name))
                .filter(data -> address == null || ((List<Data>) data).contains(address))
                .filter(data -> city == null || ((List<Data>) data).contains(city))
                .filter(data -> state == null || ((List<Data>) data).contains(state))
                .filter(data -> postal == null || ((List<Data>) data).contains(postal))
                .filter(data -> star == null || ((List<Data>) data).contains(star))
                .filter(data -> review == null || ((List<Data>) data).contains(review))
                .filter(data -> open == null || ((List<Data>) data).contains(open))
                .filter(data -> ctg == null || ((List<Data>) data).contains(ctg))
                .skip(page * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());

        return ResponseEntity.ok(filteredData);
    }

    // Other methods to initialize data and handle dataset operations
}

