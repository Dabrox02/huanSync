# TRADE - STORE, GROUP 7

Based on the specific requirements of the system, we have the management of cash registers along with stores, aiming to facilitate sales of various items in the requested convention. Each store will feature unique products in its inventory, and it will also handle those items that fulfill specific requests from buyers. The cash registers will have three states: active, inactive, and in the case of order transactions, there will be three states: registered, paid, and delivered.
Additionally, we will oversee a product inventory, managing its specifications and categorizing them by product types. All of these components are designed to optimize the sales process and ensure a seamless experience for buyers.

We have addressed various sections, including class modeling, database design, and the relevant CRUD operations for MySQL connectivity. Additionally, in the "Product" and "Promotion" sections, we have implemented the necessary logic to meet the requirements specified in the project.


## OOP (Object Oriented Programming)

We applied Object Oriented Programming principles, including inheritance, encapsulation, and interfaces in the class models.

## Design pattern

We implemented design patterns such as the Builder pattern for creating structures with many objects efficiently. Additionally, creation patterns were used for adding new products to the database. Behavior patterns were employed for generalized communication between objects and applying method assignments.

## Solid application 
In the context of DAO (Data Access Object) creation, we applied SOLID principles:


* Single Responsibility: Each DAO class focuses on a specific data access task, promoting cohesion and code maintainability.

* Open/Closed: The DAO structure allows for easy extension to add new data access functionalities without modifying existing code.

* Liskov Substitution: Concrete data access implementations can be used interchangeably, adapting the application to different data storage environments.

* Interface Segregation: Data access interfaces are divided into smaller, specific components, enhancing modularity and facilitating different data access strategy implementations.

* Dependency Inversion: Higher layers of the application depend on abstractions representing data access operations, allowing decoupling from concrete implementations for easier testing and component substitution.

## Package Structure 

[Group7- Trade, Store]
* establishment 
    * store
        * Controller 
            * StoreController 
        * Product 
            * controller
                * ProductController.java
            * model
                * classes
                    * builder
                        * ProductBuilder.java
                        * ProductConcreteBuilder.java
                    * Product.java
                    * TypeProductEnum.java
                * DAO
                    * ProductDAO
        * productOrder
        * promotion
        * sql 
        * README.md

This structure is generalized and applied to other components such as productOrder and promotion.

# System Requirements for the Stores Section

## 1. Inventory Management: completed

- Create a store type of establishment that allows the management of product inventory.
- Include fields in the inventory such as store identifier, product name, description, manufacturer, product type (figure, poster, button, clothing, etc.), available quantity, and individual price.
- Automatically update the inventory each time a sale is made, adjusting the available quantities.

## 2. Discounts and Promotions:not tested


- Implement the ability to manage discounts and promotions specifically for stores.
- Allow the creation of discounts such as combos, better prices for quantity, etc., and reflect these in the calculation of order values when applied.

## 3. Order Detail Query: completed

- Enable the possibility to query the details of each order made in a store.
- Display detailed information, including all items in the sale, the quantity sold, and the individual value of each product.

## 4. General Balance Reports: incomplete

- Integrate the ability to generate general balance reports for the event, specifically focused on stores.
- Allow the generation of reports both at a general level and individually for each store, showing relevant data such as total income, product sales, and any other pertinent metrics.

## 5. Establishment Administration: no tested 

- Enable the registration of multiple stores per event.
- Assign a responsible person to each store, selecting from the personnel previously registered in the system.
- Categorize each establishment as a "Store" to distinguish its function within the event.




##

#### Authors 
* Kevin Johan Jimenez 
* Kevin Sneider Esteban Merchan 
* Kevinn Dwight 
