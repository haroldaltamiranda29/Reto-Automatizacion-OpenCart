#language: es
#Autor: Harold Altamiranda
@hu
Característica: Como un usuario quiero ingresar a OpenCart para verificar diferentes funcionalidades

  Antecedentes:
    Dado que estoy en la pagina opencart e inicio sesion con usuario y clave
      | usuario | clave |
      | demo    | demo  |

  @CP1
  Escenario: Verificar que no tengo perimisos para crear nuevos clientes
    Y selecciono la opcion customers de la categoria customers y click en el boton add new
    Cuando lleno los formularios con la informacion del cliente y doy click en en boton save
      | firstName | lastName    | email            | password  | confirm   | address        | city     |
      | Harold    | Altamiranda | harold@gmail.com | harold123 | harold123 | calle 23#45-34 | Medellin |
    Entonces deberia visualizar el siguiente mensaje "Warning: You do not have permission to modify customers!"

  @CP2
  Escenario: Filtrar una orden por su ID y verificar que retorne una sola orden
    Y selecciono la opcion pedidos de la categoria ventas
    Cuando aplico el filtro para el pedido con su orderID y Customer
      | orderID | customer   |
      | 16      | Ahmed Demo |
    Entonces deberia visualizar el pedido con orderID "16" store "Your Store" y customer "Ahmed Demo"

  @CP3
  Escenario: Agregar un producto a una orden
    Y selecciono ver una orden de los ultimos pedidos
    Cuando agrego un producto a la orden con su informacion
      | chooseProduct | quantity |
      | Canon EOS 5D  | 2        |
    Entonces se valida que se modifique el carito de compra con el siguiente mensaje "Success: You have modified your shopping cart!"