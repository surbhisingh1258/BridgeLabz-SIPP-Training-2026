public class Person {
    protected int personId;
    protected String personName;

    public Person(int id, String Name) {//Constructor
        this.personId = id;
        this.personName = Name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                '}';
    }
}