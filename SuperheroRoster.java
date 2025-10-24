public class SuperheroRoster {
    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
        String[] heros = {"Elektra", "Strom", "Scarlet Witch", "Gamora"};
        String[] abilities = {"Martial Arts", "Weather Control", "Reality Manipulation", "Super Strength"};
        int[] powerLevels = {85, 90, 95, 80};

        // 2. Print each hero's details using a loop
        // for (int i = 0; i < heroNames.length; i++) { ... }
        for (int i = 0; i < heros.length; i++) {
            System.out.println("Hero: " + heros[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
        }

        // 3. Call the searchHero method to find a specific hero by name
        searchHero(heros, abilities, powerLevels, "Gamora");
        // 4. Calculate and display the average power level by calling calculateAveragePower method
        System.out.println("Average Power Level: " + calculateAveragePower(powerLevels));
    }
 
    // Method: searchHero
    public static void searchHero(String[] name, String[] abilities, int[] powerLevels, String target) {
        // Implement a loop to search for the hero by name
        // If found, print the hero's details
        // If not found, display a message
        boolean isFound = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(target)) {
                System.out.println("Hero found: " + name[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Hero not found.");
        }
    }
 
    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        // Implement the calculation for average power level
        // Return the calculated average
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        int average = sum / powerLevels.length;
        return average;
    }
}
