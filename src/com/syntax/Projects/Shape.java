package com.syntax.Projects;

public interface Shape {
    void calculateArea();
    void calculatePerimiter();
}
class  Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("the Area of a Circel is "+12.1*5);
    }
    @Override
    public void calculatePerimiter() {
        System.out.println("the perimiter of the shape is "+5*12.1*2);

    }
}
class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("the are of squar is "+2*4);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("the perimiter of the squar is "+5*2);

    }
}
class Test{
    public static void main(String[] args) {
       Shape[]shapes={new Circle(),new Square()};
       for ( Shape shap:shapes){
           shap.calculateArea();
           shap.calculatePerimiter();
       }
    }
}
    
    