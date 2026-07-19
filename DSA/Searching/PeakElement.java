class PeakElement {

    public static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // Peak lies on the right side
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }
            // Peak lies on the left side (or mid itself)
            else {
                right = mid;
            }
        }

        return left;   // Index of a peak element
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(arr);

        System.out.println("Peak Index: " + peakIndex);
        System.out.println("Peak Element: " + arr[peakIndex]);
    }
}