import java.util.Scanner;
public class UserNotFoundException extends Exceptions{
    String Message;

    public UserNotFoundException(String Message){
        this.Message=Message;
    }
    @Override
    public String getMessage(){
        return Message;
    }
}

public class FileExample{
    public static void main(String[] args){
        String="Surbhi";
        System.out.println("enter your name: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        if(username.equalsIgnoreCase(Name)){
            System.out.println("login successful");
        }else{
            try{
                throw new UserNotFoundException("user not found");
            }
            catch(UserNotFoundException e)
            {
                System.out.println(e.getMessage());
            }
            
        }
    }
}