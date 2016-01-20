package com.reccolect.converter;

import org.springframework.stereotype.Component;

@Component
public class FunkyCaseConverter implements Converter {
    @Override
    public String convert(String inputText) {

        char[] inputTextArray = inputText.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputTextArray.length; i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(inputTextArray[i]));
            } else {
                sb.append(Character.toLowerCase(inputTextArray[i]));
            }

        }
        return sb.toString();
    }
}
