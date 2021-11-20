package com.lift;

import com.lift.graphics.BuildingRect;
import com.lift.graphics.Squares;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class GUI extends JFrame{

    private BuildingRect build = new BuildingRect(50,150, 3, 10);
    private BuildingRect build1 = new BuildingRect(300,150, 3, 10);

    public GUI (){
        super("Example");
        this.setBounds(100, 100, 1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(1,1, 5,5));
        container.add(build);
        container.add(build1);

        Rectangle r = new Rectangle(50,50,10,10);
        Rectangle r1 = new Rectangle(50,50,10,10);
        container.add(build);
        container.add(build);
    }

}
