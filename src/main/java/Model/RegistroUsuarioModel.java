package Model;

import lombok.Data;

@Data
public class RegistroUsuarioModel {
    private String Username, Email, Password, Confirmpassword, FirstName, LastName, PhoneNumber, Country, City, Address, state, PostalCode;
}
