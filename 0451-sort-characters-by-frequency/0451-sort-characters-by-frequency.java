class Solution {
    public String frequencySort(String s) {
        int [] freq = new int[128];
        for ( int i = 0; i <s.length(); i++){
            freq[s.charAt(i)]++;
        }
        StringBuilder ans = new StringBuilder();
        while(ans.length() < s.length()){
            int maxFreq = 0;
            int index = -1;

            for (int i = 0; i < 128; i++){
                if (freq[i] > maxFreq){
                    maxFreq = freq[i];
                    index = i;                  
            }
        }while (maxFreq > 0){
            ans.append((char)index);
            maxFreq--;
        }freq[index]=0;
        }
        return ans.toString(); 
        
    }
}