# #Overview
This lab focuses on developing an effective strategy for filling a hash table while minimizing the number of collisions. Participants are encouraged to explore various hashing strategies to achieve this goal. The primary challenge lies in the implementation of efficient fill() and find() methods within a predefined HashTable class.

 # #Objective
Implement the fill() method to populate the hash table with words.
Implement the find() method to locate the slot number of a specific word in the hash table.
Optimize both methods to reduce the number of collisions.
# #Hash Table Class
The provided HashTable class includes a check() method, which is used to detect collisions during the hashing process. Each unsuccessful check() call (indicating a collision) increments a counter. The aim is to keep this counter as low as possible.

# #Requirements
# #Data Handling:
The input handling is already implemented. Your task is to focus on the fill() and find() methods.
# #Hashing Strategy:
Develop a strategy for mapping words to slot numbers. This might involve operations like summing the ASCII values of letters and then applying a modulo operation with the hash table size.
# #Collision Metrics:
Aim to keep the number of collisions below 200,000 for a good performance, and below 150,000 for an excellent performance.
# #Lab Setup
# #Hash Table Size:
99,991
# #Number of Items: 
90,000
# #Load Factor: 
Approximately 90%
# #Challenge
Given the high load factor, devising an efficient hashing strategy is crucial for minimizing collisions.

# #Error Handling
If the output displays "error!", it indicates that the find() method is unable to correctly locate words in the hash table.

# #Getting Started
Clone this repository.
Implement the fill() and find() methods in the provided HashTable class.
Test your implementation and observe the number of collisions.
Iterate and improve your hashing strategy to reduce collisions.
