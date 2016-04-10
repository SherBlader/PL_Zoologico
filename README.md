# PL_Zoologico
Proyecto de Zoologico Utilizando Listas Lineales 


Proyecto:

En un zoológico, se quiere llevar el control de: animales, categorías, jaulas y guardias de seguridad.  Se debe realizar los siguientes procesos:
•	Mantenimiento de animales, categorías, jaulas, guardias de seguridad  (entrada, búsqueda, modificación y eliminación).

Se deben trabajar las siguientes abstracciones:

Animal:
•	id_animal
•	nombre_animal
•	id_categoria
•	fecha_entrada (fecha en la cual entra el animal al zoológico por primera vez)

Categoría:
•	id_categoria
•	nombre_categoria
•	descripción_categoria

Ejemplo:
1.	anfibios
2.	mamíferos
3.	reptiles
4.	aves

Guardia:
•	Cedula
•	Nombre
•	Teléfono
•	Email

Jaula se da:
•	id_jaula
•	Animales (Lista)
•	Guardia ( guardia asignado a la jaula)
•	Capacidad (cantidad de animales máximo que caben en la jaula).



Los animales pueden trasladarse entre jaulas siempre y cuando sean de la misma categoría y la capacidad de la jaula lo permita. Se debe tener una abstracción y contenedor para traslados con los siguientes atributos:
•	Id_traslado
•	Id_jaula_fuente
•	Id_jaula_destino
•	Id_animal
•	Fecha_traslado 

El programa debe contener:

1.	Mantenimiento de animales, categorías, jaulas, guardias de seguridad  (entrada, búsqueda, modificación y eliminación).
2.	Reporte de todos los animales
3.	Reporte de animales por tipo
4.	Reporte de animales según jaula
5.	Reporte de animales según guardia asignado
6.	Reporte de animales según rango de fechas de entrada
7.	Reporte de los animales trasladados en un rango de fecha
8.	Reporte de animales trasladados según categoría 

Se deben generar archivos planos para los reportes del 2 al 8.

