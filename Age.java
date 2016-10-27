import java.util.Scanner;

public class Age {
	
	//Skriv ett program som tar emot en ålder och om något annat än en siffra anges skall programmet be användaren att försöka igen

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		while(true){
		System.out.println("Enter your age:");
		try{
			age = sc.nextInt();
			break;
		}
		catch(Exception e){
			System.out.println("Invalid input, please try again");
			sc.nextLine();    //För att rensa minnet på scannern
		}
		}
	}
	
}

