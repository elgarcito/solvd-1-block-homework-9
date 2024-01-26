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
        //Examples to create a conflict
        ElectricProduct lightBulb =new ElectricProduct("Light Bulb","Led small light bulb");
        Employee carlosRusso = new Employee("carlos Russo", "123@gmail.com", "12345678", "Deposit");
        ConstructionProduct sand = new ConstructionProduct("Sand", "White sand", "Tn");
        GardenProduct gardenScissors = new GardenProduct("Big scissors", "Big size scissors to cut grass", false);
        GasProduct gasBurner = new GasProduct("Gas Burner", "Gas kitchen burner");
    }
}
