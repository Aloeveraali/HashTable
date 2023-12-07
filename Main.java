public class Main {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew"};

        int size = 10; // Adjust the size of the hash table as needed

        //This line creates an object of the HashTable class. The constructor seems to take an array of strings as an argument, here initialized to the size specified by size
        HashTable hashTable = new HashTable(new String[size]);

        //This line creates an object of the Solution class. The purpose of this class is not clear from the snippet but it's likely used to implement some hash table functionality.
        Solution solution = new Solution();

        //This line calls the fill method of the Solution object, passing size and data as arguments. It's presumably used to fill the hash table with the data from the data array. The method returns a String[] that is stored in hashtable
        String[] hashtable = solution.fill(size, data);

        //This line calls the getTotal method of the hashTable object. This method likely returns the total number of collisions that occurred during the hashing process, which is stored in totalCollisions.
        int totalCollisions = hashTable.getTotal();
        System.out.println("Total collisions during fill: " + totalCollisions);

        // Test finding words in the hash table
        String wordToFind = "banana";

        //This line calls the find method of the Solution object, passing size, hashTable, and wordToFind as arguments. It's likely used to find the position (slot) of the word in the hash table. The return value is stored in slot.
        int slot = solution.find(size, hashTable, wordToFind);

        //This line starts an if statement checking if slot is not equal to -1. A value of -1 typically indicates that the item was not found
        if (slot != -1) {
            System.out.println("Found '" + wordToFind + "' at slot " + slot);
        } else {
            System.out.println("Error! '" + wordToFind + "' not found in the hash table.");
        }
    }
}