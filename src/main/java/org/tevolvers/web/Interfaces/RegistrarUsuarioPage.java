package org.tevolvers.web.Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarUsuarioPage {
    public static final Target Menu_user = Target.the("icono de user para loguarse o registrar nuevo usuario").located(By.id("menuUser"));
    public static final Target Campo_Username = Target.the("Campo de username login").located(By.name("username"));
    public static final Target Campo_password = Target.the("Campo de username password").located(By.name("password"));
    public static final Target Opcion_Crear_Nueva_Cuenta = Target.the("Opcion para crear nueva cuenta de usuario").located(By.cssSelector("[translate='CREATE_NEW_ACCOUNT']"));
    public static final Target Campo_User_Registro = Target.the("Campo username registro").located(By.name("usernameRegisterPage"));
    public static final Target Campo_Email = Target.the("Campo email registro").located(By.name("emailRegisterPage"));
    public static final Target Campo_Password = Target.the("Campo password registro").located(By.name("passwordRegisterPage"));
    public static final Target Campo_Password_Confirmar = Target.the("Campo password confirmar registro").located(By.name("confirm_passwordRegisterPage"));
    public static final Target Campo_First_Name = Target.the("Campo first name registro").located(By.name("first_nameRegisterPage"));
    public static final Target Campo_Last_Name = Target.the("Campo last name registro").located(By.name("last_nameRegisterPage"));
    public static final Target Campo_Phone_Number= Target.the("Campo phone number registro").located(By.name("phone_numberRegisterPage"));
    public static final Target Campo_Contry= Target.the("Campo country registro").located(By.name("countryListboxRegisterPage"));
    public static final Target Campo_City= Target.the("Campo city registro").located(By.name("cityRegisterPage"));

    public static final Target Campo_Address= Target.the("Campo address registro").located(By.name("addressRegisterPage"));
    public static final Target Campo_State= Target.the("Campo State / Province / Regio registro").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target Campo_Postal_Code= Target.the("Campo postal code registro").located(By.name("postal_codeRegisterPage"));
    public static final Target Campo_Boton_Registrar= Target.the("Boton de registro").located(By.id("register_btnundefined"));

}
