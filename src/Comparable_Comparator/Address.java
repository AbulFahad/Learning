package Comparable_Comparator;

public class Address {

    private int flatNumber;
    private String apartmentName;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private int pinCode;

    public Address(int flatNumber, String apartmentName, String city, String state, String country, int pinCode) {
        this.flatNumber = flatNumber;
        this.apartmentName = apartmentName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

/*    @Override
    public String toString() {
        return "Comparable_Comparator.Address{" +
                "flatNumber=" + flatNumber +
                ", apartmentName='" + apartmentName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }*/
}
