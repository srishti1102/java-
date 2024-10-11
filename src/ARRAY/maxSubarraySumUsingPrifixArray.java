package ARRAY;

public class maxSubarraySumUsingPrifixArray {
    public static void main(String[] args) {
        int []nums={1,-2,6,-1,3};
        int maxSum=0;
        int result=0;
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        // calculate prefix array;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1] +nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++) {
            int end=j;
            maxSum= start==0 ?prefix[end] :prefix[end]-prefix[start-1];
            if(result<maxSum){
                result=maxSum;
            }
        }
        }
        System.out.println(maxSum);
    }
}
