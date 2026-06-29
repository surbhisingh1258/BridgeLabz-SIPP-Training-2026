public interface IGamingService{
    
    void playGame(String game);

    default void showSubscriptionDetails(){
        System.out.println("Subsciption: Diamond");
    }
}