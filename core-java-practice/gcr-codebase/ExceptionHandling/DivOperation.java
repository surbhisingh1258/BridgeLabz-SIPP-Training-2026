import java.util.*;
public class DivOperation{

    static class ArithmeticException extends Exception{
        public ArithmeticException(){
            super("Cannot divide by zero");
        }
    }

    public static void divideNumber(int num, int den) throws ArithmeticException {
        if(den == 0){
            throw new ArithmeticException();
        }
        int result = num/den;
        System.out.println("result: "+ result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter numerator: ");
            int num = sc.nextInt();

            System.out.println("enter denominator: ");
            int den = sc.nextInt();

            divideNumber(num, den);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Operation completed");
        }
        sc.close();
    }
}