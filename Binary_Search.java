class Binary_Search {
    public int search(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
        
    }  
}