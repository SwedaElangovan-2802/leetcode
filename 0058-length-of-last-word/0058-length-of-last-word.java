class Solution {
    public int lengthOfLastWord(String s) {
        String[] t = s.split(" ");
        int n = t.length;
        return t[n-1].length();

    }
}