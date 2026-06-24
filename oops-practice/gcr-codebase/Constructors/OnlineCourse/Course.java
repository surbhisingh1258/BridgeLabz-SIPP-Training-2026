class Course {
    // Instance Variables
    String courseName;
    int duration;   // in months
    double fee;

    // Class Variable
    static String instituteName = "ABC Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    // Class Method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}