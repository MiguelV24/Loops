import java.util.*;

public class Fun{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a starting number: ");
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}
}