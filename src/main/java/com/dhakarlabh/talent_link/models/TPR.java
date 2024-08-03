package com.dhakarlabh.talent_link.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "tpr-information")
public class TPR extends CommonInformation{
    private String username;
    private String year;
}
