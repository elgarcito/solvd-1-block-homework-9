package com.solvd.hardwarestore;
/*
Hardware store
In this project, we have a hardware store that sells different products.
We represent this product using classes.
Now we can se the classes and some examples of the kind of product that they are going to content:
1-ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
10 kg of sand
2-ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3-HandTool: hammer, hand saw
4-GardenProduct:shovel, plant pot
5-HouseholdItem: kettle, broom, brush
6-WaterProduct:water filter, water pump
7-GasProduct: gas valve,etc

Also, we have:
Employee: the employee of the store.
ProductSupplier: the one that sells the product.
Client: the one that buys the product.
 */

import com.solvd.hardwarestore.customlinkedlist.CustomLinkedList;
import com.solvd.hardwarestore.exceptions.AutoCloseableNoResource;
import com.solvd.hardwarestore.finalclasess.PayingRates;
import com.solvd.hardwarestore.person.BigClient;
import com.solvd.hardwarestore.person.Employee;
import com.solvd.hardwarestore.person.ProductSupplier;
import com.solvd.hardwarestore.products.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.hardwarestore.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        //Whole project united to create a local repository

        //Instantiations of the different implemented classes after the implementation of abstract

        System.out.println("Hello and welcome to hardware store!! \n");
        //classes
        //humans or companies
        BigClient bigClient=new BigClient("Edward Cullen","Edward@gmail.com","+224586634");
        System.out.println(bigClient.toString()+"\n");
        ProductSupplier rinoMax= new ProductSupplier("Jason Krueger","jason@gmail.com","+12812516","sand");
        Employee carlosRusso = new Employee("carlos Russo", "123@gmail.com", "12345678", "Deposit");
        Employee joseAntonio = new Employee("Jose Antonio", "123@gmail.com", "12345678", "seller");

        //Polymorphism with Person abstract class example
        rinoMax.setSupplierAge(21);
        bigClient.setBigClientAge(60);
        carlosRusso.setEmployeeAge(30);
        rinoMax.checkAge();
        System.out.println();
        bigClient.checkAge();
        System.out.println();
        carlosRusso.checkAge();
        System.out.println();

        //Products
        ConstructionProduct sand = new ConstructionProduct("Sand", "White sand", "Tn");
        System.out.println(sand.getRawMaterialDescription());
        //Creating the first Electric product
        ElectricProduct lightBulb = new ElectricProduct("Light bulb 2", "led light bulb");
        //Getting the product name
        System.out.println(lightBulb.toString());
        //setting the power field
        lightBulb.setPower(10);
        //getting the power field
        System.out.println("The lightBulb power is: "+lightBulb.getPower()+"kW\n");
        //Creating the second Electric product
        ElectricProduct lightBulb2 = new ElectricProduct("Light bulb 1", "led light bulb");
        //getting the lightBulb2 id that used hashCode override to create a unique id
        System.out.println(lightBulb2.toString()+"\n");
        //Checking if lightBulb is equal to lightBulb2 to implement hashCode and equals override
        System.out.println("Electric products are equals?: "+lightBulb.equals(lightBulb2)+"\n");

        //Creating GardenProduct Objects
        GardenProduct gardenScissors = new GardenProduct("Big scissors", "Big size scissors to cut grass", false);
        GardenProduct gardenScissors1 = new GardenProduct("Medium scissors", "Medium size scissors to cut grass", false);
        GardenProduct gardenScissors2 = new GardenProduct("Small scissors", "Small size scissors to cut grass", false);

        //Creating a new gas Product
        GasProduct gasBurner = new GasProduct("Gas Burner", "Gas kitchen burner");
        System.out.println(gasBurner.toString()+"\n");
        GasProduct gasBurner2 = new GasProduct("Gas Burner", "Gas kitchen burner");
        gasBurner2.setStock(8);
        System.out.println("Gas burner stock is: "+gasBurner2.getStock());
        //Creating a HandTool Object
        HandTool handSaw=new HandTool("Hand saw","Small hand saw");
        System.out.println(handSaw.getProductDescription());
        //Creating HouseholdItem Objects
        HouseholdItem broom =new HouseholdItem("Big broom","Industrial boom");
        System.out.println(broom.getProductName());
        HouseholdItem broom1 =new HouseholdItem("Small broom","House boom");
        //Creating a WaterProduct Object
        WaterProduct pump1=new WaterProduct("Excelsior pump","20 hp power pump");
        System.out.println(pump1.getProductName());

        //Polymorphism with Person abstract class in BigClient, Employee and Supplier classes example
        rinoMax.setSupplierAge(21);
        bigClient.setBigClientAge(60);
        carlosRusso.setEmployeeAge(30);
        rinoMax.checkAge();
        System.out.println();
        bigClient.checkAge();
        System.out.println();
        carlosRusso.checkAge();
        System.out.println();

        //Polymorphism with Available, Costable, Priceable, Sellable, Stockable and TransactionDateable interfaces
        //implemented in classes ElectricProduct and GasProduct
        lightBulb.setStock(20);
        gasBurner.setStock(10);
        //Available interface
        lightBulb.checkAvailability(10);
        gasBurner.checkAvailability(5);
        //Costable interface
        double lightBulbCost= lightBulb.defineCost(10.0,1,1);
        double gasBurnerCost= gasBurner.defineCost(10.0,1,1);
        //Priceable interface
        lightBulb.definePrice(lightBulbCost,10);
        gasBurner.definePrice(gasBurnerCost,10);
        //Sellable interface
        lightBulb.removeStockDueSell(5);
        gasBurner.removeStockDueSell(1);
        //TransactionDateable.java
        lightBulb.transactionDate();
        gasBurner.transactionDate();

        //Create final class, method, variable
        //Final Class
        PayingRates payingRates=new PayingRates();
        //Final method
        payingRates.showRates();
        //Final variables
        payingRates.getOwnerRate();
        payingRates.getSellerRate();
        payingRates.getDepositRate();

        //Create a static block, method, variable
        //Static block in ElectricProduct class
        //Static method
        ElectricProduct.showAmountOfElectricProducts();
        //Static variable
        int electricProductCounter = ElectricProduct.electricProductCounter;

        //Try-catch handled in two ways and checking each exception
        //Created an employee with all wrong data to throw all exceptions
        Employee jackLalein=new Employee("jack 123 my name is too long","jack@gmail.com","12345678","seller");
        jackLalein.checkEmployeeData();
        jackLalein.setPersonName("jack lalein1");
        System.out.println();
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPersonName("jack lalein");
        jackLalein.setPersonEmail("jack@momo");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPersonEmail("jack@gmail.com");
        jackLalein.setPhoneNumber("123456789");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPhoneNumber("12345678");
        jackLalein.setSpeciality("cleaner");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setSpeciality("seller");
        //All Employee correct data result
        jackLalein.checkEmployeeData();
        System.out.println();
        //Try-catch with resource example
        try (AutoCloseable ac = new AutoCloseableNoResource()) {
            LOGGER.info("Inside try block to test Try catch with exception");
        } catch (Exception e) {
            LOGGER.error("An error occurred: " + e);
        }
        System.out.println();

        //Collection examples
        //ArrayList<Employees>
        Employee.addEmployeeToArrayList(carlosRusso);
        Employee.addEmployeeToArrayList(joseAntonio);
        ArrayList<Employee> employeeList=Employee.getCopyOfEmployeeArrayList();
        LOGGER.info(employeeList.get(1).toString());
        LOGGER.info("Iterate the ArrayList using enhanced for loop");
        for (Employee employee:employeeList) {
            LOGGER.info(employee.getSpeciality());
            System.out.println();
        }
        //HashSet<GardenProducts>
        GardenProduct.addGardenProductToHashSetList(gardenScissors);
        GardenProduct.addGardenProductToHashSetList(gardenScissors1);
        HashSet<GardenProduct> gardenProductsListCopy=GardenProduct.getCopyOfGardenProductHashSetList();
        LOGGER.info("The product: "+gardenScissors+" exist in the list (true =yes, no=false): "
                +gardenProductsListCopy.contains(gardenScissors));
        //ArrayList<ElectricProducts>
        ElectricProduct.addElectricProductToArrayList(lightBulb);
        ElectricProduct.addElectricProductToArrayList(lightBulb2);
        ArrayList<ElectricProduct>electricProductArrayList=ElectricProduct
                .getCopyOfElectricProductArrayList();
        LOGGER.info("Iterate the ArrayList using for loop");
        for (int i = 0; i < 2; i++) {
            LOGGER.info(electricProductArrayList.get(i).getProductName());
            System.out.println();
        }
        //ArrayList<HouseholdItem>
        HouseholdItem.addHouseholdItemToArrayList(broom);
        HouseholdItem.addHouseholdItemToArrayList(broom1);
        ArrayList<HouseholdItem>householdItemsList=HouseholdItem.getCopyOfHouseholdItemArrayList();
        //ArrayList<String> in Employee class
        HashSet<String> employeesResumeInformation=Employee.getEmployeeResumeList();
        Iterator<String> iterator=employeesResumeInformation.iterator();
        LOGGER.info("Iterate the HashSet using iterator");
        while (iterator.hasNext()){
            LOGGER.info(iterator.next()+"\n");
            System.out.println();
        }
        //Trying the CustomLinkedList With generics
        CustomLinkedList<String> myList = new CustomLinkedList<>();
        myList.addEndNode("1");
        myList.addEndNode("2");
        myList.addEndNode("5");
        myList.addEndNode("6");
        //Printing all the data
        myList.printAllData();
        System.out.println();
        //Deleting the firstNode
        myList.deleteFirstNode();
        System.out.println();
        myList.printAllData();
        System.out.println();
        //Deleting an element in the middle of the Customlinked list
        myList.deleteMiddleNode("5");
        //Adding a firstNode
        myList.addFirstNode("7");
        System.out.println();
        myList.printAllData();
        System.out.println();
        //deleting the lastNode of the last part
        myList.deleteLastNode();
        myList.deleteLastNode();
        myList.deleteFirstNode();
        System.out.println();
        myList.printAllData();
        //Delete the whole list
        myList.addEndNode("1");
        myList.addEndNode("2");
        myList.addEndNode("5");
        myList.addEndNode("6");
        System.out.println();
        myList.printAllData();
        myList.deleteCustomLinkedList();
        myList.printAllData();

        // END Interacting with the CustomLinkedList
        // Interacting with CustomLinkedList using an object
        CustomLinkedList<ElectricProduct> electricProductCustomLinkedList= new CustomLinkedList<>();
        ElectricProduct lightBulb3=new ElectricProduct("Light bulb3","led light bulb");
        ElectricProduct lightBulb4=new ElectricProduct("Light bulb4","led light bulb");
        ElectricProduct lightBulb5=new ElectricProduct("Light bulb4","led light bulb");
        ElectricProduct lightBulb6=new ElectricProduct("Light bulb6","led light bulb");
        ElectricProduct lightBulb7=new ElectricProduct("Light bulb7","led light bulb");
        electricProductCustomLinkedList.addFirstNode(lightBulb3);
        electricProductCustomLinkedList.addEndNode(lightBulb4);
        electricProductCustomLinkedList.addEndNode(lightBulb5);
        electricProductCustomLinkedList.addEndNode(lightBulb6);
        electricProductCustomLinkedList.addEndNode(lightBulb7);
        electricProductCustomLinkedList.deleteFirstNode();
        electricProductCustomLinkedList.deleteMiddleNode(lightBulb5);
        electricProductCustomLinkedList.printAllData();


    }
}
