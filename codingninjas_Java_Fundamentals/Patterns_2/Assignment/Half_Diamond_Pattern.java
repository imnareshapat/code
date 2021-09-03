/*      Half Diamond Pattern

Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*                       */
package codingninjas_Java_Fundamentals.Patterns_2.Assignment;
import java.util.Scanner;
public class Half_Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for(int i= 1; i<=n+1; i++){

            for(int j=1; j<=i; j++){

                if(j==1){
                System.out.print("*");

            } else {

                System.out.print(j-1);

            }
            }

                for(int j= i-1; j>=1; j--) {

                    if(j==1) {

                        System.out.print("*");

                    } else {
                        System.out.print(j-1);
                    }
                }
                System.out.println();
        }

        if(n==0) {
            System.out.println("*");
            return ;
        }
            for(int i=1; i<=n; i++){

                for(int j=1; j<= (n-i+1); j++) {
                    if(j==1) {
                        System.out.print("*");
                    } else {
                        System.out.print(j-1);
                    }
                }
                for(int j =n-i; j>=1; j--) {
                    if(j==1){
                        System.out.print("*");
                    } else {
                        System.out.print(j-1);
                    }
                }
            System.out.println();
        }

    }
}
