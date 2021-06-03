Feature: HU-001 Buscador Flores de Lujo
  Yo como usuario de Flores de Lujo
  Quiero buscar en el buscador un producto
  Para ver el producto en la pagina

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de Flores de Lujo con la url <Url>
    When busco el proudcto en el buscador
    Then podre ver el producto en pantalla

    Examples: 
      | Escenario                                               | Url                          |
      | Buscar palabra en el buscador de Flores de Lujo exitoso | https://floresdelujo.com.co/ |
