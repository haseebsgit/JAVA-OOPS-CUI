package GITDEMO;

public class Student extends Person{
   private String regNo;
   Student(String name,int age,String regNo){
       super(name, age);
       this.regNo = regNo;
   }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
}
