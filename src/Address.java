public class Address {
    String addressLine1;
    String addressLine2;
    String city;
    String stateAbbr;
    String zip;

    public Address() {

    }

    public Address(String addressLine1, String addressLine2, String city, String stateAbbr, String zip) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateAbbr = stateAbbr;
        this.zip = zip;
    }

    public String toString() {
        return " addressLine1=" + addressLine1 + ", ..., zip=" + zip + " ";
    }
}
