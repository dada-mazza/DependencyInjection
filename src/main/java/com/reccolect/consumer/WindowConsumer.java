package com.reccolect.consumer;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class WindowConsumer implements Consumer {
    @Override
    public void showResult(String result) {

        JFrame frame = new JFrame("WTF!!!");
        JOptionPane.showMessageDialog(frame, result);
        System.exit(0);
    }
}
