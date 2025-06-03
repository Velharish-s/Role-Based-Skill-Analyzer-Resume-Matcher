import java.util.Scanner;
public class InputCentre {
	static Scanner scan=new Scanner(System.in);
	static int intGetter() {
		int givenValue=0;
		try {
			System.out.print("Enter:");
			givenValue=scan.nextInt();
			scan.nextLine();
			return givenValue;
		}catch(Exception e) {
			scan.nextLine();
			System.out.println("Invalid");
			return 0;
		}
	}
	static String stringGetter() {
		System.out.print("File Path:");
		return scan.next();
	} 
}
