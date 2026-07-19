public class EmployeeSalaries {

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void printArray(int[] arr) {

        System.out.print("Sorted Salaries: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println("]");
    }

    public static void main(String[] args) {

        int[] salaries = {45000, 32000, 78000, 55000, 40000, 60000};

        System.out.print("Original Salaries: [");
        for (int i = 0; i < salaries.length; i++) {
            System.out.print(salaries[i]);
            if (i != salaries.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");

        mergeSort(salaries, 0, salaries.length - 1);

        printArray(salaries);
    }
}