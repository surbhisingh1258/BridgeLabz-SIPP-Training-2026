import java.util.*;
public class StoreContacts{
    public static void main(String[] args){
        Contact c1 = new Contact("Dev", "dev@gmail.com", 124566764);
        Contact c2 = new Contact("Riva", "riva@gmail.com", 124587654);
        Contact c3 = new Contact("Nishant", "nishant@gmail.com", 98773676);
        Contact c4 = new Contact("Nia", "nia@gmail.com", 12112456);
        Contact c5 = new Contact("Riva", "riva@gmail.com", 124587654);
        Contact c6 = new Contact("Priya", "priyat@gmail.com", 98773111);
        Contact c7 = new Contact("Rahul", "rahul@gmail.com", 121334456);

        ArrayList<Contact> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);

        // for(Contact c:list){
        //     System.out.println(c);
        // }

        HashSet<Contact> phoneNum = new HashSet<>();

        Contact[] contacts = {c1,c2,c3,c4,c5,c6,c7};

        for(Contact c : contacts){
            if(phoneNum.contains(c.phone)){
                System.out.println("Duplicate found: " + c.phone);
            } 
        }
    }
}