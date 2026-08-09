class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> list = new ArrayList<>();
        boolean[] flag = new boolean[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j] && !flag[j]){
                    list.add(nums1[i]);
                    flag[j] = true;
                    break;
                }
            }
        }

        int[] res = new  int[list.size()];
        int i=0;
        for(int n : list){
            res[i] = n; 
            i++;
        } 
        return res;

       
    }
}