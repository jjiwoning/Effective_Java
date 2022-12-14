package chapter3.item13;

public class Phone implements Cloneable{

    private int phoneNumber;
    private String phoneName;

    public Phone(int phoneNumber, String phoneName) {
        this.phoneNumber = phoneNumber;
        this.phoneName = phoneName;
    }

    @Override
    public Phone clone() throws CloneNotSupportedException {
        return (Phone) super.clone();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber=" + phoneNumber +
                ", phoneName='" + phoneName + '\'' +
                '}';
    }
}
