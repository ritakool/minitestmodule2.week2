package ex1;

public class Trapezoid implements Comparable<Trapezoid>{
    private double bigBottom;
    private double smallBottom;
    private double height;
    private double side1;
    private double side2;
    public Trapezoid() {
    }
    public Trapezoid(double side1, double side2, double height, double bigBottom, double smallBottom) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.bigBottom = bigBottom;
        this.smallBottom = smallBottom;
    }

    public double getBigBottom() {
        return bigBottom;
    }

    public void setBigBottom(double bigBottom) {
        this.bigBottom = bigBottom;
    }

    public double getSmallBottom() {
        return smallBottom;
    }

    public void setSmallBottom(double smallBottom) {
        this.smallBottom = smallBottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public boolean check() {
        if (smallBottom == bigBottom || height <= 0 || height >= side1 || height >= side2 || (side1 + side2) <= bigBottom || (side1 + side2) <= smallBottom){
        return false;
        }else {
        return true;
        }
    }
    public double getArea() {
        if (check()) {
            return (smallBottom + bigBottom) * height / 2;
        } else {
            return -1;
        }
    }
    public double getPerimeter() {
        if (check()) {
            return (side1 + side2 + bigBottom + smallBottom);
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Trapezoid{ " +
                "bigBottom= " + bigBottom +
                ", smallBottom= " + smallBottom +
                ", height= " + height +
                ", side1= " + side1 +
                ", side2= " + side2 +
                " }";
    }

    @Override
    public int compareTo(Trapezoid o) {
        if (getArea() < o.getArea()){
            return 1;
        } else if (getArea() > o.getArea()) return -1;
        return 0;
    }
}
