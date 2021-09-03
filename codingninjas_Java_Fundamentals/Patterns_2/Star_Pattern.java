/*  Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******            */
package codingninjas_Java_Fundamentals.Patterns_2;
import java.util.Scanner;
public class Star_Pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i= 1;
        
        while(i <= n) {
            int j = 1;
           int  space = n -i;
            
            while(space > 0) {
                System.out.print(" ");
                space--;
                
            }
            while(j <= (2 * i )-1) {
                System.out.print("*");
                j = j + 1;
                
            }
            
            System.out.println();
            i = i +1;
        }
    }
}
