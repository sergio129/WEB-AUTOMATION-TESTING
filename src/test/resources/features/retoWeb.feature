Feature: Realizar compra de diferentes productos

  @RealizarPedido
  Scenario Outline: Comprar diferentes productos de forma exitosa
    Given Sergio ingresa a la pagina de demoblaze
    When el ingresa el nombre de los productos para hacer la compra: <Phone>, <Laptops>, <Monitors>
    And el escribe los datos para para realizar el pedido
    Then el valida que la suma del valor de los productos sea igual al valor total
    And el valida el mensaje de compra exitosa: "Thank you for your purchase!"
    Examples:
      | Phone             | Laptops     | Monitors         |
      | Samsung galaxy s6 | Dell i7 8gb | Apple monitor 24 |

