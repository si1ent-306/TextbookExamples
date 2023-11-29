package ClassesPractice;

public class Employee extends Person{
    private String office;
    private int salary;
    private java.util.Date dateHired;


    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                '}';
    }
}
