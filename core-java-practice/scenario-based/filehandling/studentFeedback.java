import java.util.*;
import java.io.*;
import java.io.BufferedReader;

public class studentfeedBack{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int count=0;

            System.out.println("enter 5 feedbacks: ");

            for(int i=0; i<5; i++){
                System.out.println("feedback "+i+":");
                String feedback=reader.readLine();

                if(feedback.toLowerCase().contains("good")){
                    count++;
                }
            }
            System.out.println("count of good in feedback:"+ count);

            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}