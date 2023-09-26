package com.company;
import javax.swing.*;
import java.awt.*;
public class Jframe {
    public static void main(String[] args) {

    // write your code here
    JLabel label = new JLabel();
    Font italic;
    label.setText("saniyans around");
    label.setHorizontalTextPosition(JLabel.RIGHT);

    JFrame frame = new JFrame();
    frame.setSize(600,600);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(label);



}}
