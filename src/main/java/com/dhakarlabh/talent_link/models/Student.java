package com.dhakarlabh.talent_link.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "student-information")
public class Student extends CommonInformation{
    private String course;
    private String resume;
    private String year;
}
