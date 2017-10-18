package com.capco.noc.psd2.server.fidor.domain;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FidorCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToMany(mappedBy = "fidorCustomers")
    private List<FidorAccount> fidorAccounts = new ArrayList<>();

    private String email;

    @SerializedName("created_at")
    private long createdAt;

    @SerializedName("last_sign_in_at")
    private long lastSignInAt;

    @SerializedName("updated_at")
    private long updatedAt;

    private String city;
    private String country;
    private String fax;
    private String mobile;

    @SerializedName("postal_code")
    private String postalCode;
    private String street;

    @SerializedName("street_number")
    private String streetNumber;

    private long birthday;

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    @SerializedName("maiden_name")
    private String maidenName;
    private String nick;
    private String title;
    private String gender;

    @SerializedName("marital_status")
    private String maritalStatus;
    private String nationality;
    private String religion;

    @SerializedName("is_verified")
    private boolean isVerified;

    public FidorCustomer() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<FidorAccount> getFidorAccounts() {
        return fidorAccounts;
    }

    public void setFidorAccounts(List<FidorAccount> fidorAccounts) {
        this.fidorAccounts = fidorAccounts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getLastSignInAt() {
        return lastSignInAt;
    }

    public void setLastSignInAt(long lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
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

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    @Override
    public String toString() {
        return "FidorCustomer{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", lastSignInAt=" + lastSignInAt +
                ", updatedAt=" + updatedAt +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", fax='" + fax + '\'' +
                ", mobile='" + mobile + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", birthday=" + birthday +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", maidenName='" + maidenName + '\'' +
                ", nick='" + nick + '\'' +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                ", isVerified=" + isVerified +
                '}';
    }
}
