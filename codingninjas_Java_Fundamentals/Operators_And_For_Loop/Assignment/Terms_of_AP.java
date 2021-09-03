/*          Terms of AP

Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17          */
package codingninjas_Java_Fundamentals.Operators_And_For_Loop.Assignment;
import java.util.Scanner;
public class Terms_of_AP {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
        int n =sc.nextInt();
        int count=1;
        int i=1;
        while(count<=n) {
            int sum=3*i+2;
            if(sum%4!=0) {
                System.out.print(sum+" ");
                count++;
            }
            i++;
        }
	}
}
