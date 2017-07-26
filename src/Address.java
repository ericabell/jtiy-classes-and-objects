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

    public Address(String rawAddressCSVString) {
        // need to parse the elements on commas
        java.util.List<String> addressList = java.util.Arrays.asList(rawAddressCSVString.split(","));
        this.addressLine1 = addressList.get(0);
        this.addressLine2 = addressList.get(1);
        this.city = addressList.get(2);
        this.stateAbbr = addressList.get(3);
        this.zip = addressList.get(4);
    }

    public String toString() {
        return " addressLine1=" + addressLine1 + ", ..., zip=" + zip + " ";
    }
}
