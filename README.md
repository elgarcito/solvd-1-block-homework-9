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

### 14/11/2023

* Move all projects to Maven.
* Build jar file and deploy to the local repository.
* Add 2 Plugins.
* Run mvn for different phases from the Maven lifecycle. Check the result.

### Solution
The project was moved to maven following the structure given in the
theoretical classes.

All the previous operations done in the previous
exercises were added to the main method in order to test the package creation
with maven.

Build jar file was created with mvn install.
Here you can see a screenshot:
https://drive.google.com/file/d/12PzTYK1dDr7_wooUrqSZJecpVOT_UO4V/view?usp=sharing

Then it was deployed in the local repository with mvn deploy.
Here you can see a screenshot:
https://drive.google.com/file/d/1zFeavhrVIOKkerx0SUay4Bc1kfbpCFs9/view?usp=sharing

The two plugins added are:
* Added: maven-compiler-plugin, maven-jar-plugin.

This was made through pom.xml file

The file lifeCycleStages.txt has the result of all the terminal output
in each phase you can see it in:
* https://drive.google.com/file/d/1GINcUpLh30BV1tQhW0x3PmoIRz6oJMbc/view?usp=sharing