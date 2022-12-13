package chapter3.item12;

import java.util.Objects;

public class PhoneNumber {
    private int phoneNumber;

    public PhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 아직 정해지지 않은 형식
     */
    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
