public class Contact{
    String name;
    String email;
    long phone;

    public Contact(String name, String email, long phone){
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    @Override
    public String toString(){
        System.out.println("---------------------------------------------------");
        return "Name: "+ name +
               "\nemail: "+ email +
               "\nphone: " + phone;
    }
}