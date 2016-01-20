package com.reccolect.consumer;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component("window")
public class WindowConsumer implements Consumer {

    @Override
    public void showResult(String result) {

        JFrame frame = new JFrame("Controller!!!");
        JOptionPane.showMessageDialog(frame, result);
        System.exit(0);
    }
}
