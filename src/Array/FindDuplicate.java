package Array;

import java.util.Arrays;

public class FindDuplicate {

    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 3, 2};
        findDuplicate(arr);
    }

    static int findDuplicate(int arr[]) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x = x ^ arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            x = x ^ i;
        }
        return x;
    }
}

