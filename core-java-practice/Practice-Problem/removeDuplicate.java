import java.util.Scanner;
public class removeDuplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]==arr[j]){
                    for(int k=j; k<size-1; k++){
                        arr[k]=arr[k+1];
                    }
                    size--;
                    j--;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}