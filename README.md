# MAKAIA - WorkShop - Programación orientada a objetos

## Desarrollo WorkShop 3 dentro del desarrollo del BootCamp de desarrollo web BackEnd de MAKAIA.

### Equipo de trabajo:
  * Ana María Vásquez
  * Christian Toro
  * Maria Alejandra De Ossa Duque
  * Paula Andrea Martinez
  * Paula Munera
  * Yeisson Augusto Vahos Cortes
### Repositorio respuesta al taller planteado:

#### Realizar el diagrama UML y programar en java el siguiente enunciado.
##### La empresa MAKAI, se dedica al alquiler de embarcaciones y necesita un sistema para administrar las mismas.
##### Una embarcación debe tener si o si un capitán y los datos del capitán son: nombre, apellido y matricula de navegación ---- Utilizar un constructor que permita asignar todos estos atributos al momento de crear el objecto capitán.
##### La embarcación además de tener asociado un capitán, tiene un precio base, un valor adicional, un año de fabricación y la longitud en metros que se denomina eslora.
##### Existen dos variaciones de embarcaciones que alquila MAKAI. Ambas con las características que se describieron, pero cada una tiene además otras características. Los veleros tienen cantidad de mástiles y los yates cantidad de camarotes.
##### El sistema debe de contar con las siguientes Funcionalidades:
  * Dada cualquier embarcación el sistema debe permitir calcular el monto del alquiler. El monto monto del alquiler es el valor base y si el año de fabricación es mayor al 2020, se le suma un valor adicional de 20.000.
  * En el caso de los yates debe ser posible comprarlos. Un yate tiene mayor lujo si tiene mas de 7 camarotes.
  * Es importante poder evaluar en un velero si es grande, los velos grandes son aquellos que superan los 4 mastiles.

### Para la solución del ejercicio se plantea: un sistema en el que es posible agregar, mostrar, alquilar, devolver y vender embarcaciones (yates y veleros) siguiendo las reglas de negocio planteadas en el enunciado, con algunas validaciones creadas por el grupo como:
* Verificar si la embarcación ya fue agregada al sistema antes de realizar cualquier proceso con ella, sea alquilar, devolver o vender.
* Verificar si la embarcación ya existe en el sistema antes de agregarla a este.
* Verificar la disponibilidad o no de la embarcación antes de alquilarla, venderla o incluso devolverla.
* Verificar si la embarcación es o no del tipo que puede ser vendido antes de realizar el proceso de venta.

### Para verificar el funcionamiento del sistema se crearon en el main del proyecto una serie de instrucciones que permitían poner a prueba las reglas de negocio y las validaciones creadas mientras sus resultados iban siendo mostrados en la consola.

