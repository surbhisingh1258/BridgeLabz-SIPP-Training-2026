import java.util.*;
public class rectangle extends shape{

    private int length;
    private int breadth;
    rectangle g;
    public void setLength(int length){
        this.length=length;
    }

    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

    @Override
    public void area(){
        g=new rectangle();
        System.out.println("area of rectangle: "+g.length*g.breadth);
    }

    @Override
    public void perimeter(){
        g=new rectangle();
        System.out.println("perimeter of rectangle: "+2*(g.length+g.breadth));
    }

}