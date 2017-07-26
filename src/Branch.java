public class Branch {
    Address address;

    String hours;

    public Branch() {

    }

    public Branch( String addressLine1, String addressLine2, String city, String stateAbbr, String zip, String hours) {
        this.address = new Address(addressLine1, addressLine2, city, stateAbbr, zip);

        this.hours = hours;
    }

    // getters and setters
    public String getAddressLine1() {
        return address.addressLine1;
    }

    public void setAddressLine1(String newAddressLine1) {
        this.address.addressLine1 = newAddressLine1;
    }

    public String toString() {
        return "addressLine1=" + address.addressLine1 + ", ..., hours=" + hours;
    }
}
