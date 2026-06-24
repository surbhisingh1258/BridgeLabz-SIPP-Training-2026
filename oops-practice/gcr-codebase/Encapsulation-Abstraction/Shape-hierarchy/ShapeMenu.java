import java.util.*;
public class ShapeMenu extends ShapeMenuAbs{
     
    shape s;
    @Override
    public void choices(){
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("1.Reactangle\n2.triangle\n3.cirle\n4.Exit");
            int choices=sc.nextInt();

            if(choices==4){
                break;
            }


            switch(choices){
                
                case 1:
                    s=new rectangle();
                    new rectangle().setLength(100);
                    new rectangle().setLength(200);
                    s.area();
                    s.perimeter();
                    break;

                case 2:
                    s=new triangle();
                    new triangle().setBase(100);
                    new triangle().setHeight(200);
                    new triangle().setHeight(600);
                    s.area();
                    s.perimeter();
                    break;

                case 3:
                    s=new circle();
                    new circle().setRadius(100);
                    s.area();
                    s.perimeter();
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }   
        
    }


}