package com.lift;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
    private JButton button = new JButton("Press");

    public GUI (){
        super("Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,2));
        container.add(button);
    }

}
