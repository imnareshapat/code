/*   Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/
package codingninjas_Java_Fundamentals.Patterns_1;
import java.util.Scanner;
public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        while(i >= 1) {
           
            int j = i;
            while(j <= n) {
                
                char p = (char) ('A' + j-1);
                j =j+1;
                System.out.print(p);
            }
            System.out.println();
            i=i-1;
    }
}
}
