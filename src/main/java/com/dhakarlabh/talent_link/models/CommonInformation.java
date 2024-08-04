package com.dhakarlabh.talent_link.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommonInformation {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String alternatePhoneNumber;
    private String gender;
    private String dob;
    private String password;

}
