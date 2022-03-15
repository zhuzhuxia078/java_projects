package ReverseArray;

import java.util.Arrays;

public class ReverseArrayI {
    private static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,4,6,10,3};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
