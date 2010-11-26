/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.POJOs;

import java.sql.Date;



/**
 *
 * @author tannguyen
 */
public class UserPOJO {
    private Integer userId;
    private String fullname;
    private String address;
    private Boolean gender;
    private Date dateOfBirth;
    private String cellphone;
    private String email;
    private String username;
    private String password;
    private RolePOJO role;

    public UserPOJO(Integer userId, String fullname, String address, Boolean gender, Date dateOfBirth, String cellphone, String email, String username, String password, RolePOJO role) {
        this.userId = userId;
        this.fullname = fullname;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.cellphone = cellphone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UserPOJO() {
    }

    @Override
    public String toString(){
        return fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RolePOJO getRole() {
        return role;
    }

    public void setRole(RolePOJO role) {
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
