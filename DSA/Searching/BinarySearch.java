class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] brightness = {2, 5, 8, 10, 15, 18, 21, 25};

        int target = 15;

        int index = binarySearch(brightness, target);

        if (index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found");
    }
}