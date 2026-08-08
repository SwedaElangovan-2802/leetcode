class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        for(String j : word1) res1.append(j);
        for(String i : word2) res2.append(i);
        return res1.toString().equals(res2.toString());
    }
}