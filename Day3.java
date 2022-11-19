    import java.util.Scanner;  
public class Day3  
{  
public static void main(String args[])  
{  
	System.out.print("Enter a character: ");  
	Scanner sc = new Scanner(System.in);  
	char ch = sc.next().charAt(0);  
	int asciiValue = ch;  
	System.out.println("ASCII value of " +ch+ " is: "+asciiValue);  
	}  
}  