package item23.worst;

class Figure {
 
    enum Shape {
        RACTANGLE,
        CIRCLE
    }; /* ----> 상수형 열거 타입 선언은 별도 static 클래스로 선언하는 것이 옳다. */

    // 현재 모양
    final Shape shape; /* ----> final필드를 사용하기 위해서는 생성자를 이용해 반드시 초기화를 해야한다.
                                사용하지 않는 경우가 있다면 불필요한 코드가 늘어나게 된다.
                                또한 사용하지 않는 변수를 초기화하여 불필요한 메모리 사용이 발생한다. */

    // shape = RACTANGLE
    double length;
    double width;

    // shape = CIRCLE
    double radius;


    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    Figure(double length, double width) {
        shape = Shape.RACTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch(shape) { /* ----> 의미(enum)의 종류가 추가될 때마다 case가 추가되야하는데 하나라도 빠지는 순간 런타임 문제가 발생할 수 있다. */
            case RACTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }

}