class Solution {
     public static int  maximumPopulation(int[][] num) {

        int[] populationChanges = new int[2051];
        for(int[] log:num){
            int birth=log[0];
            int death=log[1];
            populationChanges[birth]++;
            populationChanges[death]--;
        }
        int maxPopulation = 0;
        int currentPopulation = 0;
        int earliestYear = 0;
        for (int year = 1950; year <= 2050; year++) {
            currentPopulation += populationChanges[year];

            // If the current population is greater than the max found so far, update the
            // result
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                earliestYear = year;
            }
        }
        return earliestYear;

    }
}