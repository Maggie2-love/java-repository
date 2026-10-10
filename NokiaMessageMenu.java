//DISPLAY “MESSAGES”
//Display "1. Write messages”
//Display “2. Inbox”
//Display “3. Outbox”
//Display “4. Exit”

//Input Choice

//IF choice is 1 then

//Display "Write messages"
//Input message

//Display "OPTIONS"
//Display "1. Send"
//Display "2. Template"
//Display "3. Insert smiley"
//Display "4. Send by set"
//Display "5. Save"
//Display "6. Erase"
//Display "7. Exit"

//Input option

//If option is 1 then
  //  Input recipient phone number
   //Display "Message sent"

//Else if option is 2 then
  //  Display "Template selected"

//Else if option is 3 then
  //  Display "Insert smiley selected"

//Else if option is 4 then
  //  Display "Send by set selected"

//Else if option is 5 then
  //  Display "Message saved"

//Else if option is 6 then
  // Display "Message erased"

//Else option is 7 then
  //  Display "Exit"

//Else
  //  Display "Invalid option"
//End Else if

//Else if choice is 2 then

//Display "INBOX"
//Display "1. Read message"
//Display "2. Exit"

//Input inboxChoice

//If inboxChoice = 1 THEN

    //Display "READ MESSAGE"
  //  Display message

   // Display "OPTIONS"
    //Display "1. Erase"
    //Display "2. Reply"
    //Display "3. Chat"
    //Display "4. Edit"
    //Display "5. Use number"
    //Display "6. Forward"
    //Display "7. Details"

   //Input inboxOption

    //If inboxOption is 1 then
      //  Display "Message erased"

    //Else if inboxOption is 2 THEN
      //  Display  "Reply selected"

    //Else if inboxOptionis 3 then
      //  Display "Chat selected"

    //Else if inboxOption is 4 then
      //  Display "Edit selected"

    //Else if inboxOption is 5 then
      // Display "Use number selected"

    //Else if inboxOption is 6 then
      //  Display "Forward selected"

    //Else if inboxOption is 7 then
      //  Display "Details selected"

    //Else
      // Display "Invalid option"
   //End if



//Else if choice is 3 then

//Display "OUTBOX"
//Display "1. Read saved message"
//Display "2. Exit"

//Input outboxChoice

//If outboxChoice is 1 then

    //Display "SAVED MESSAGE"
    //Display message

   // Display "OPTIONS"
    //Display "1. Erase"
    //Display "2. Edit"
    //Display "3. Use number"
    //Display "4. Forward"

    //Input outboxOption

    //If outboxOption is 1 then
      // Display "Message erased"

    //Else if outboxOption is 2 then
      // Display "Edit selected"

    //Else if outboxOption is 3 then
      //  Display "Use number selected"

    //ELSE IF outboxOption is 4 then
      //  Display "Forward selected"

    //Else
      // Display "Invalid option"
    //End if

//Else if choice is 5 then

//Display "Exiting Messages"

//Else

//Display "Invalid choice"

//End if

//End




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
    
		switch(menuChoice){

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

}


