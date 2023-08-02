package account.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserModel {

    @NotBlank
    private String name;
    @NotBlank
    private String lastname;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@acme\\.com$")
    private String email;
    @NotBlank
    private String password;

    public UserModel() {
    }

    public UserModel(String name, String lastname, String email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
