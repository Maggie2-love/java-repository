import java.util.Scanner;

public class CustomerServiceApplication{

	public static void main(String [] args){

		Scanner inputCollector = new Scanner(System.in);
String prompt = """

Welcome to Catalysts Phone Scam Network

Press

1  to listen in English
2  to listen in Yoruba
3 to listen in Hausa

""";



		System.out.println(prompt);
		int menuChoice = inputCollector.nextInt();

		switch(menuChoice){

			case 1 -> {System.out.println("Listening in English");  
String englishPrompt = """

Welcome to English Menu

Press

1  to borrow
2  to pay your debt
3  to recharge


""";
			System.out.println(englishPrompt);
			int englishMenuChoice = inputCollector.nextInt();
			switch(englishMenuChoice){

			case 1 -> System.out.println("You want to borrow again abi?"); 
			case 2 -> System.out.println("You have not paid the last one o"); 
			case 3 -> System.out.println("Until you pay your debt, we no go allow you ");
			default -> System.out.println("Go work........");
			
			}
			}
			case 2 -> System.out.println("Listening in Yoruba"); 
			case 3 -> System.out.println("Listen in Hausa"); 
			default-> System.out.println("My guy, how far?"); 

		}

	}

}
