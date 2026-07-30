class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length; 
        int max = 0;
        for(int c:candies){
            max = Math.max(max, c);
        }

        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ans.add(candies[i] + extraCandies >= max);
        }
        return ans;
    }
}