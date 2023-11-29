package ClassesPractice;

public class Person{
    private String name;
    private String address;
    private int phoneNumber;
    private String emailAdress;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}
