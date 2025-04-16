Feature: Verificación del tamaño máximo de archivo

  Scenario: Intentar cargar un archivo que supere el tamaño máximo permitido
    Given El usuario está en la página de carga de archivos
    When El usuario intenta cargar un archivo que supera el tamaño máximo permitido
    Then El sistema rechaza la carga del archivo
    And El sistema notifica al usuario sobre el límite de tamaño