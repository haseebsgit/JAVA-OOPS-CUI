public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Haseeb Farooq","34101-2264337-9");
        Employee emp3 = new Employee("HASEEB", "3410122643379",500000);
        System.out.println(emp2.getCnic());
        System.out.println(emp2.getName());
    }
}
