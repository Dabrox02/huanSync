# Events

## Description
The event module is responsible for managing the creation and handling of events, implementing what is known as CRUD (Create, Read, Update, Delete). Additionally, we take care of creating and managing the staff for each event, assigning them to their respective events. Role management for each employee is also established. Finally, we create the inventory table for utensils managed in each event.

## OOP (Object Oriented Programming)

For this module, we implemented Classes, Interfaces, Inheritance, and Polymorphism.

### Classes:
The classes are stored within the model/classes folders of each package. The following have been created:

1. #### [Event.java](src\main\java\com\u2team\huansync\event\model\classes\Event.java):
    The Event class will handle objects that will be the events to manage. This class has two constructors to improve event creation management. It includes respective Getters, Setters, and ToString. Attributes handled include:

    - eventId              Unique identifier for the event.
    - nameEvent            Name of the event.
    - country              Country where the event is held.
    - city                 City where the event takes place.
    - address              Address of the event.
    - peopleCapacity       Capacity of people allowed at the event.
    - storeCapacity        Capacity of stores allowed at the event.
    - restaurantCapacity   Capacity of restaurants allowed at the event.
    - dateEvent            Date of the event.
    - timeEvent            Time of the event.
    - organizerId          Organizer's identifier for the event.
    - ageClassification    Age classification of the event.
    - statusEnum

2. #### [EventStaff.java](src\main\java\com\u2team\huansync\event\model\classes\EventStaff.java)
    The EventStaff class will handle objects representing the relationship between events and staff through IDs (managing many-to-many). This class has a constructor to improve the creation of the table relating events and staff. Attributes include:

    - eventId            Unique identifier for the event associated with the staff member.
    - staffId            Unique identifier for the staff member associated with the event.

3. #### [EventStaffFull.java](src\main\java\com\u2team\huansync\event\model\classes\EventStaffFull.java)
    The EventStaffFull class will handle objects that represent the relationship between events and staff, with Event having a list of staff. This class extends its parent "Event" and has two constructors to improve table creation for relating events and staff. Attributes include:

    - List<Staff> staff    List of staff members associated with the event.
    - extends Event        Extends its parent Event.

4. #### [Staff.java](src\main\java\com\u2team\huansync\event\model\classes\Staff.java)
    The Staff class will handle objects representing the relationship between events and staff through IDs (managing many-to-many). This class has a constructor to improve the creation of the table relating events and staff. Attributes include:

    - staffId            Unique identifier for the staff member associated with the event.

5. #### [StaffFull.java](src\main\java\com\u2team\huansync\event\model\classes\StaffFull.java)
    The StaffFull class includes workers in each section of the software, joining the Staff table with workerRole. This class has two constructors to improve Staff creation. Attributes include:

    - staffId                Unique identifier for the staff member.
    - staffNumberId          Staff number identifier.
    - nameStaff              Name of the staff member.
    - birthdayStaff          Birthday of the staff member.
    - statusStaffEnum        String representation of the staff status enum.
    - workerRoleId           Worker role ID associated with the staff member.

6. #### [WorkerRole.java](src\main\java\com\u2team\huansync\event\model\classes\WorkerRole.java)
    The WorkerRole class will include the role of workers at the event, referring to positions needed in each section of the software. This class has two constructors for better Staff creation management. Attributes include:

    - workerRoleId           Unique identifier for the workerRole.
    - workerRoleName         Name of the workerRole.
    - workerRoleActivities   List of activities performed by the workerRole.

7. #### [Equipment.java](src\main\java\com\u2team\huansync\event\model\classes\Equipment.java)
    The Equipment class will store information about utensils implemented in each event. A CRUD management is created to interact with this class. Attributes include:

    - equipmentId             Unique identifier for the equipment.
    - nameEquipment           Name of the equipment.
    - quantity                Quantity of the equipment available.
    - statusEquipmentEnum     Current status of the equipment.

### Enums:
Enums were implemented in certain classes to manage states or variables that will not repeat, aiding in feature selection.

1. #### StatusEquipmentEnum.java (in Equipment.java): 
   - IN_STOCK("The item is in the warehouse")           
   - ON_SITE("The item is at the Event's Location");

2. #### AgeClassificationEnum.java (in Event.java):
   - FAMILY("For the whole family")      
   - YOUNGER("Only for young people")    
   - ADULT("Adults Only");

3. #### StatusEnum.java (in Event.java):
   - ACTIVE("It is active"),      
   - FINISHED("It is Inactive")    
   - PENDING("It is Pending")

4. #### StatusStaffEnum.java (in Staff.java):
   - TASK_ASSIGNED     Indicates the worker has a task assigned
   - NO_TASK_ASSIGNED  Indicates the worker does not have a task assigned
   - DISMISSED         Indicates the worker is dismissed from their position

### Interfaces:
For method management, the use of interfaces was implemented. An IDao.java interface was created, which is implemented in sub-interfaces for CRUD management. CRUD implementation is stored in DAO folders of each package. These sub-interfaces are implemented depending on the case.

An interface extending IDao, providing a method to retrieve all entities with full details. This interface is generic, suitable for any type of entity collection.

- IGetByIdDao<Object Type>,
- IGetAllDao<Object Type>,
- ISaveDao<Object Type>,
- IUpdateDao<Object Type>,
- IDeleteDao<Object Type>,
- IGetAllFull<Object Type>,
- IGetByIdFull<Object Type>,
- IGetByIdFullDao<Object Type>,

Each class in the "DAO" folders will have methods for functionality management, which are overridden as each interface is implemented.

### Model, View, Controller (MVC)

MVC is a software architecture used to separate code by its different responsibilities, maintaining distinct layers that handle very specific tasks, offering various benefits.

As interfaces are needed for project realization, the construction of packages was carried out to implement MVC.

The EVENT module has a folder called Model and Controller.

- MODEL: This folder stores a subfolder of classes to be used and the "DAO" subfolder managing CRUD methods.
- CONTROLLER: This folder contains a class that acts as a controller, allowing smooth communication from the model to the view. Each class within its folder will contain this logic.

## Design Pattern
[Explain what design pattern was implemented in this group and why it was chosen. Detail how it was applied in the code]

- Builder: In our module, we implemented the Builder pattern only in the creation of the EVENT class, as this particular class managed a complex object. Therefore, it is an effective solution to control the creation of objects and improve readability.

## SOLID Application

The SOLID principles were applied to the event package model as follows:

**S** – Single Responsibility Principle: Applied through the use of interfaces for each action (CRUD), allowing for polymorphism as certain classes do not implement all actions.

**O** – Open/Closed Principle: Currently, these interfaces implement actions such as save, read, modify, and delete. However, some classes have extra actions like showing all information or in a specific way, leaving it open to the addition of more actions.

**L** – Liskov Substitution Principle: This principle explains how inheritance and polymorphism should be used correctly. Our classes make good use of this principle, where polymorphism can be applied.

**I** – Interface Segregation Principle: "Objects should not be forced to depend on interfaces they do not use." Therefore, there is a parent interface containing all managed interfaces, and each interface has its own function and action.

**D** – Dependency Inversion Principle: High-level modules should not depend on low-level modules. Both should depend on abstractions.

## Package Structure

The Event module is located at the path "\huanSync\src\main\java\com\u2team\huansync\event", and within the Event package, the following structure is managed:

Event
   - Controller
   - DAO
   - Equipment
       - Controller
       - Model
         - Classes
         - DAO
   - Model
         - Classes
         - DAO
         - Util
   - Staff
        - Controller
        - Model
                - Classes
                - DAO
   - WorkerRole
        - Controller
        - Model
                - Classes
                - DAO
