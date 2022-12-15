package chapter3.item13;

public class Phone implements Cloneable{

    private final int phoneNumber;
    private final String phoneName;

    public Phone(int phoneNumber, String phoneName) {
        this.phoneNumber = phoneNumber;
        this.phoneName = phoneName;
    }

    @Override
    public Phone clone() {
        try {
            return (Phone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber=" + phoneNumber +
                ", phoneName='" + phoneName + '\'' +
                '}';
    }
}
