import java.util.HashSet;
import java.util.Set;
public class SessionDetection{
    public static boolean TokenDetection(String[] tokens){
        Set<String> seen =new HashSet<>();
        for(String token: tokens){
            if (!seen.add(token)) { 
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] tokens1 = {
            "ABC123",
            "XYZ456",
            "PQR789",
            "ABC123"
        };

        String[] tokens2 = {
            "ABC123",
            "XYZ456",
            "PQR789",
            "LMN111"
        };

        System.out.println("Tokens1 has duplicate: " + TokenDetection(tokens1));
        System.out.println("Tokens2 has duplicate: " + TokenDetection(tokens2));
    }
}