package pl.sda.intermediate16.users;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = -381001129481477463L;

    private String name;
    private String surname;
    private String login;
    private String birthdate; //TODO LocalDate zamiast Stringa
    private String pesel;
    private String phone;
    private String passwordHash;
    private UserAddress userAddress;
}
