Feature: Agregar de diferentes productos al carrito de compras

  @RegistrarUsuario
  Scenario Outline:
    Given Ingresamos pagina de Advantageon Line Shopping
    When Ingresamos los datos para la creacion de nuevo usuario desde el archivo Registrar Nuevo Usuario
    Then Validamos mensaje de registro exitoso
    Examples:
