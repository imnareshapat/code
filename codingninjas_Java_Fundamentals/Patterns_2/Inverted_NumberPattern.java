/*      Code : Inverted Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1
*/

package codingninjas_Java_Fundamentals.Patterns_2;
import java.util.Scanner;
public class Inverted_NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        while(rows > 0) {
            for(int i=1; i<=rows; i++){
                System.out.print(rows);
            }
            System.out.println();
            rows--;
        }
    }
}
