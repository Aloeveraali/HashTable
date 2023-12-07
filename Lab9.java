import java.util.*;
import java.io.*;
public class Lab9{

 public static void main (String[] args){
 File file = new File("/Users/eimaanali/Desktop/CS210 JAVA CODE/HashTable.txt");

 int inputSize = 90000;

 //This line initializes a string array called input with a size of 90000.
 String[] input = new String[inputSize];
 try {
    //to read data from the file
 Scanner scan = new Scanner(file);

 //Inside the loop, you read a line from the file using scan.nextLine() and assign it to the input array at index i
 for(int i = 0; i < inputSize; i++) {
 input[i] = scan.nextLine();
 }
 scan.close();

 //The catch block starts, which is executed if an exception is thrown within the try block. The caught exception is stored in the variable e.
 } catch (Exception e) {
 System.err.println(e);
 }
 int size=99991;
 Solution mysolution = new Solution();
 

 //You call the fill method of the mysolution object to create a hash table with the specified size and fill it with the input data. The resulting hash table is stored in the hashtable variable.
 String[] hashtable=mysolution.fill(size, input);

 //reate an instance of the HashTable class named mytable using the hashtable
 HashTable mytable = new HashTable(hashtable);
 Solution mysolution2 = new Solution(); //prevents cheatingy using memory
 
 //terates over the inputSize
 for(int i=0;i<inputSize;i++){

    // generate a random integer between 0 and inputSize - 1 and store it in the rand variable.
 int rand = (int)(Math.random()*inputSize);
 String temp = input[i];
 input[i]=input[rand];

 //he value at the random index rand is replaced with the original value stored in temp, effectively shuffling the elements in the input array.
 input[rand]=temp;
 }
 int total=0;
 for(int i=0;i<inputSize;i++){

//nside the loop, call the find method of the mysolution2 object to find a slot in the hash table for the current input[i]. The result is stored in the slot variable.
 int slot = mysolution2.find(size, mytable, input[i]);
 
 //compare the word retrieved from the hash table (hashtable[slot]) with the original word (input[i]). If they are not equal, it indicates a collision.java
 if(!hashtable[slot].equals(input[i])){
 System.out.println("error!");
 }
 }

 // gettotal method of the mytable object to get the total number of collisions, and you store it in the status variable.
long status=mytable.gettotal();
 System.out.println("Collisions: " + status);
 }

}


class HashTable{

 private String[] hashTable;

 //declare another private instance variable total of type long and initialize it to 0. This variable will be used to keep track of the total number of collisions 
 private long total=0;

 //constructor of the HashTable class. The constructor takes an array of String named input as a parameter when an object of this class is created.
 public HashTable(String[] input){

//Inside the constructor, you assign the input parameter to the hashTable instance variable. This initializes the hash table with the provided data.
 hashTable = input;
 }
 //this line declares a public method named check. It takes two parameters: an integer slot, which represents a slot in the hash table, and a String named check, which represents the word want to compare with the word at the slot
 public boolean check(int slot, String check){
 
 //Inside the check method, you compare the check parameter with the word stored in the hash table at the specified slot. If they are equal, it indicates that there's no collision, and the method returns true
if(hashTable[slot].equals(check)){
 return true;
 }else{

//for collisions
 total++;
 return false;
 //his line returns false, indicating that there is a collision.


 }
 }
 // total number of collisions in the hash table
 
 public long gettotal(){
 return total;
 }
} 