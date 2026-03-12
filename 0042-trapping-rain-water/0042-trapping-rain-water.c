int trap(int* h, int n) {
    int l=0, r=n-1, lmax= h[l], rmax=h[r], ans=0;
    while(l<r){
        if(h[l]<h[r]){
            if(h[l]>lmax) lmax=h[l];
            else ans += lmax-h[l];
            l++;
        }else{
            if(h[r]>rmax) rmax = h[r];
            else ans += rmax-h[r];
            r--;
        }
    }
    return ans;
}