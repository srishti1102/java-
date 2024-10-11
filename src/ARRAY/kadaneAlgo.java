package ARRAY;

public class kadaneAlgo {
    public static void main(String[] args) {
        int []nums={-2,-3,4,-1,-2,1,5,-3};
        int maxSum=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }
}
