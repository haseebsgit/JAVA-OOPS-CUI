public class Fahad {
    private String name;
    private int age;
    private Address postalAddress;
    public int getAge() {
        return age;
    }

    public Address getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  ;
    public Fahad(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Fahad(String name, int age,Address postalAddress){
        this.name = name;
        this.age = age;
        this.postalAddress = postalAddress;

    }

}
