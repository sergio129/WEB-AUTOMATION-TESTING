package org.tevolvers.web.Utilidades;

import org.tevolvers.web.Model.RegistroUsuarioModel;

import java.util.ResourceBundle;

public class DatosRegistrarNuevoUsuario {
    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle("CreateBooking");
        }
    }
    public static String getDatosRegistrarNuevoUsuario(String keys) {
        return resourceBundle().getString(keys);
    }
    public static RegistroUsuarioModel registromodel(){
        RegistroUsuarioModel model=new RegistroUsuarioModel();
        model.setUsername(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.Username"));
        model.setEmail(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.Email"));
        model.setPassword(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.Password"));
        model.setConfirmpassword(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.Confirm.password"));
        model.setFirstName(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.First.Name"));
        model.setLastName(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.Last.Name"));
        model.setPhoneNumber(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.PhoneNumber"));
        model.setCountry(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.Country"));
        model.setCity(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.City"));
        model.setAddress(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.Address"));
        model.setState(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.state"));
        model.setPostalCode(DatosRegistrarNuevoUsuario.getDatosRegistrarNuevoUsuario("account.PostalCode"));
        return model;
    }
}
