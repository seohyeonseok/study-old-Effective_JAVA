package item23.good;

class Ractangle extends Figure {
    
    final double length;
    final double width;

    Ractangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

}
