import java.util.Arrays;
public class ArrayMethods {
    public static void main(String[] args) {
        System.out.println("1. Arrays.sort() : SORTS THE ARRAY IN ASCENDING ORDER");
        int[] arr1 = {40, 10, 90, 20, 70};
        Arrays.sort(arr1);
        System.out.println("Sorted array : " + Arrays.toString(arr1));
        System.out.println("<-------------------------------------------------->");

        System.out.println("2. Arrays.toString() : CONVERTS ARRAY TO A READABLE STRING");
        int[] arr2 = {5, 10, 15, 20};
        System.out.println("Array as string : " + Arrays.toString(arr2));
        System.out.println("<-------------------------------------------------->");

        System.out.println("3. Arrays.equals() : CHECKS IF TWO ARRAYS ARE EQUAL");
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        System.out.println("Are arrays equal? : " + Arrays.equals(a1, a2));
        System.out.println("<-------------------------------------------------->");

        System.out.println("4. Arrays.copyOf() : COPIES THE FIRST N ELEMENTS OF AN ARRAY");
        int[] arr3 = {10, 20, 30, 40, 50};
        int[] copyArr = Arrays.copyOf(arr3, 3);
        System.out.println("Copied array (first 3 elements) : " + Arrays.toString(copyArr));
        System.out.println("<-------------------------------------------------->");

        System.out.println("5. Arrays.fill() : FILLS THE ENTIRE ARRAY WITH A VALUE");
        int[] arr4 = new int[5];
        Arrays.fill(arr4, 7);
        System.out.println("Array after fill(7) : " + Arrays.toString(arr4));
        System.out.println("<-------------------------------------------------->");
    }
}
