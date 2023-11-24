import java.util.ArrayList;

/**
 * The Main class demonstrates how to manage a roster with multiple days and track the days on which specific names are present.
 */
public class Main {
    public static void main(String[] args) {
        int days = 3;

        // Create a roster with an ArrayList for each day.
        ArrayList<ArrayList<String>> roster = new ArrayList<ArrayList<String>>(days);

        // Create ArrayLists to represent each day and populate them with names.
        ArrayList<String> day1 = new ArrayList<String>();
        ArrayList<String> day2 = new ArrayList<String>();
        ArrayList<String> day3 = new ArrayList<String>();

        day1.add("Alice");
        day1.add("Bob");

        roster.add(day1);

        day2.add("Alice");
        day2.add("Sam");
        day2.add("Mike");

        roster.add(day2);

        day3.add("Ray");
        day3.add("Sam");

        roster.add(day3);

        // Find and print the days on which specific names are present.
        getDays(roster, "Alice");
        getDays(roster, "Sam");
    }

    /**
     * Find and print the days on which a specific name is present in the roster.
     *
     * @param rosterTable The roster containing ArrayLists for each day.
     * @param name        The name to search for in the roster.
     */
    public static void getDays(ArrayList<ArrayList<String>> rosterTable, String name) {
        for (ArrayList<String> arrList : rosterTable) {
            for (String str : arrList) {
                if (str.contentEquals(name)) {
                    // Print the day index (1-based) on which the name is present.
                    System.out.println(rosterTable.indexOf(arrList) + 1);
                }
            }
        }
    }
}
