
//This program reverse the user input number

package assignment.reversenumber.com;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter the number to reverse: ");
		int inputNo = number.nextInt();
		
		int reverseNo = 0;
		
		while(inputNo!=0) {
			int digit = inputNo%10;
			reverseNo = reverseNo*10+digit;
			
			inputNo/=10;
		}
		
		
		System.out.println(" The reverse number is " + reverseNo);
		
		
		
		

	}

}
