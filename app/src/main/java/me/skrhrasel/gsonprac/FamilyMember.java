package me.skrhrasel.gsonprac;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {
    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private String mAge;

    public FamilyMember(String role, String age) {
        mRole = role;
        mAge = age;
    }
}
