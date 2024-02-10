package com.solvd.hardwarestore.read_write_file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ReadingFile {
    private static final Logger LOGGER= LogManager.getLogger(ReadingFile.class);
    // Input and output file paths

    public static void readWriteFile(String inputFilePath, String outputFilePath){
        try {
        // Read text from the input file
        String content = FileUtils.readFileToString(new File(inputFilePath), "UTF-8");


        // Split the content into words
        String[] words = StringUtils.split(content);

        //Delete al punctuation in the array and low case the text
        for (int i = 0; i < words.length-1; i++) {
            //To lower case
            words[i]=words[i].toLowerCase();
            words[i]=words[i].replaceAll("\\p{Punct}", "");
        }
            Arrays.sort(words);

        //Count the amount of words in the array
        int arrayLength= words.length;

        //System.out.println(Arrays.toString(words));

        // Count the occurrences of each word
        Map<String,Integer> wordCount = new HashMap<>();
        int count =0;
        for (int i = 0; i<=arrayLength-1; i++){
            for (int j=i;j<=arrayLength-1;j++){
                if (words[i].equals(words[j])){
                    count++;
                }
            }
            wordCount.putIfAbsent(words[i],count);
            count=0;
        }

        //System.out.println(wordCount);
        // Convert the map to a String representation. First i create an array
        //with wordCount.entrySet() and then i join it
        String result = StringUtils.join(wordCount.entrySet(), '\n');

        // Write the result to the output file
        FileUtils.writeStringToFile(new File(outputFilePath), result, "UTF-8");

        LOGGER.info("Saved into: " + outputFilePath);
    } catch (
    IOException e) {
            LOGGER.error(e.getMessage());
        }
    }


}

