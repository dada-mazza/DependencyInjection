package com.reccolect.consumer;

import com.reccolect.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CWConsumer implements Consumer {

    @Autowired
    private Consumer windowConsumer;
    @Autowired
    private Consumer consoleConsumer;
    @Autowired
    private Converter funkyCaseConverter;

    @Override
    public void showResult(String result) {
        consoleConsumer.showResult(funkyCaseConverter.convert(result));
        windowConsumer.showResult(result);
    }

    public void setWindowConsumer(Consumer windowConsumer) {
        this.windowConsumer = windowConsumer;
    }

    public void setConsoleConsumer(Consumer consoleConsumer) {
        this.consoleConsumer = consoleConsumer;
    }

    public void setFunkyCaseConverter(Converter funkyCaseConverter) {
        this.funkyCaseConverter = funkyCaseConverter;
    }
}
