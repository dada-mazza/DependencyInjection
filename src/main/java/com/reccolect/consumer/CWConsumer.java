package com.reccolect.consumer;

import com.reccolect.converter.Converter;
import org.springframework.stereotype.Component;

import javax.inject.Inject;


@Component
public class CWConsumer implements Consumer {

    @Inject
    private Consumer windowConsumer;
    @Inject
    private Consumer consoleConsumer;
    @Inject
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
