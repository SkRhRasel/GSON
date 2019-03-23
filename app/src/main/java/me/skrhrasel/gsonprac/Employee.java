package me.skrhrasel.gsonprac;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
//    private String firstName;
//    private int age;
//    private String mail;
//
//    public Employee(String firstName, int age, String mail) {
//        this.firstName = firstName;
//        this.age = age;
//        this.mail = mail;
//    } it can be written like below....

    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("mail")
    private String mMail;

    @SerializedName("address")
    private Address mAddress;

    @SerializedName("family")
    private List<FamilyMember> mFamily;

    public Employee(String firstName, int age, String mail, Address address, List<FamilyMember>family) {
        mFirstName = firstName;
        mAge = age;
        mMail = mail;
        mAddress = address;
        mFamily = family;

    }
}
