package org.unreal.flowable.request;

public class UpdateUserQuery {


    /**
     * firstName : Tijs
     * lastName : Barrez
     * password : pass123
     * email : no-reply@flowable.org
     */
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
