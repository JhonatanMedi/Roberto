#22/06/2022
#Jhonatan Medina Blanco
@Regresion
Feature: leave general

  @seachEmployee
  Scenario Outline: buscar un empleado
    Given abrir el navegador
    And llenar campo usario <userName> y contrasena <pass>
    And buscar empleado <employee>
    Then al encontrar el empleado <employee> y seleccionar una accion <action>

 
    Examples: 
      | userName | pass     | employee       | action |
      | Admin    | admin123 | Jasmine Morgan | Cancel |

