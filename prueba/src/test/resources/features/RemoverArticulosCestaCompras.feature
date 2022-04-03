# language:es

Característica: Remover articulos en cesta de compras
  Yo como dueño de producto
  necesito poder remover articulos de la cesta de compras en el portal de ventas clothesstore-latam
  para poder realizar modificacion de mi pedido antes de realizar el proceso de compra

  Escenario: Eliminar de la cesta de compras un articulo de la categoria hombre
    Dado que el usuario se encuentra en el portal clothesstore-latam dentro la categoria Hombre
    Cuando remuevo de la cesta de compras un articulo
    Entonces no se visualizará el articulo removido dentro de la cesta

  Escenario: Eliminar de la cesta de compras un articulo de la categoria mujer
    Dado que el usuario se encuentra en el portal clothesstore-latam dentro la categoria Mujer
    Cuando remuevo de la cesta de compras un articulo
    Entonces no se visualizará el articulo removido dentro de la cesta

  Escenario: Eliminar de la cesta de compras un articulo de la categoria junior
    Dado que el usuario se encuentra en el portal clothesstore-latam dentro la categoria Junior
    Cuando remuevo de la cesta de compras un articulo
    Entonces no se visualizará el articulo removido dentro de la cesta

  Escenario: Eliminar de la cesta de compras un articulo de la categoria niños
    Dado que el usuario se encuentra en el portal clothesstore-latam dentro la categoria Niños
    Cuando remuevo de la cesta de compras un articulo
    Entonces no se visualizará el articulo removido dentro de la cesta

