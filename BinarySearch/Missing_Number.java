package BinarySearch;

class Missing_Number {
    public static void main(String[] args) {
        int[] num={0,1};
        System.out.println(missingNumber(num));
    }
    public static int missingNumber(int[] nums) {
        int len=nums.length;
        int sum=(len*(len+1))/2;
        int tsum=0;
        for(int i=0;i<len;i++){
            tsum+=nums[i];
        }
        return sum-tsum;
    }        
}