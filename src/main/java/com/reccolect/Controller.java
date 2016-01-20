package com.reccolect;

import com.reccolect.consumer.Consumer;
import com.reccolect.converter.Converter;
import com.reccolect.provider.TextProvider;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class Controller {

    @Inject
    private TextProvider provider;
    @Inject
    @Named("upper")
    private Converter converter;
    @Inject
    @Named("cw")
    private Consumer consumer;

    public void start() {
        consumer.showResult(converter.convert(provider.getText()));
    }

    public void setProvider(TextProvider provider) {
        this.provider = provider;
    }

    public void setConverter(Converter converter) {
        this.converter = converter;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }
}
