class Solution {
    public int maxDistance(int[] a) {
        int n = a.length;
        int l = 0; 
        int r = 0;
        for(int i = 0; i < n; i++){
            if(a[i] != a[n-1]){
              l = i;
              break;  
            } 
        }
        for(int i = n - 1; i >=0; i--){
            if(a[i] != a[0]){
                r = i;
                break;
            } 
        }
        return Math.max(n - 1 - l, r);
    }
}