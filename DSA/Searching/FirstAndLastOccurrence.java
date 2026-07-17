class FirstAndLastOccurrence {
    public static int firstOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                right = mid - 1;    
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static int lastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                left = mid + 1;     // Search on right side
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 5, 6, 7};
        int target = 4;

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}