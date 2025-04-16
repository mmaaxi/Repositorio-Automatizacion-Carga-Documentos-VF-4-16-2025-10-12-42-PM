Feature: Validación de campos obligatorios

  Scenario: Intentar realizar la carga sin seleccionar ningún archivo
    Given El usuario está en la página de carga de archivo
    When El usuario intenta cargar sin seleccionar un archivo
    Then El sistema muestra un mensaje solicitando seleccionar un archivo