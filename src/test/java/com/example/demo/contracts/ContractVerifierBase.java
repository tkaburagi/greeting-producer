package com.example.demo.contracts;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.GreetingProducerApplication;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GreetingProducerApplication.class)
public class ContractVerifierBase {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}
