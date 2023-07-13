package com.eion.springproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/testing")
public class testcontroller {

  @GetMapping
  public ResponseEntity<String> testingData() {
    return new ResponseEntity<>("Hello testing application", HttpStatus.OK);
  }
}
