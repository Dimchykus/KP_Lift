package com.lift.graphics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FloorRect {
    public int x;
    public int y;
    public int width;
    public int height;
    public int floorHeight = 10;
    public Rectangle floorRect = new Rectangle();

    public FloorRect(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        floorRect = new Rectangle(x, y, width, height);
    }
}
