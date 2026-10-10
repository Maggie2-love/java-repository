import java.util.Scanner;

	public class NokiaMesaageMenu{

	public static void main(String [] args){

Scanner inputCollector = new Scanner(System.in);

String prompt = """
==================================================================================
   Welcome to Nokia 5510
1. Phone book 
2. Messages 
3. Chat 
4. Call register 
5. Tones 
6. Settings 
7. Call divert 
8. Music 
9. Games 
10. Calculator 
11. Reminders 
12. Clock 
13. Profiles 
14. Services 
15. SIM services2 
 =================================================================================
 """;


		System.out.println(prompt);
		System.out.print("Select: ");
		int menuChoice = inputCollector.nextInt();
    
		
  String pick = """	
	==========Phone book=================
	1. Search 
	2. Service Nos. 
	3. Add name 
	4. Erase 
	5. Edit 
	6. Copy 
	7. Assign tone 
	8. Send b’card 
	9. Options 
	1. Memory in use 
	2. Type of view 
	3. Memory status 
	10. Speed dials 
	11. Voice tags
	============================
	""";
		
	  System.out.println(pick);
		System.out.print("Select: ");
		int menuChoice = inputCollector.nextInt();
		
		
		
		switch (pick){
		case 1:
		System.out.println("search selected.");
		break;
		case 2:
		System.out.println("service nos selected.");
		break;
		System.out.print("Enter name:");
		String addname = inputCollector.next();
		System.out.print("Save " , addname);
		}
		break;
		
		

			case 2:
        System.out.println("MESSAGES");
        System.out.println("1. Write messages");
        System.out.println("2. Inbox");
        System.out.println("3. Outbox");
        System.out.println("4. Exit");

        System.out.print("Select: ");
        int choice = inputCollector.nextInt();

        switch (choice) {

            case 1:
              

                System.out.println("\nWRITE MESSAGES");
                inputCollector.nextLine();
                
                System.out.print("Write your message: ");
                String message = inputCollector.nextLine();

                System.out.println("\nOPTIONS");
                System.out.println("1. Send");
                System.out.println("2. Template");
                System.out.println("3. Insert smiley");
                System.out.println("4. Send by set");
                System.out.println("5. Save");
                System.out.println("6. Erase");
                System.out.println("7. Exit");

                System.out.print("Select: ");
                int option = inputCollector.nextInt();
                
                

                switch (option) {

                    case 1:
                        System.out.print("Enter recipient phone number: ");
                        String phoneNumber = inputCollector.next();

                        System.out.println("Message sent to " + phoneNumber);
                        break;

                    case 2:
                        System.out.println("Template selected.");
                        break;

                    case 3:
                        System.out.println("Insert smiley selected.");
                        break;

                    case 4:
                        System.out.println("Send by set selected.");
                        break;

                    case 5:
                        System.out.println("Message saved.");
                        break;

                    case 6:
                        System.out.println("Message erased.");
                        break;

                    case 7:
                        System.out.println("Exit.");
                        break;

                    default:
                        System.out.println("Invalid option.");
                }
                break;


            case 2:
                System.out.println("\nINBOX");
                System.out.println("1. Read message");
                System.out.println("2. Exit");

                System.out.print("Select: ");
                int inboxChoice = inputCollector.nextInt();

                if (inboxChoice == 1) {

                    System.out.println("\nREAD MESSAGE");
                    System.out.println("Hello! This is a Maggie, send me your account number.");

                    System.out.println("\nOPTIONS");
                    System.out.println("1. Erase");
                    System.out.println("2. Reply");
                    System.out.println("3. Chat");
                    System.out.println("4. Edit");
                    System.out.println("5. Use number");
                    System.out.println("6. Forward");
                    System.out.println("7. Details");

                    System.out.print("Select: ");
                    int inboxOption = inputCollector.nextInt();

                    switch (inboxOption) {

                        case 1:
                            System.out.println("Message erased.");
                            break;

                        case 2:
                            System.out.println("Reply selected.");
                            break;

                        case 3:
                            System.out.println("Chat selected.");
                            break;

                        case 4:
                            System.out.println("Edit selected.");
                            break;

                        case 5:
                            System.out.println("Use number selected.");
                            break;

                        case 6:
                            System.out.println("Forward selected.");
                            break;

                        case 7:
                            System.out.println("Details selected.");
                            break;

                        default:
                            System.out.println("Invalid option.");
                    }
                }
                break;


            case 3:
                System.out.println("\nOUTBOX");
                System.out.println("1. Read saved message");
                System.out.println("2. Exit");

                System.out.print("Select: ");
                int outboxChoice = inputCollector.nextInt();

                if (outboxChoice == 1) {

                    System.out.println("\nSAVED MESSAGE");
                    System.out.println("Please come see me tomorrow. Thanks.");

                    System.out.println("\nOPTIONS");
                    System.out.println("1. Erase");
                    System.out.println("2. Edit");
                    System.out.println("3. Use number");
                    System.out.println("4. Forward");

                    System.out.print("Select: ");
                    int outboxOption = inputCollector.nextInt();

                    switch (outboxOption) {

                        case 1:
                            System.out.println("Message erased.");
                            break;

                        case 2:
                            System.out.println("Edit selected.");
                            break;

                        case 3:
                            System.out.println("Use number selected.");
                            break;

                        case 4:
                            System.out.println("Forward selected.");
                            break;

                        default:
                            System.out.println("Invalid option.");
                    }
                }
                break;




            case 4:
                System.out.println("Exiting Messages.");
                break;


            default:
                System.out.println("Invalid choice.");
        }

       
    }
}




