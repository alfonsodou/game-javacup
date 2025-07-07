package com.codingame.game.utils;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // set x and y to zero
    public void Zero() {
        this.x = 0;
        this.y = 0;
    }

    // returns true if both x and y are zero
    public boolean isZero() {
        return ((this.x == 0) && (this.y == 0));
    }

    // return the length of the vector
    public double Length() {
        return 0; 
    }

    public void Normalize() {

    }

    // return de fot product of this and v2
    public double Dot(Vector2D v2) {
        return 0;
    }

    // return the vector that is perpendicular to this one
    public Vector2D Perp() {
        return new Vector2D();
    }

    //return the distance between this vector and the one passed as a parameter
    public double Distance(Vector2D v2) {
        return 0;
    }
}
