/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Scanner;
import model.CSV;

/**
 *
 * @author DAO
 */
public class Validate {
    
    
    public static final Scanner in = new Scanner(System.in);
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";

    public void formatNames(ArrayList<CSV> ls) {
        for (int i = 0; i < ls.size(); i++) {
            String name = ls.get(i).getName().trim();
            name = name.toLowerCase().replaceAll("\\s+", ",");
            String[] arr = name.split(",");
            StringBuilder sb = new StringBuilder();
            for (String arr1 : arr) {
                sb.append(Character.toUpperCase(arr1.charAt(0))).append(arr1.substring(1)).append(" ");
            }
            ls.get(i).setName(sb.toString().trim());
        }
        System.err.println("Format: Done");
    }
    public void formatAddresses(ArrayList<CSV> ls) {
        for (int i = 0; i < ls.size(); i++) {
            String address = ls.get(i).getAddress().trim();
            address = address.toLowerCase().replaceAll("\\s+", ",");
            String[] arr = address.split(",");
            StringBuilder sb = new StringBuilder();
            for (String arr1 : arr) {
                sb.append(Character.toUpperCase(arr1.charAt(0))).append(arr1.substring(1)).append(" ");
            }
            ls.get(i).setAddress(sb.toString().trim());
        }
        System.err.println("Format: Done");
    }
}


