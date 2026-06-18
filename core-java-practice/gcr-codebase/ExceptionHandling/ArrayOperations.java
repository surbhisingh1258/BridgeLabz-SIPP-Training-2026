import java.util.*;
public class ArrayOperations{
    static class ArrayIndexOutOfBoundsException extends Exception{
        public ArrayIndexOutOfBoundsException(){
            super("Invalid index!");
        }
    }

    static class NullPointerException extends Exception{
        public NullPointerException(){
            super("Array is not initialized!");
        }
    }

    public static void getValue(int[] arr, int index) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if(arr == null){
            throw new NullPointerException();
        }

        if(index<0 || index>=arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("value at index "+index+" is "+arr[index]);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // int[] arr={1,2,3,4,5,6};
        int[] arr=null;
        try{
            System.out.println("enter index: ");
            int index=sc.nextInt();
            getValue(arr,index);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}