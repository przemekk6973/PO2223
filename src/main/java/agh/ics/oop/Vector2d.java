package agh.ics.oop;

public class Vector2d {
    public final int x;
    public final int y;

    public Vector2d(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    boolean precedes(Vector2d other) {
        return x <= other.x && y <= other.y;
    }

    boolean follows(Vector2d other) {
        return x >= other.x && y >= other.y;
    }
    Vector2d upperRight(Vector2d other){
        return new Vector2d(
                Math.max(other.x, x),
                Math.max(other.y, y));
    }
    Vector2d lowerLeft(Vector2d other){
        return new Vector2d(
                Math.min(other.x, x),
                Math.min(other.y, y));
    }
    Vector2d add(Vector2d other){
        return new Vector2d(
                other.x + x, other.y + y);
    }
    Vector2d subtract(Vector2d other){
        return new Vector2d(
                Math.abs(other.x - x), Math.abs(other.y - y));
    }
    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Vector2d vector2d = (Vector2d) other;
        return x == vector2d.x && y == vector2d.y;
    }
    Vector2d opposite(){
        return new Vector2d(-x, -y);
    }
}
