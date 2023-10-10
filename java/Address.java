public class Address {
     String city;
    private String town;
private Address postalAddress;

    public Address getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }

    private String street;
    public Address(String city, String town, String street){
        this.city=city;
        this.town=town;
        this.street=street;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setCity(String city) {
        this.city = city;
    }



}
