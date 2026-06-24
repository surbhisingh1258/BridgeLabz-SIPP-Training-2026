publi class UniversityMain{

    public static void main(String[] args){

        GradStudent studentOne = new GradStudent(
            102,
            "Surbhi",
            12345,
            60.0,
            "AI"
        );
        System.out.println(studentOne);

        GradStudent studentTwo = new GradStudent(
            103,
            "xyz",
            6789109,
            70.0,
            "Data Mining"
        );
        System.out.println(studentTwo);

    }
}