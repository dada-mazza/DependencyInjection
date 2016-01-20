package com.reccolect.consumer;

import org.springframework.stereotype.Component;

@Component
public interface Consumer {

    void showResult(String result);
}
