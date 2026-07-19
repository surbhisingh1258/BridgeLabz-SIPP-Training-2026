import java.util.*;
public class triangle extends shape{

    private int base;
    private int height;
    private int length;
    triangle g;
    public void setBase(int base){
        this.base=base;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public void setlength(int length){
        this.length=length;
    }

    @Override
    public void area(){
        System.out.println("area of triangle " + (0.5 * base * height));
    }

    @Override
    public void perimeter(){
        System.out.println("perimeter of triangle"+(g.base+g.height+g.length));
    }

}