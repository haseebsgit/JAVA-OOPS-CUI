public class FahadTest {
    public static void main(String[] args) {
        Address postalAddress = new Address("GUJRANWALA","RAHWALI","CB-1596");
        Fahad f =  new Fahad("FAHAD",25,postalAddress);
        System.out.println(f.getName());
        System.out.println(f.getPostalAddress().getCity());
        System.out.println(f.getPostalAddress().getTown());
        System.out.println(f.getPostalAddress().getStreet());
        System.out.println(f.getPostalAddress().city);
        System.out.println(postalAddress.getCity());

    }
}
