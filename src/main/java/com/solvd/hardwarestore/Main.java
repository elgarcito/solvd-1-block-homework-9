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

import com.solvd.hardwarestore.abstractclasses.RawMaterial;
import com.solvd.hardwarestore.funcinterfaces.ModifyAnyString;
import com.solvd.hardwarestore.funcinterfaces.OperateInEmployeeList;
import com.solvd.hardwarestore.funcinterfaces.ResultAsInteger;
import com.solvd.hardwarestore.person.Employee;
import com.solvd.hardwarestore.readwritefile.ReadingFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Path of the input file
        String inputFilePath = "src/main/resources/input.txt";
        // Path of the output file
        String outputFilePath = "src/main/resources/output.txt";
        //Calling the method to read and write in files
        ReadingFile.readWriteFile(inputFilePath, outputFilePath);
        System.out.println();
        //Five lambda functions used in separateProduct()
        Employee joseAntonio = new Employee("Jose Antonio", "123@gmail.com", "12345678", "seller");
        joseAntonio.setVacation(15);
        Employee carlosRusso = new Employee("carlos Russo", "123@gmail.com", "12345678", "Deposit");
        carlosRusso.setVacation(20);
        LOGGER.info(RawMaterial.separateProduct("sand", 1000, joseAntonio));
        System.out.println();
        LOGGER.info(RawMaterial.separateProduct("gasoline", 15, joseAntonio));
        System.out.println();

        //Three custom lambda functions with generics
        //Custom lambda function 1: OperateInEmployeeList<T extends ArrayList<Employee>,R> retrieves something
        //Of an arrayList of Employees

        OperateInEmployeeList<ArrayList<Employee>, ArrayList<String>> getEmployeeNameList = employeesList -> {
            ArrayList<String> list1 = new ArrayList<>();
            for (Employee employee : employeesList) {
                list1.add(employee.getPersonName());
            }
            return list1;
        };
        ArrayList<String> list2 = getEmployeeNameList.getFromEmployeeArray(Employee.getCopyOfEmployeeArrayList());
        for (String name : list2) {
            LOGGER.info(name);
        }


        //Custom lambda function 2 ModifyAnyString<T> Retrieve always a string
        ModifyAnyString<String> addRandomGoodBye = text->{
            String [] goodBye={ " .Goodbye! Take care.",
                    " .Farewell! Until we meet again.",
                    " .Adios! Wishing you the best.",};
            Random random =new Random();
            return text+goodBye[random.nextInt(2)];
        };

        LOGGER.info(addRandomGoodBye.getModifiedString("You own 22$"));

        //Custom lambda function 3 ResultAsInteger <T,V> The result is always an integer
        ResultAsInteger<Employee,Employee> howManyVacationDays= (employee, employee1)->
                employee.getVacation()+employee1.getVacation();

        LOGGER.info("both employees have: "+howManyVacationDays.resultIsInteger(joseAntonio,carlosRusso)+" days of vacation");


    }
}
