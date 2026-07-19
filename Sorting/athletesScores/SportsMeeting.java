public class SportsMeeting {
    static void bubbleSort(int[] arr) {
        int swap = 0;
        boolean swapped;

        System.out.println("Bubble Sort: ");
        
        for(int i = 0; i<arr.length-1; i++) {
            for(int j = 0; j<i-1; j++) {
                
                if(arr[i]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;
                    swapped = true;
                }
            }
        }
    }
    //TOP 3
    static void top(int[] arr){
        int n=arr.length;
        System.out.println("GOLD:"+arr[n-1]);
        System.out.println("SILVER:"+arr[n-2]);
        System.out.println("BRONZE:"+arr[n-3]);
    }
    public static void main(String[] args){
        int[] scores = {64,25,12,22,11};
        int[] bubble=scores.clone();
        int[] insertion=scores.clone();

        bubbleSort(bubble);
        top(bubble);
    }

    //using insertion sort

    static void insertionSort(int[] arr){
        int swap = 0;
        boolean swapped;

        {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

