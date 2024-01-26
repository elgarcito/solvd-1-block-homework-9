# hardware store
Progressive exercises of QA automation training, using maven and git.

## Project description:
In this project, we have a hardware store that sells different products.

<p align="center">
<img src="https://t4.ftcdn.net/jpg/03/39/67/57/360_F_339675724_zKIsiEcSss6x2KOXUfHMfBrK9b0qbYCQ.jpg" alt="Image of a hardware store" width="300" height="200">
</p>

We represent this product using classes.
We can see the classes and some examples of products that they are going to content:
1. ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
   10 kg of sand.
2. ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3. HandTool: hammer, hand saw, etc.
4. GardenProduct:shovel, plant pot, etc.
5. HouseholdItem: kettle, broom, brush, etc.
6. WaterProduct:water filter, water pump, etc.
7. GasProduct: gas valve, etc.

Besides that, we have the persons that interact with the store these are:
1. Employee: these are the employees of the store and could be: seller, deposit or owner
2. Supplier: the one that sells us the products
3. BigClient: at the moment, the store only works with big clients that are an small amount and are registered.

## Exercises and references:

### 28/11/2023
* Use at least 5 lambda functions from the java.util.function package. 
* Create 3 custom Lambda functions with generics. 
* Create 5 complex Enums(with fields, methods, blocks).

### Solution
The five lambda functions are in the class RawMaterial
in the method separateProduct(String materialType, double amount ,Employee employee).
The functions used are: 
* Function-Bifunction-Predicate-Biconsumer-Supplier.
This method tells an employee how to separate gasoline and sand,
  in how many recipients or bags, the estimated time of work to do it and 
  the transaction date.
  This method applies only in this class and this method
  .For that reason, we use these functions

The example of this implementation could be seen in the main method.

The three custom lambda functions with generics are in the package funcinterfaces. These are:
* ModifyAnyString: Retrieves a string
* OperateInEmployeeList: Retrieves something when you operate into a List of employee
* ResultAsInteger: Retrieves always an integer

The example of this implementation could be seen in the main method.

The five Enums are in the package enumexamples and are: 
* PhoneNumbers, CurrencyExchange, BankAccounts, LowLevelPassword,
  ImportantEmails.
  Each one has fields, methods, and blocks.

The example of using the static function in each case could be seen in the main method.



