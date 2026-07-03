class Contacts implements Comparable<Contacts> {
    private String Name;
    private String Phone;
    private String Email;
    
    Contacts(String Name, String Phone, String Email) {
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getName() {
        return Name;
    }
    
    @Override
    public String toString() {
        System.out.println("-------------------------------------------------------------");
        return "Contacts{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contacts c) {
        return this.Name.compareToIgnoreCase(c.Name);
    }

}