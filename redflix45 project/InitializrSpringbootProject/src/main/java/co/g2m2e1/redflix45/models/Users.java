/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2m2e1.redflix45.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ESLUNAP Colaborador: Mikheltodd
 */
@Entity
@Table(name = "Users")
public class Users {

    @Id
    @Column(name = "user_username")
    private String userUsername;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_lastname")
    private String userLastname;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_phone")
    private Long userPhone;

    @Column(name = "user_birthday")
    private String userBirthday;

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    @Override
    public String toString() {
        return "Users{" + "userUsername=" + userUsername + ", userPassword=" + userPassword + ", userName=" + userName + ", userLastname=" + userLastname + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userBirthday=" + userBirthday + '}';
    }

}
