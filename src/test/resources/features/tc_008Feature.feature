Feature: Verificación de tiempos de respuesta

  Scenario: Cargar un documento grande dentro del límite permitido
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento grande dentro del límite permitido
    Then el sistema procesa la carga en un tiempo razonable
    And el sistema muestra una barra de progreso