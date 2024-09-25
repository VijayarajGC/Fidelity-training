public class AreaCalculator
{


    public double calculate(double side)
    {
        return side * side;
    }


    public double calculateArea(double length, double width)
    {
        return length * width;
    }

    public double calculateArea(double radius)
    {
        return Math.PI * radius * radius;
    }


    public static void main(String[] args)
    {
        AreaCalculator areaCalculator = new AreaCalculator();


        double squareArea = areaCalculator.calculateArea(5.0);
        System.out.println("Area of the square: " + squareArea);


        double rectangleArea = areaCalculator.calculateArea(4.0, 6.0);
        System.out.println("Area of the rectangle: " + rectangleArea);


        double circleArea = areaCalculator.calculateArea(3.0);
        System.out.println("Area of the circle: " + circleArea);
    }
}
