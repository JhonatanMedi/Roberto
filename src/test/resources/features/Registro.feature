#22/06/2022
#Jhonatan Medina Blanco
@Regresion
Feature: Logueo en la pagina Orange

  @Login
  Scenario Outline: login
    Given abrir el navegador
    And llenar campo usario <userName> y contrasena <pass>
    And llegar a la opcion agregar empleado
    When al diligenciar first name <firstName> y last name <lastName>

    Examples: 
      | userName | pass     | firstName | lastName |
      | Admin    | admin123 | Jhonatan  | Medina   |

@Login2
  Scenario Outline: login dos 
    Given abrir el navegador
    And llenar campo usario <userName> y contrasena <pass>
    And llegar a la opcion agregar empleado
    When al diligenciar first name <firstName> y last name <lastName>

    Examples: 
      | userName | pass     | firstName | lastName |
      | Admin    | admin123 | Jhonatan  | Medina   |

