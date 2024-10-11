package ARRAY;

public class binary_search {
    public static int  binary_search(int[] num, int key) {
        int start = 0;
        int end = num.length - 1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (num[mid]==key) {
                System.out.println(mid);
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={1,2,5,6,7,9,11,13};
        int key=9;
        System.out.println(binary_search(num,key));
    }
}
