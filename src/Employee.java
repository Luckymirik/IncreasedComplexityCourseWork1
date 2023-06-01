

public class Employee {
    static int counter = 1;
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private int salary;


    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }


    @Override
    public String toString() {

        return id + " " + surname + " " + name + " " + patronymic + " " + salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }


}



