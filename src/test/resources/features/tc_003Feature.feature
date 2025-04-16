Feature: Error al cargar archivo corrupto

  Scenario: Cargar archivo PDF corrupto
    Given el usuario ha seleccionado un archivo PDF corrupto
    When el usuario hace clic en el botón "Cargar"
    Then el sistema muestra un mensaje de error indicando que el archivo está dañado