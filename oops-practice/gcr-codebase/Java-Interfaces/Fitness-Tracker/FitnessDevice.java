public class FitnessDevice implements ITrackable, IReportable, INotifiable {
    int steps;
    int calories;

    public FitnessDevice(int steps, int calories) {
        this.steps = steps;
        this.calories = calories;
    }

    @Override
    public void logActivity() {
        System.out.println("Activity is Logged!");
        System.out.println("Steps " +steps);
        System.out.println("Calories Burned: " +calories);
    }

    @Override
    public void generateReport() {
        System.out.println("FITNESS REPORT: ");
        System.out.println("Total Steps: " +steps);
        System.out.println("Calories Burned: " +calories);
    }

    @Override
    public void sendAlert() {
        int remaningSteps = 5000-steps;
        if(steps<5000) {
            System.out.println("You Need to Walk More: " +remaningSteps);
        } else {
            System.out.println("");
        }
    }
}