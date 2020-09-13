package com.karim;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x; this.y = y;
    }

    public Point add(Point p) {
        return new Point(x + p.x, y + p.y);
    }

    public Point sub(Point p) {
        return new Point(x - p.x, y - p.y);
    }
}
