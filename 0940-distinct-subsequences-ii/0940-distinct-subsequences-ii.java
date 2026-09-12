class Solution {
    public int distinctSubseqII(String s) {

        int mod = 1000000007;
        long total = 0;

        long[] last = new long[26];

        for (char c : s.toCharArray()) {

            int index = c - 'a';

            long newSub = (total + 1) % mod;

            total = (total + newSub - last[index] + mod) % mod;

            last[index] = newSub;
        }

        return (int) total;
    }
}