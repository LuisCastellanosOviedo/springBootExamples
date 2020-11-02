package com.springBootExamples.retry.ver1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetryExampleServiceTest {

    @Autowired
    private RetryExampleService retryExampleService;

    @Test
    public void retryExampleWithRecoveryTest() {
        String result = retryExampleService.retryExample("error");
        Assert.assertEquals("Retry Recovery OK! SAME VALUE TO RETURN AS WELL AS THE RETRYABLE METHOD", result);
    }
}
