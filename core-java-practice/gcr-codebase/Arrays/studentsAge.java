import java.util.Scanner;
class StudentsAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];
        System.out.println("enter age of 10 students: ");

        for(int i=0; i<ages.length; i++){
            ages[i]=sc.nextInt();
        }

        for(int i=0; i<ages.length; i++){
            if(ages[i]<0){
                System.out.println("Invalid age");
            }else if(ages[i]>=18){
                System.out.println("Student age is  "+ ages[i] +" can vote");
            }else{
                System.out.println("student age is "+ ages[i] +" cannot vote");
            }
        }
        sc.close();

    }
}