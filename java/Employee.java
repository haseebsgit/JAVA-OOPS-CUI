public class Employee {
    private String name;
    private String cnic;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String  cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(){

    }
    public Employee(String name,String cnic){
        this.name=name;
        this.cnic=cnic;
    }
    public Employee(String name,String cnic,double salary){
        this.name=name;
        this.cnic=cnic;
        this.salary=salary;
    }
}
