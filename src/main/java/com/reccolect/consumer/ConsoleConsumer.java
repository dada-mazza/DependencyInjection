package com.reccolect.consumer;

import org.springframework.stereotype.Component;

@Component
public class ConsoleConsumer implements Consumer {
    @Override
    public void showResult(String result) {
        System.out.println(result);
    }
}
