package com.example.testapplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyTests {

    @Autowired
    MyController myController;

    @Test
    public void myTest(){
        assert(myController.getNumber() == 200);
    }
}
