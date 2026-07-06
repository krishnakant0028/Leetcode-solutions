class Solution {
    public int maximumPopulation(int[][] logs) {
        

        int[] years = new int[101]; // 1950 to 2050

        // Difference Array
        for (int[] log : logs) {
            years[log[0] - 1950]++;     // Birth
            years[log[1] - 1950]--;     // Death
        }

        int population = 0;
        int maxPopulation = 0;
        int answer = 1950;

        // Prefix Sum
        for (int i = 0; i < 101; i++) {
            population += years[i];

            if (population > maxPopulation) {
                maxPopulation = population;
                answer = i + 1950;
            }
        }

        return answer;
    }
}
        
