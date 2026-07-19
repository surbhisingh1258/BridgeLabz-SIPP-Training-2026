public interface IStreamingService{

    void Movie(String movie);

    default void showSubscriptionDetails(){
        System.out.println("Subsciption: Gold");
    }
}