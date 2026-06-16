import java.util.*;
public class UsernameValidator{
    public boolean validator(String username, int index){
        if(index == username.length()){
            return true;
        }
        char[] ch = username.toCharArray();
        if(ch[index]>'a' || ch[index]<'z'){
            return false;
        }

        return validator(username, index+1);
    }
    public static void main(String[] args){
        UsernameValidator obj = new UsernameValidator();
        boolean rs = obj.validator("surbhi123", 0);
        System.out.println(rs);
    }
}