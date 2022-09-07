package mainjavaorganization;

public class Employee {
    public static final String DEFAULT_POSITION = "инженер";
    public static final Double DEFAULT_SALARY = 30000.0;


    private String firstName;


    private String lastName;


    private String position;


    private Double salary;


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Использование значений по-умолчанию:
        // (должность – инженер, жалование – 30к руб.)
        this.setPosition(Employee.DEFAULT_POSITION);
        this.setSalary(Employee.DEFAULT_SALARY);
    }


    public Employee(String firstName, String lastName, String position, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }


    public Double getSalary() {
        return salary;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
