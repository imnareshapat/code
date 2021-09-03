/*      Code : Mirror Image Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4

...1
..12
.123
1234

The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1 
    12
  123
Sample Input 2:
4
Sample Output 2:
      1 
    12
  123
1234
*/
package codingninjas_Java_Fundamentals.Patterns_2;
import java.util.Scanner;
public class Mirror_ImageNumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while( i <= n) {
            
            int spaces = 1;
            while(spaces <= n - i) {
                System.out.print(' ');
                spaces = spaces + 1;

            }
            int stars = 1 ;
            while(stars <= i ) {
                System.out.print(stars);
                stars = stars + 1;
            }
            System.out.println();
            i = i + 1;

        }

    }
}
