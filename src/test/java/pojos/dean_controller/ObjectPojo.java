package pojos.dean_controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectPojo implements Serializable {

//    Purpose :
//    It holds detailed information about a person, such as their ID, username, name, surname, birthdate, social security number (SSN), birthplace, phone number, and gender.
//    Usage :
//    It helps organize and manage individual data attributes of a person within a Java program, making it easier to store, retrieve, and manipulate person-related information effectively.

    private int userId;
    private String username;
    private String name;
    private String surname;
    private String birthDay;
    private String ssn;
    private String birthPlace;
    private String phoneNumber;
    private String gender;

    public ObjectPojo() {
    }

    public ObjectPojo(int userId, String username, String name, String surname, String birthDay, String ssn, String birthPlace, String phoneNumber, String gender) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.ssn = ssn;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return
                "ObjectPojo{" +
                        "userId = '" + userId + '\'' +
                        ",username = '" + username + '\'' +
                        ",name = '" + name + '\'' +
                        ",surname = '" + surname + '\'' +
                        ",birthDay = '" + birthDay + '\'' +
                        ",ssn = '" + ssn + '\'' +
                        ",birthPlace = '" + birthPlace + '\'' +
                        ",phoneNumber = '" + phoneNumber + '\'' +
                        ",gender = '" + gender + '\'' +
                        "}";
    }
}