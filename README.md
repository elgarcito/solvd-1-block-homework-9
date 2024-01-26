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

### 16/11/2023
Read text from the file and calculate the numbers of the unique words.
Write the result to the file.
The main requirement is: using StringUtils and FileUtils to implement it with minimun
lines of code.

### Solution

Create the ReadingFile.java class in the readwritefile package.
It has a static class ReadFile.readWriteFile(inputFilePath, ouputFilePath)
that once called:
1. Read the input.txt file in the resources package
2. Write output.txt file in the resources package.
   This file sets a list with the unique words and the number of times that
they appear in the input file.

As example: input:

This is a text to see if the reading and counting work work

output:
- counting=1
- the=1
- a=1
- see=1
- and=1
- work=2
- this=1
- reading=1
- is=1
- text=1
- to=1
- if=1
