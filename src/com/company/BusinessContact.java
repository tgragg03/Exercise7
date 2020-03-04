package com.company;

public class BusinessContact extends ContactInfo{
    public BusinessContact(String name, String emailAddress) {
        super(name, emailAddress);
    }

    private String phoneNum;

    public BusinessContact(String name, String emailAddress, String phoneNum) {
        super(name, emailAddress);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
