class Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    public int maximumCount(int[] nums) {
       int pcount=0;
       int ncount=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]<0){
               ncount++;
           }else if(nums[i]==0){
               continue;
           }else{
               pcount++;
           }
       }
       if(pcount>ncount){
           return pcount;
       }
        return ncount;
    }
}