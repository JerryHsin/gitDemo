package domain;

public class PhoneNumber {
    private String number;
    private String protocal;
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "number='" + number + '\'' + ", protocal='" + protocal + '\'' + '}';
    }
}
