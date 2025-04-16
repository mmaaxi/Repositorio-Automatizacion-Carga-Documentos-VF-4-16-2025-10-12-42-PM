Feature: Carga de documento PDF válido

  Scenario: Probar la carga de un documento PDF válido
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona un archivo PDF válido desde el sistema
    And hace clic en el botón 'Cargar'
    Then el documento se carga exitosamente y se muestra mensaje de confirmación