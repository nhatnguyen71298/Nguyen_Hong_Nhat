package com.codegym.validate_form.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity(name = "be_de")
public class BeDe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Size(min = 5,max = 45,message = "Input 5 - 18 words !")
    String firstName;


    @Size(min = 5,max = 45,message = "Input 5 - 18 words !")
    String lastName;


    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{3}$",message = "Phone number BeDe have format XXX-XXX-XXX !")
    String phoneNumber;


    @Min(value = 18,message = "Input age > 18 !")
    String age;

    @NotBlank
    @Email(message = "Wrong email!")
    String email;

    public BeDe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
