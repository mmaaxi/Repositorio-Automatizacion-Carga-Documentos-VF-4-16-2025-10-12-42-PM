Feature: Prueba de integración con sistema de almacenamiento

  Scenario: Realizar la carga de un documento y verificar que se almacene en el sistema remoto
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento
    Then el documento se guarda correctamente en el repositorio de almacenamiento
    And se actualiza la base de datos con la información del documento