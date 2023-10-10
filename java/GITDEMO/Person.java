package GITDEMO;

public class Person {
   private String name;

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    private int age;

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "haseeb";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
}


