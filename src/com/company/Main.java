package com.company;

public class Main {

    public static void main(String[] args) {

        ContactInfo contact1 = new ContactInfo("Tanner","tannergragg4@gmail.com");
        System.out.println(contact1);
        BusinessContact busContact1 = new BusinessContact("Tanner", "tannergragg4@gmail.com", "614-125-5236");
        System.out.println(busContact1);
    }
}
