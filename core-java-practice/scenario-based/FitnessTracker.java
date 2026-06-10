import java.util.Scanner;
public class FitnessTracker{
    float height;
    float weight;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter height:");
        float height = sc.nextFloat();
        
        System.out.println("enter weight:");
        float weight = sc.nextFloat();
        
        FitnessTracker tracker = new FitnessTracker();
        float bmi = tracker.calculateBMI(height, weight);
        if(bmi < 18.5){
            System.out.println("underweight");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("normal weight");
        }
        else{
            System.out.println("overweight");
        }
        System.out.println(bmi); 
    }
    public float calculateBMI(float height, float weight){
        return weight / (height * height);
    }
}