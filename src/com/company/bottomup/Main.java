package com.company.bottomup;

import com.company.IPAddress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        IPAddress[] ipAddresses = new IPAddress[4637053];
        int i = 0;
        BufferedReader reader = new BufferedReader(new FileReader("src/unsorted.csv"));
        while (i < ipAddresses.length) {
            String row = reader.readLine();
            row = row.replace(", ", " ");
            String[] rowSplit = row.split(",");
            ipAddresses[i] = new IPAddress(Long.parseLong(rowSplit[0].substring(1, rowSplit[0].length() - 1)),
                    Long.parseLong(rowSplit[1].substring(1, rowSplit[1].length() - 1)),
                    rowSplit[2].substring(1, rowSplit[2].length() - 1),
                    rowSplit[3].substring(1, rowSplit[3].length() - 1),
                    rowSplit[4].substring(1, rowSplit[4].length() - 1),
                    rowSplit[5].substring(1, rowSplit[5].length() - 1));
            i++;
        }
        reader.close();
        System.out.println("Sorting..");
        MergeSort.sort(ipAddresses);


        System.out.println("Writing to file!");
        FileWriter writer = new FileWriter("src/sorted.csv");
        for (int i1 = 0; i1 < ipAddresses.length; i1++) {
            writer.write(ipAddresses[i1].toString() + "\n");
        }
        writer.flush();
        writer.close();



    }
}
