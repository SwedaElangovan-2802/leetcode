class Solution {
    public int maxDistance(int[] c) {
        int j = c.length;
        for(int i = 0; i < j; i++){
            if (c[i] != c[j-1] || c[j - 1 - i] != c[i])
                return j - 1 - i;
        }
        return 0;
    }
}