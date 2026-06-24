public class CourseDemo {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 25000);
        Course c2 = new Course("Python", 4, 20000);

        System.out.println("Before Updating Institute Name:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("XYZ Academy");

        System.out.println("\nAfter Updating Institute Name:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}