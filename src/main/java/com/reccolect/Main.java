package com.reccolect;

import com.reccolect.consumer.CWConsumer;
import com.reccolect.consumer.Consumer;
import com.reccolect.converter.Converter;
import com.reccolect.converter.UpperCaseConverter;
import com.reccolect.provider.ConsoleTextProvider;
import com.reccolect.provider.TextProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        TextProvider textProvider = context.getBean(ConsoleTextProvider.class);
        Converter converter = context.getBean(UpperCaseConverter.class);
        Consumer consumer = context.getBean(CWConsumer.class);

        String inputLine = textProvider.getText();
        String outputLine = converter.convert(inputLine);
        consumer.showResult(outputLine);

    }
}
