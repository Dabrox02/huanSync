
# Events

## Description
El modulo de eventos se encarga de gestionar la creacion y el manejo de los mismo, implementando lo que se conoce como CRUD. Ademas, nos encargamos de la creacion y manejo del personal de cada evento. Asignandolos a su respectivo evento. En adiccion se crea la gestion de roles para cada empleado. finalmente, se crea la tbal de inventario de utenciolios que se manejan en cada evento.


## OOP (Object Oriented Programming)        
[Explica cómo aplicaste la Programación Orientada a Objetos en este grupo. Enumera las clases creadas y proporciona una breve descripción de sus métodos y funcionalidades
Para este modulo implementamos Clases, Interfaces, Herencia y polimorfismo.

### Clases:
Las clases se almacenan dentro de las carpetas model/classes de cada paquete, se crearon:

1.  #### Event.java:
        La clase Event manejara objetos que seran los eventos a manejar. Ademas esta clase tiene dos constructores para mejorar el  manejo de la creacion de Eventos. Se incluye sus respectivos Getter, Setters y ToString. Manejamos atributos como :

        - eventId              Unique identifier for the event.
        - nameEvent            Name of the event.
        - country              Country where the event is held.
        - city                 City where the event takes place.
        - address              Address of the event.
        - peopleCapacity      Capacity of people allowed at the event.
        - storeCapacity        Capacity of stores allowed at the event.
        - restaurantCapacity   Capacity of restaurants allowed at the event.
        - dateEvent            Date of the event.
        - timeEvent            Time of the event.
        - organizerId          Organizer's identifier for the event.
        - ageClassification    Age classification of the event.
        - statusEnum   


2.  #### EventStaff.java

    La clase EventStaff manejara objetos que seran la relacion entre eventos y personal por medio de ids (Manejando muchoa a mucho). Ademas esta clase tiene un constructor para mejorar el  manejo de la creacion de la tabla que relacionara eventos y staff. Se incluye sus respectivos Getter, Setters y ToString. Manejamos atributos como :


        - eventId            Unique identifier for the event associated with the staff member.
        - staffId            Unique identifier for the staff member associated with the event.


3.  #### EventStaffFull.java

    La clase EventStaffFull manejara objetos que seran la relacion entre eventos y personal, realizando una adapcion donde Evento tendra una lista de staff, esto implica que la clase extendera de su padre "Event". Ademas esta clase tiene dos constructores para mejorar el  manejo de la creacion de la tabla que relacionara eventos y staff. Con ello creamos una nueva tlaba que enlazara y mejorara la manera de visualizar esta tabla de relacion de mucho a mucho. Se incluye sus respectivos Getter, Setters y ToString. Manejamos atributos como :


        - List<Staff> staff         List of staff members associated with the event.
        - extends Event             extiende su padre Eventos


4.  #### EventStaff.java

    La clase EventStaff manejara objetos que seran la relacion entre eventos y personal por medio de ids (Manejando muchoa a mucho). Ademas esta clase tiene un constructor para mejorar el  manejo de la creacion de la tabla que relacionara eventos y staff. Se incluye sus respectivos Getter, Setters y ToString. Manejamos atributos como :


        - eventId            Unique identifier for the event associated with the staff member.
        - staffId            Unique identifier for the staff member associated with the event.


5.  #### Staff.java
   
    La clase Staff incluira los trabajadores que tienen en cada seccion del software. Ademas esta clase tiene dos constructores para mejorar el  manejo de la creacion de Staff. Se incluye sus respectivos Getter, Setters y ToString. Manejamos atributos como :

        - staffId              Unique identifier for the staff member.
        - staffNumberId        Staff number identifier.
        - nameStaff            Name of the staff member.
        - birthdayStaff        Birthday of the staff member.
        - statusStaffEnum      String representation of the staff status enum.
        - workerRoleId         Worker role ID associated with the staff member.


6. #### WorkerRole.java

    La clase WorkerRole incluira los trabajadores que tienen en cada seccion del software. Ademas esta clase tiene dos constructores para mejorar el  manejo de la creacion de Staff. Se incluye sus respectivos Getter, Setters y ToString. Manejamos atributos como :

        - workerRoleId         Unique identifier for the workerRole.
        - workerRoleName       Name of the workerRole.
        - workerRoleActivities List with strings representing the activities performed by the workerRole         
  
  


7. #### Equipment 
   
    La clase WorkerRole incluira los trabajadores que tienen en cada seccion del software. Ademas esta clase tiene dos constructores para mejorar el  manejo de la creacion de Staff. Se incluye sus respectivos Getter, Setters y ToString. Manejamos atributos como :

            - equipmentId           Unique identifier for the equipment.
            - nameEquipment         Name of the equipment.
            - quantity              Quantity of the equipment available.
            - statusEquipmentEnum   Current status of the equipment.



### Enum:
En ciertas clases se implementaron los Enums. Esto con el fin de manejar estados o varias que no se repetiran para ayudar a la eleccion de las caracteristicas.

1.  #### StatusEquipmentEnum.java (Equipment.java): 
   
        - IN_STOCK("The item is in the warehouse")           Classification for events suitable for the whole family.
        - ON_SITE("The item is at the Event's Location");    Status indicating that the item is currently at the event's location.


2.  #### AgeClassificationEnum.java (Event.java):
   
        - FAMILY("For the whole family")      Classification for events specifically targeting younger audiences.
        - YOUNGER("Only for young people")    Status indicating that the item is currently at the event's location.
        - ADULT("Adults Only");               Classification for events meant for adult audiences only.


3.  #### StatusEnum.java (Event.java):
   
        - ACTIVE("It is active"),      Classification for events specifically targeting younger audiences.
        - FINISHED("It is Inactive")    Status indicating that the item is currently at the event's location.
        - PENDING("It is Pending")            Classification for events meant for adult audiences only.

        
4. #### StatusStaffEnum.java (Stuff.java):
   
        - TASK_ASSIGNED     Indicates the worker has a task assigned
        - NO_TASK_ASSIGNED  Indicates the worker does not have a task assigned
        - DISMISSED        Indicates the worker is dismissed from their position



### Interfaces:
Para el manejo de metodos se implemento el uso de interfaces. Se creo una interfaces IDao.java que se implementa en sub interfaces para el manejo del CRUD. La implementacion del CRUD se almacena en las carpetas llamadas DAO de cada paquete. 
Estas subInterfaces se implementaran dependiendo del caso. 

An interface extending IDao, providing a method to retrieve all entities with full details.
 * This interface is generic, suitable for any type of entity collection.

 - IGetByIdDao<Tipo de Objeto>, 
 - IGetAllDao<Tipo de Objeto>,
 - ISaveDao<Tipo de Objeto>,
 - IUpdateDao<Tipo de Objeto>,
 - IDeleteDao<Tipo de Objeto>, 
 - IGetAllFull<Tipo de Objeto>,
 - IGetByIdFull<Tipo de Objeto>,
 - IGetByIdFullDao<Tipo de Objeto>,




## Design pattern    
[Explica qué patrón de diseño se implementó en este grupo y por qué se eligió. Detalla cómo se aplicó en el código]

- Builder: En nuestro modulo implementamos Builder solo en la creacion de la clase EVENT, ya que esta clase en particular manejaba un objeto complejo. Por ello, es una solucion efectiva manejando el control de la creacion de los  objetos y mejorar la legibilidad.



## SOLID application       

Para el modelo del paquete de eventos se implemento SOLID asi:


<strong>S</strong>  – Single Responsibility Principle: principio de responsabilidad única, también conocido como SRP. Se aplico manejo de interfaces para cada accion, (CRUD). Dando la posibilidad del polimorfismo, pues cierta clases no implentan todas las acciones.

<strong>O</strong> – Open/Closed Principle: principio abierto/cerrado. Por el momento estas interfaces implementan acciones como guardar, leer, modificar y eliminar. Pero hay clases que tienen extra acciones como mostrar todo la informacion o de manera especifica. Es decir queda abieeto a la adiccion de mas acciones.

<strong>L</strong> – Liskov Substitution Principle: principio de substitución de Liskov. Este principio nos explica cómo se debería utilizar correctamente la herencia y el polimorfismo. Nuestras clases hace un buen uso de este principio en donde se puede hacer uso del polimorfismo.

<strong>I</strong> – Interface Segregation Principle: principio de segregación de interfaces. «Los objetos no deberían verse forzados a depender de interfaces que no utilizan». Por ello se hace un Padre que contiene todas las interfaces que se manejan. y cada interface tiene su propia funcion y accion.

<strong>D</strong> – Dependency Inversion Principle: principio de inversión de dependencias. Los módulos de alto nivel no deberían depender de los módulos de bajo nivel. Ambos deberían depender de abstracciones




## Package Structure   
[Indica dónde se encuentra el código fuente o los archivos relacionados con este grupo en el repositorio del proyecto, ademas de enlazar a sus respectivas carpetas]
El modulo de Evento se encuentra en la ruta "C:\Users\criis\OneDrive\Desktop\ProyectoJava\huanSync\src\main\java\com\u2team\huansync\event". y dentro del paquete Evento se manejo la siguiente estructura:

[Nombre del Grupo]
   - Controller
   - DAO
      - model
   - staff
      - controller
      - model
         - classes
         - DAO
  
  Es importante destacar que implementamos el patron 