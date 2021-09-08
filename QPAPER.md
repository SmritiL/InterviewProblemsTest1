<p align="center">
  <img src="https://user-images.githubusercontent.com/70141886/132481207-f7fc9021-4fd5-4f8a-a97e-d0b382658bfc.png" />
</p>

# ISA MPSTME Technical Software Department - Test Round 1

## Instructions

Welcome! This test shall begin at **8PM IST, September 9th, 2021 (Thursday).**  
Duration: 19 hrs  
Final submission: **3PM IST, September 9th, 2021 (Thursday)**

### Question Information

There are 3 questions as present below. Time division per-question is up to you. 

## Questions

**1. Design a program that takes a String input 'S'.  
It must check whether the given string is a palindrome or not. 's' can consist of all possible characters included in the ASCII table and more**

### Constraints:  
`0 < s.length < 2 x 10^(5)`

### Example:  
i.) Input:- `'abcd efgh hgfe dcba'`
    Output:- `'True'`  
ii.) Input:- `'hello123321hello'`
    Output:- `'False'`  

____

**2. Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).  
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
Notice that you may not slant the container.**

### Constraints:
`n == height.length`   
`2 <= n <= 105`  
`0 <= height[i] <= 104`  

### Example:
i.) Input: `height = [12,3,7,9,2,8,5,10,6]`
    Output: `70`

____

**3. Prerequisite reading :-
[Vigenère Cipher](https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher)**

* You are each **given a set of strings numbered '1' and '2'**. Along with that, you are provided with a **Vigenère table and a set of 'substring keys'.**  
* Your **3rd task is to find the first index of each occurrence of the given substrings in String 1.**  
* Taking the indexes, you must **find the characters present in the 2nd string at the locations you got from your first result.**  
* You shall see that they will make up a **repetitive Vigenère key.**  
* You must **use the key and decipher the original substring keys given to you.**  
* You must **design a function that takes a string and the key you found out as input, and use the table to decipher it accordingly.**

### Constraints:
0 < s1.length < 2 x 10^(7)
0 < s2.length < 2 x 10^(7)

### Due to the sensitivity of this question, no examples have been provided for the same.

> Note: To simplify your work a little bit for this question, we are hereby providing code snippets which shall generate a Vigenère table for you in your code that you can reference and use. If possible, refrain from using it, but do understand that this will not negatively affect your solution. 
> This is available only for the Python, C++ and Java languages.
#### Python
```python
vigenereTable = list()
for i in range(0,26):
    inc = 0
    vigRow = list()
    for j in range(0,26):
        if (i+65+inc)>90:
            vigRow.append(chr((i+65+inc)-26))
            inc+=1
        else:
            vigRow.append(chr(i+65+inc))
            inc+=1
    vigenereTable.append(vigRow)
```
#### Java
```java
public class vigenereTableGeneratorJava
{
    public static void main (String[]args)
    {
        char[][] vigenereTable = new char[26][26];
        for (int i = 0; i <= 25; i++)
        {
	        int inc = 0;
	        for (int j = 0; j <= 25; j++)
	        {
	            if (i + 65 + inc > 90)
	            {
		            vigenereTable[i][j] = (char) ((i + 65 + inc) - 26);
		            inc++;
	            }
	            else
	            {
		            vigenereTable[i][j] = (char) (i + 65 + inc);
		            inc++;
	            }
	        }
        }
      // Printing function
        for (int i = 0; i <= 25; i++)
        {
	        for (int j = 0; j <= 25; j++)
	        {
	            System.out.print (vigenereTable[i][j]);
	        }
	    System.out.print ("\n");
        }
    }
}
```
### C++14
```cpp
#include<iostream>
int main(){
    std::string vigenereTable[26][26];
    for(int i = 0; i<=25; i++){
        int inc = 0;
        for(int j = 0; j<=25; j++){
            if(i+65+inc >90){
                vigenereTable[i][j] = (char)((i+65+inc)-26);
                inc++;
            }
            else{
                vigenereTable[i][j] = (char)(i+65+inc);
                inc++;   
            }
        }
    }
    for(int i = 0; i<=25; i++){
        for(int j = 0; j<=25; j++){
            std::cout<<vigenereTable[i][j];
        }
        std::cout<<std::endl;
    }
    return 0;
}
```
### Example Vigenère table:  
![image](https://user-images.githubusercontent.com/70141886/132496008-3e82c02c-109d-4998-8e5e-4c367814970e.png)
