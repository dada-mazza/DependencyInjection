package com.reccolect.converter;

import org.springframework.stereotype.Component;

@Component("upper")
public class UpperCaseConverter implements Converter {
    @Override
    public String convert(String inputText) {
        return inputText.toUpperCase();
    }
}
