/*          Sum of Two Arrays
Send Feedback
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
Note:
The sizes N and M can be different. 

Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 

No need to print the elements of the output array/list.
Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the required sum of the arrays/list in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec               */
package codingninjas_Java_Fundamentals.Arrays_2;

public class Sum_of_Two_Arrays {
    
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=output.length-1;
        int carry=0;
        int r=0;
        int sum=0;
        
        while(i>=0 && j>=0) {
            sum=arr1[i]+arr2[j]+carry;
            r=sum%10;
            carry=sum/10;
            output[k]=r;
            i--;
            j--;
            k--;
        }
        while(i>=0) {
            sum=arr1[i]+carry;
            r=sum%10;
            carry=sum/10;
            output[k]=r;
            i--;
            k--;
        }
        while(j>=0) {
            sum=arr2[j]+carry;
            r=sum%10;
            carry=sum/10;
            output[k]=r;
            j--;
            k--;
        }
        output[0]=carry;
    }


}
