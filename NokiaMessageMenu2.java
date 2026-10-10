import java.util.Scanner;

public class NokiaMessageMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      
String prompt = """
=============================================================================
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
 ===========================================================================
 """;
 
 
		System.out.println(prompt);
		System.out.print("Select: ");
		int menuChoice = input.nextInt();
        
        
    
		switch(menuChoice){

			case 2:    
        
        int choice;

        do {
            System.out.println("\nMESSAGES");
            System.out.println("1. Write messages");
            System.out.println("2. Inbox");
            System.out.println("3. Outbox");
            System.out.println("4. Exit");

            System.out.print("Select: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    int writeOption;

                    do {
                        System.out.println("\nWRITE MESSAGES");
                        System.out.print("Write your message: ");
                        String message = input.nextLine();

                        System.out.println("\nOPTIONS");
                        System.out.println("1. Send");
                        System.out.println("2. Template");
                        System.out.println("3. Insert smiley");
                        System.out.println("4. Send by set");
                        System.out.println("5. Save");
                        System.out.println("6. Erase");
                        System.out.println("7. Back");

                        System.out.print("Select: ");
                        writeOption = input.nextInt();
                        input.nextLine();

                        switch (writeOption) {

                            case 1:
                                System.out.print("Enter recipient phone number: ");
                                String phoneNumber = input.nextLine();

                                System.out.println(
                                    "Message sent to " + phoneNumber
                                );
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
                                System.out.println("Returning to Messages.");
                                break;

                            default:
                                System.out.println("Invalid option.");
                        }

                    } while (writeOption != 7);

                    break;


                case 2:
                    int inboxChoice;

                    do {
                        System.out.println("\nINBOX");
                        System.out.println("1. Read message");
                        System.out.println("2. Back");

                        System.out.print("Select: ");
                        inboxChoice = input.nextInt();

                        if (inboxChoice == 1) {

                            System.out.println("\nREAD MESSAGE");
                            System.out.println(
                                "Hello! This is a message."
                            );

                            System.out.println("\nOPTIONS");
                            System.out.println("1. Erase");
                            System.out.println("2. Reply");
                            System.out.println("3. Chat");
                            System.out.println("4. Edit");
                            System.out.println("5. Use number");
                            System.out.println("6. Forward");
                            System.out.println("7. Details");
                            System.out.println("8. Back");

                            System.out.print("Select: ");
                            int inboxOption = input.nextInt();

                            switch (inboxOption) {

                                case 1:
                                    System.out.println(
                                        "Message erased."
                                    );
                                    break;

                                case 2:
                                    System.out.println(
                                        "Reply selected."
                                    );
                                    break;

                                case 3:
                                    System.out.println(
                                        "Chat selected."
                                    );
                                    break;

                                case 4:
                                    System.out.println(
                                        "Edit selected."
                                    );
                                    break;

                                case 5:
                                    System.out.println(
                                        "Use number selected."
                                    );
                                    break;

                                case 6:
                                    System.out.println(
                                        "Forward selected."
                                    );
                                    break;

                                case 7:
                                    System.out.println(
                                        "Details selected."
                                    );
                                    break;

                                case 8:
                                    System.out.println(
                                        "Returning to Inbox."
                                    );
                                    break;

                                default:
                                    System.out.println(
                                        "Invalid option."
                                    );
                            }
                        }

                    } while (inboxChoice != 2);

                    break;


                case 3:
                    int outboxChoice;

                    do {
                        System.out.println("\nOUTBOX");
                        System.out.println("1. Read saved message");
                        System.out.println("2. Back");

                        System.out.print("Select: ");
                        outboxChoice = input.nextInt();

                        if (outboxChoice == 1) {

                            System.out.println("\nSAVED MESSAGE");
                            System.out.println(
                                "This is a saved message."
                            );

                            System.out.println("\nOPTIONS");
                            System.out.println("1. Erase");
                            System.out.println("2. Edit");
                            System.out.println("3. Use number");
                            System.out.println("4. Forward");
                            System.out.println("5. Back");

                            System.out.print("Select: ");
                            int outboxOption = input.nextInt();

                            switch (outboxOption) {

                                case 1:
                                    System.out.println(
                                        "Message erased."
                                    );
                                    break;

                                case 2:
                                    System.out.println(
                                        "Edit selected."
                                    );
                                    break;

                                case 3:
                                    System.out.println(
                                        "Use number selected."
                                    );
                                    break;

                                case 4:
                                    System.out.println(
                                        "Forward selected."
                                    );
                                    break;

                                case 5:
                                    System.out.println(
                                        "Returning to Outbox."
                                    );
                                    break;

                                default:
                                    System.out.println(
                                        "Invalid option."
                                    );
                            }
                        }

                    } while (outboxChoice != 2);

                    break;


                case 4:
                    System.out.println("Exiting Messages.");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}

}
