public class BinarySearchAdvanced {

    // 1. First Occurrence
    public static int firstOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {

                answer = mid;
                right = mid - 1;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return answer;
    }


    // 2. Last Occurrence
    public static int lastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {

                answer = mid;
                left = mid + 1;

            } else if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return answer;
    }


    // 3. Search Insert Position
    public static int searchInsert(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }


    // 4. Square Root
    public static int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x;

        int answer = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {

                answer = mid;
                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return answer;
    }


    // 5. Search in Rotated Sorted Array
    public static int searchRotated(
            int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (arr[left] <= arr[mid]) {

                if (arr[left] <= target &&
                    target < arr[mid]) {

                    right = mid - 1;

                } else {

                    left = mid + 1;
                }

            } else {

                // Right half sorted
                if (arr[mid] < target &&
                    target <= arr[right]) {

                    left = mid + 1;

                } else {

                    right = mid - 1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4};

        System.out.println(
            "First Occurrence: "
            + firstOccurrence(arr, 2)
        );

        System.out.println(
            "Last Occurrence: "
            + lastOccurrence(arr, 2)
        );


        int[] insertArray = {1, 3, 5, 6};

        System.out.println(
            "Search Insert Position: "
            + searchInsert(insertArray, 2)
        );


        System.out.println(
            "Square Root: "
            + mySqrt(20)
        );


        int[] rotated = {
            4, 5, 6, 7, 0, 1, 2
        };

        System.out.println(
            "Rotated Array Search: "
            + searchRotated(rotated, 0)
        );
    }
}
