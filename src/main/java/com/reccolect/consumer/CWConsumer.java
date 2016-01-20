package com.reccolect.consumer;

import com.reccolect.converter.Converter;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component("cw")
public class CWConsumer implements Consumer {

    @Inject
    @Named("window")
    private Consumer windowConsumer;
    @Inject
    @Named("console")
    private Consumer consoleConsumer;
    @Inject
    @Named("funky")
    private Converter converter;

    @Override
    public void showResult(String result) {
        consoleConsumer.showResult(converter.convert(result));
        windowConsumer.showResult(result);
    }

    public void setWindowConsumer(Consumer windowConsumer) {
        this.windowConsumer = windowConsumer;
    }

    public void setConsoleConsumer(Consumer consoleConsumer) {
        this.consoleConsumer = consoleConsumer;
    }

    public void setConverter(Converter converter) {
        this.converter = converter;
    }
}
