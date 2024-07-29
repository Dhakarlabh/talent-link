package com.dhakarlabh.talent_link.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor

@Document(collection = "company-information")
public class CompanyInformation {

    @Id
    private String id;
    private String name;
    private String profile;
    private String date;
    private String time;
    private Map<String, String> requirement;
    private String description;
    private Map<String, String> additionalInformation;
}
