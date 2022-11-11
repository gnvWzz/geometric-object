public class Square extends Rectangle {

    public Square() {
        setWidth(1.0);
        setLength(1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean field) {
        super(side, side, color, field);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length) {
        setSide(length);
    }

    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

}
