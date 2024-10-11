package ARRAY;

public class max_subarray_sum {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int maxSum = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                maxSum=0;
                for (int k = start; k <= end; k++)
                    maxSum = maxSum + arr[k];
                System.out.println(maxSum);

            }
            if (result < maxSum) {
                result = maxSum;
            }
        }
        System.out.println(" max sum =" +result);
    }
}
