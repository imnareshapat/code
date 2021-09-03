/*      Odd Square
Send Feedback
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357           */
package codingninjas_Java_Fundamentals.Patterns_2.Assignment;
import java.util.Scanner;
public class Odd_Square {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        
        for(int i =1; i<=n; i++){
			int oddNum = 2*i-1;
            
            for(int j =1; j<=n; j++){
            System.out.print(oddNum);
            oddNum = oddNum+2;
            //oddNum+=2;
            
            if(oddNum == (2*n+1)) {
                oddNum=1;
            }
                
        }
        System.out.println();
	}
}
}

