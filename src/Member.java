import java.time.LocalDate;

public class Member {
    String name;
    String addressLine1;
    String addressLine2;
    String city;
    String stateAbbr;
    String zip;
    java.time.LocalDate dob;

    public Member() {
    }

    public Member(String name, String addressLine1, String addressLine2, String city, String stateAbbr, String zip, String dob) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateAbbr = stateAbbr;
        this.zip = zip;
        this.dob = LocalDate.parse(dob);
    }

    public String getName() {
        return name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public String getZip() {
        return zip;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", stateAbbr='" + stateAbbr + '\'' +
                ", zip='" + zip + '\'' +
                ", dob=" + dob +
                '}';
    }
}
