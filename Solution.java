class Solution {

    private int primaryHash(String word, int size) {
        int hash = 0;
        for (int i = 0; i < word.length(); i++) {
            hash = (31 * hash + word.charAt(i)) % size;
        }
        return hash;
    }

    private int secondaryHash(String word, int size) {
        int hash = 1;
        for (int i = word.length() - 1; i >= 0; i--) {
            hash = (17 * hash + word.charAt(i)) % size;
        }
        return 1 + hash % (size - 1);
    }

    public int find(int size, HashTable mytable, String word) {
        int hash1 = primaryHash(word, size);
        int hash2 = secondaryHash(word, size);

        for (int i = 0; i < size; i++) {
            int key = (hash1 + i * hash2) % size;
            if (mytable.check(key, word)) {
                return key;
            }
        }
        return -1; // In case the word is not found
    }

    public String[] fill(int size, String[] array) {
        String[] hashtable = new String[size];
        for (String word : array) {
            int hash1 = primaryHash(word, size);
            int hash2 = secondaryHash(word, size);

            for (int i = 0; i < size; i++) {
                int key = (hash1 + i * hash2) % size;
                if (hashtable[key] == null) {
                    hashtable[key] = word;
                    break;
                }
            }
        }
        return hashtable;
    }
}
