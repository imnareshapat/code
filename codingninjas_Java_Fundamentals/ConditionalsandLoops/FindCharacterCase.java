/*      Find Character Case
Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet

Input format :
Single Character
Output format :
1 or 0 or -1

Constraints :
Input can be any character

Sample Input 1 :
v
Sample Output 1 :
0

Sample Input 2 :
V
Sample Output 2 :
1
Sample Input 3 :
#

Sample Output 3 :
-1
*/
package codingninjas_Java_Fundamentals.ConditionalsandLoops;
import java.util.Scanner;
public class FindCharacterCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String charOne = sc.nextLine();
        
        char charVar=charOne.charAt(0);
        
        if(Character.isUpperCase(charVar)) {
            System.out.println("1");
        }
        else if(Character.isLowerCase(charVar)) {
            System.out.println("0");
        } else { 
            System.out.println("-1");
        }

    }
}
