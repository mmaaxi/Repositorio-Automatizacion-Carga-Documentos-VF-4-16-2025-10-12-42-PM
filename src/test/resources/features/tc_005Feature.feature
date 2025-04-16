Feature: Prueba de múltiples cargas consecutivas

  Scenario: Carga secuencial de varios documentos sin refrescar la página
    Given el usuario está en la página de carga de documentos
    When el usuario carga el documento "documento1.pdf"
    Then el sistema notifica al usuario que la carga fue exitosa
    When el usuario carga el documento "documento2.pdf"
    Then el sistema notifica al usuario que la carga fue exitosa
    When el usuario carga el documento "documento3.pdf"
    Then el sistema notifica al usuario que la carga fue exitosa