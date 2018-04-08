package org.aitesting.passenger.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Passenger {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @NotBlank
    private String userName;

    @NotBlank
    private String passWord;

    @NotBlank
    private String confPassword;

    @NotBlank
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String email;

    @NotBlank
    private int phoneNumber;



}
