import java.util.Scanner;

public class SumNaturalNumbers{

    static int sum(int n) {
        if (n == 1) {      
            return 1;
        }
        return n + sum(n - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(sum(N));

        sc.close();
    }
}