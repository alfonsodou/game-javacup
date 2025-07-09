package com.codingame.game.utils;

public class Wall2D {
    private Vector2D    from;
    private Vector2D    to;
    private Vector2D    normal;

    public Wall2D() {
        this.from = new Vector2D();
        this.to = new Vector2D();
    }

    public Wall2D(Vector2D from, Vector2D to) {
        this.from = from;
        this.to = to;
        CalculateNormal();
    }

    public void CalculateNormal() {
        Vector2D temp = from.subtract(to);
        temp.Normalize();

        this.normal = new Vector2D(-temp.getY(), temp.getX());
    }

    public Vector2D Center() {
        Vector2D temp = from.add(to);
        return temp.divide(2);
    }

    public Vector2D getFrom() {
        return from;
    }

    public void setFrom(Vector2D from) {
        this.from = from;
        CalculateNormal();
    }

    public Vector2D getTo() {
        return to;
    }

    public void setTo(Vector2D to) {
        this.to = to;
        CalculateNormal();
    }

    public Vector2D getNormal() {
        return normal;
    }

    public void setNormal(Vector2D normal) {
        this.normal = normal;
    }

    
}
