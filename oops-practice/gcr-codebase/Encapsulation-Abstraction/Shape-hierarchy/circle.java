import java.util.*;
public class circle extends shape{

    private double radius;
    final double pi=3.14;

    circle g;
    public void setRadius(double radius){
        g=new circle();
        this.radius=radius;
    }

    @Override
    public void area(){
        System.out.println("area of circle"+ 3.14*g.radius*g.radius);
    }

    @Override
    public void perimeter(){
        System.out.println("perimeter of circle"+2*3.14*g.radius);
    }

}