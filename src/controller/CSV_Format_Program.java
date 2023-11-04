/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;
import common.Library;
import common.Validate;
import java.util.ArrayList;
import model.CSV;
import view.Menu;
/**
 *
 * @author DAO
 */
public class CSV_Format_Program extends Menu<String> {

    static String[] mc = {"Import CSV", "Format Address", "Format Name", "Export CSV", "Exit"};
    protected Library lib;
    protected Validate valid;
    protected ArrayList<CSV> ls;

    public CSV_Format_Program() {
        super("Format CSV Program ", mc);
        ls = new ArrayList<>();
        lib = new Library();
        valid = new Validate();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> {
                lib.importFileCSV(ls);
                lib.print(ls);
            }
            case 2 -> {
                valid.formatAddresses(ls);
                lib.print(ls);
            }
            case 3 -> {
                valid.formatNames(ls);
                lib.print(ls);
            }
            case 4 -> lib.exportFileCSV(ls);
            case 5 -> System.exit(0);
        }
    }
}

