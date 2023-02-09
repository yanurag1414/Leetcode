class Find_the_Pivot_Integer {
    public int pivotInteger(int n) {
        if(n==1){
            return n;
        }
        for(int i=1;i<=n;i++){
            int t=n-i+1;
            if((i*(i+1))/2==(t*(i+n))/2){
                return i;
            }
        }
        return -1;
    }
}