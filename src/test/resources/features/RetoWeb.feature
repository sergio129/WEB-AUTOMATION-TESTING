Feature: Agregar de diferentes productos al carrito de compras

  Background:
    Given Ingresamos pagina de demoblaze

  @RealziarPedido
  Scenario Outline: Quiero hacer pedido con diferentes productos
    When Ingreso el nombre de los productos para hacer la compra: <Phone>, <Laptops>, <Monitors>
    And Calculamos la suma del valor de los productos sea igual al valor total
    And Escribo los datos para para realizar el pedido
    Then Validamos mensaje de compra exitosa: "Thank you for your purchase!"
    Examples:
      | Phone             | Laptops     | Monitors         |
      | Samsung galaxy s6 | Dell i7 8gb | Apple monitor 24 |

