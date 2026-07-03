import java.util.*;

class AddressBookData{
    static ArrayList<Contacts> contacts = new ArrayList<>();
    static HashMap<String, Contacts> contactMap  = new HashMap<>();
    static HashSet<String> phoneNumber = new HashSet<>();


    public void addContact(String name, String number, String email){
        if(phoneNumber.contains(number)){
            System.out.println("USER ALREADY EXISTS");
            return;
        }

        Contacts user = new Contacts(name,number,email);
        contacts.add(user);
        contactMap.put(name,user);
        phoneNumber.add(number);
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("CONTACT ADDED SUCCCESSFULLY!!");
        System.out.println("-------------------------------------------------------------");

    }

    public void search(String name){
        Contacts c = contactMap.get(name);
        if(c!=null){
            System.out.println(c);
        }else{
            System.out.println("Contact with name "+name+" not found");
        }
    }

    public void delete(String name){
        Contacts c = contactMap.get(name);
        if(c!=null){
            contactMap.remove(name);
            contacts.remove(c);
            phoneNumber.remove(c.getPhone());
            System.out.println("Contact with name "+name+ "not found");
        }
    }

    public void display(){
        Collections.sort(contacts);
        for(Contacts contact:contacts){
            System.out.println(contact);
        }
    }

}