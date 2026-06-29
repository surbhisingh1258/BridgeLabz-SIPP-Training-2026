public class SmartTV implements IStreamingService, IGamingService{
    
    String[] movies={"GOTG", "IRONMAN", "DOCTOR-STRANGE"};
    String[] games={"GTA","NFS","IGI","PROTOTYPE"};

    @Override
    void movie(String movie){
        System.out.println("Movie: "+ movie);
    }

    @Override
    void playGame(String game){
        System.out.println("Game: "+ playGame);
    }


}  

