import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Цадкин", "Мирослав", "Викторович", 1, 100000);
        employee[1] = new Employee("Ласынов", "Тимур", "Ильгизович", 2, 200000);
        employee[2] = new Employee("Симаков", "Дмитрий", "Александрович", 3, 140000);
        employee[3] = new Employee("Коростылев", "Сергей", "Святославович", 4, 210000);
        employee[4] = new Employee("Иванов", "Евгений", "Валерьевич", 5, 80000);
        employee[5] = new Employee("Штефан", "Виктор", "Викторович", 3, 90000);
        employee[6] = new Employee("Параничев", "Александр", "Витальевич", 4, 65000);
        employee[7] = new Employee("Полякова", "Римма", "Степановна", 5, 24000);
        employee[8] = new Employee("Ильин", "Евгений", "Николаевич", 3, 132500);
        employee[9] = new Employee("Попко", "Антон", "Игоревич", 4, 55250);


//        toStringForAll(employee);
//        System.out.println();
//        costAmount(employee);
//        System.out.println();
//        minSalary(employee);
//        System.out.println();
//        maxSalary(employee);
//        System.out.println();
//        averageSalary(employee);
//        System.out.println();
//        fullName(employee);
//        minSalary(employee);
//        maxSalary(employee);
        indexedSalary(employee);
        System.out.println();
        minSalaryDepartment(employee,3);
        System.out.println();
        maxSalaryDepartment(employee, 4);
        System.out.println();
        costAmountDepartment(employee, 3);
        System.out.println();
        averageSalaryDepartment(employee, 4);
        System.out.println();
        departmentIndexSalary(employee, 5);
        System.out.println();
        departmentToStringForAll(employee, 1);
        System.out.println();
        lessSalary(employee);
        System.out.println();
        moreSalary(employee);


    }

    public static String toStringForAll(Employee[] b) {
        System.out.println("Cписок всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee employee : b) {
            System.out.println(employee.toString());
        }
        return b.toString();
    }


    public static int costAmount(Employee[] a) {
        int sum = 0;

        for (Employee employee : a) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        //     System.out.println("Cумма затрат на зарплаты в месяц " + sum);
        return sum;
    }

    public static int minSalary(Employee[] c) {
        int a = 0;
        Employee min = c[0];
        for (Employee employee : c) {
            if (employee != null) {
                if (min.getSalary() > employee.getSalary()) {
                    min = employee;
                    a++;


                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой "+ min.getSalary()+" " +min.getName() + " " + min.getSurname());
        return a;
    }

    public static int maxSalary(Employee[] d) {


        Employee max = d[0];
        int a =0;

        for (Employee employee : d) {
            if (employee != null) {
                if (max.getSalary() < employee.getSalary()) {
                    max = employee;
                    a++;

                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой "+ max.getSalary()+" "+max.getName() + " " + max.getSurname());
        return a;
    }

    public static int averageSalary(Employee[] e) {
        for (Employee employee : e) {
            if (employee != null) {


            }
        }
        return costAmount(e) / e.length;
    }

    public static void fullName(Employee[] f) {
        System.out.println("Ф. И. О. всех сотрудников:");
        for (Employee employee : f) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }


    }

    public static int indexedSalary(Employee[] g) {
        System.out.println("Проиндексированные зарплаты сотрудников по порядку:");
        int percent = 33;
        int a = 0;
        for (Employee employee : g) {
            if ((employee != null)) {
                a = employee.getSalary() + employee.getSalary() / 100 * percent;
                System.out.println(a);
            }


        }
        return a;

    }


    public static Employee[] department(Employee[] e, int d) {
        Employee[] l = new Employee[e.length];
        int index = 0;
        for (Employee o : e) {
            if (o != null) {
                if (o.getDepartment() == d) {
                    l[index] = o;
                    index++;
                }
            }

        }

        return Arrays.copyOf(l, index);
    }

    public static void minSalaryDepartment(Employee[] o, int d) {
        System.out.println("В "+d +" отделе ");
        minSalary(department(o, d));
    }

    public static void maxSalaryDepartment(Employee[] o, int d) {
        System.out.println("В "+d +" отделе ");
        maxSalary(department(o, d));
    }

    public static int costAmountDepartment(Employee[] o, int d) {
        System.out.println("Сумма затрат по "+d+"-му отделу " +costAmount(department(o, d)));
        return costAmount(department(o, d));
    }

    public static void averageSalaryDepartment(Employee[] e, int d) {

        System.out.println("Средняя зарплата по "+d+"-му отделу "+averageSalary(department(e, d)));
    }

    public static void departmentIndexSalary(Employee[] e, int d) {
//        Employee[]n=department(e,d);
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(indexedSalary(new Employee[]{n[i]}));
        System.out.println(d+"ый отдел");
        indexedSalary(department(e, d));

    }


    public static void departmentToStringForAll(Employee[] e, int d) {
        System.out.println(d+" отдел");
        toStringForAll(department(e, d));
    }

    public static void lessSalary(Employee[] e) {
        System.out.println("Все сотрудники с зарплатой  меньше желательной:");
        int nSalary = 120000;
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() < nSalary)
                System.out.println(e[i].toString());


        }


    }

    public static void moreSalary(Employee[] e) {
        System.out.println("Все сотрудники с зарплатой больше желательной:");
        int nSalary = 120000;
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() > nSalary)
                System.out.println(e[i].toString());
        }
    }
}






