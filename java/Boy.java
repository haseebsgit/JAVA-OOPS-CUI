import java.util.Random;

public class Boy {
    private String name;
   private int age;
   int num1;
   int num2;
   int luckyNumber;
   public Boy(){
       Random r = new Random();
       luckyNumber = r.nextInt(78);
   }

   public Boy(String name, int age) {
        this.name = name;
        this.age = age;

    }
  public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int sum(int num1,int num2){
        return num1+num2;
    }


}
