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
        return Math.sqrt(x * x + y * y);
    }

    public void Normalize() {
        double magnitude = Length();
        if (magnitude > 0) {
            this.x = x / magnitude;
            this.y = y / magnitude;
        } else {
            Zero();
        }
    }

    // return de fot product of this and v2
    public double Dot(Vector2D other) {
        return this.x * other.x + this.y * other.y;
    }

    // return the vector that is perpendicular to this one
    public Vector2D Perp() {
        return new Vector2D(-y, x);
    }

    //return the distance between this vector and the one passed as a parameter
    public double Distance(Vector2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Suma de vectores
    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    // Resta de vectores
    public Vector2D subtract(Vector2D other) {
        return new Vector2D(this.x - other.x, this.y - other.y);
    }

    // Multiplicación por escalar
    public Vector2D multiply(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }    
}
