# language: es
Característica: Filtro por tipo de animal
  Como animalista
  Quiero visualizar la lista de animales por tipo de animal
  Para encontrar el animal que necesito

  Escenario: filtrar por perros
    Cuando "Marcela" le da en la opcion de "Perro"
    Entonces solo debe mostrar los resultados de los "perros"

  Escenario: filtrar por gatos
    Cuando "Marcela" le da en la opcion de "Gato"
    Entonces solo debe mostrar los resultados de los "gatos"

  Escenario: filtrar por todos
    Cuando "Marcela" le da en la opcion de "All"
    Entonces debe mostrar 5 numero de registros