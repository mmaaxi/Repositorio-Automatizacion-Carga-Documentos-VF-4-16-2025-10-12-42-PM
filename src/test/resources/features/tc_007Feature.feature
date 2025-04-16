Feature: Cancelar carga de archivo
  Como un usuario
  Quiero poder cancelar una carga de archivo
  Para evitar cargar archivos incorrectos

  Escenario: Cancelar la acción de carga de archivo
    Dado que un usuario ha seleccionado un archivo para cargar
    Cuando el usuario cancela la acción de carga
    Entonces el sistema debería cancelar la acción y no realizar la carga