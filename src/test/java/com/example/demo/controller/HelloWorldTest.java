package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(value = MockitoExtension.class)
class HelloWorldTest {

    @InjectMocks
    private HelloWorldController helloWorldController;
    @Test
    void controller_is_not_null(){
        assertNotNull(helloWorldController);
    }
    @Test
    void controller_responses_succussfully(){
        ResponseEntity<String> expectedResponse = helloWorldController.greeting();
        String expectedText = expectedResponse.getBody();
        HttpStatus expectedStatusCode = expectedResponse.getStatusCode();
        assertThat("hallo Welt",is(expectedText));
        assertThat(HttpStatus.OK,is(expectedStatusCode));
    }
}
