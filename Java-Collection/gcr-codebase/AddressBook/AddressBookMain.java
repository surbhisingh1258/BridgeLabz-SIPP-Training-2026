import java.util.Scanner;

public class AddressBookMain {
    public void choices() {
        AddressBookData addressBook = new AddressBookData();

        System.out.println("-------------------------------------");
        System.out.println("Welcome to the Address Book Main Menu!");

        while(true) {
            System.out.println("1. Add new Contact \n2. Search Contact \n3. Delete a contact \n4. Display Sorted Contacts \n5. Exit");
            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();

            if(choice == 5) {
                break;
            }
            switch(choice) {
                case 1:
                    System.out.println("Enter Contact Name: ");
                    String name = sc.next();

                    System.out.println("Enter Your Valid Phone Number: ");
                    String phoneNumber = sc.next();

                    System.out.println("Enter your valid Email: ");
                    String email = sc.next();
                    addressBook.addContact(name, phoneNumber, email);
                    break;

                case 2:
                    System.out.println("Enter Contact Name to be searched: ");
                    name = sc.next();
                    addressBook.search(name);
                    break;

                case 3:
                    System.out.println("Enter Contact to be deleted: ");
                    name = sc.next();
                    addressBook.delete(name);
                    break;

                case 4:
                    addressBook.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("invalid choice");
                    
            }
        }
    }

    public static void main(String[] args){
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.choices();
    }
}