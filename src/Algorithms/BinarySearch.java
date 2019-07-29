package Algorithms;

public class BinarySearch {

    public int binarySearch(int item, int[] list) {

        int low = 0;
        int high = list.length;
        int mid;
        int guess = 0;

        while (low <= high) {

            mid = (low + high) / 2;
            guess = list[mid];

            if (guess == item) return guess;
            if (guess > item) high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        return guess;
    }

}

