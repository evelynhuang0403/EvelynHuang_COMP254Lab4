package Exercise1;

public class Exercise1Runnable {
    public static void main(String[] args) {
        // Initialize a new Linked Position List - City
        PositionalList<String> cityList = new LinkedPositionalList<>();

        // Add cities to the list, store the positions returned by the addLast method
        Position<String> pos1 = cityList.addLast("Toronto");
        Position<String> pos2 = cityList.addLast("New York");
        Position<String> pos3 = cityList.addLast("Tokyo");
        Position<String> pos4 = cityList.addLast("London");
        Position<String> pos5 = cityList.addLast("Paris");

        // Print the contents of the positional list
        System.out.println("List contents: " + cityList);

        // Print the index of each position
        System.out.println("\nIndex of Toronto: " + cityList.indexOf(pos1));
        System.out.println("Index of New York: " + cityList.indexOf(pos2));
        System.out.println("Index of Tokyo: " + cityList.indexOf(pos3));
        System.out.println("Index of London: " + cityList.indexOf(pos4));
        System.out.println("Index of Paris: " + cityList.indexOf(pos5));

        // if we remove the first position, the index of the remaining positions should change
        System.out.println("\nRemoving Toronto...");
        cityList.remove(pos1);
        System.out.println("list after removing Toronto: " + cityList);
        System.out.println("Index of New York: " + cityList.indexOf(pos2));
        System.out.println("Index of Tokyo: " + cityList.indexOf(pos3));
        System.out.println("Index of London: " + cityList.indexOf(pos4));
        System.out.println("Index of Paris: " + cityList.indexOf(pos5));

        // pos 1 no longer exists, so we cannot get its index
        System.out.println("\nTrying to get index of removed position (Toronto):");
        try {
            System.out.println("Index of Toronto: " + cityList.indexOf(pos1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
