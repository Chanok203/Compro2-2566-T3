package Final_Example;

public class CumulativeSum {
    static void compute(int[] arr, int i) {
        if ( arr.length <= i) {
            return;
        }
        arr[i] = arr[i-1] + arr[i];
        compute(arr, i+1);
    }
    public static void main(String[] args) {
        // input: {5,8,9,6,4,7,8}
        int[] arr = {0, 5, 8, 9, 6, 4,7, 8};
        compute(arr, 1);

        for (int i = 1; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        // output: 5 13 22 28 32 39 47
    }
}
