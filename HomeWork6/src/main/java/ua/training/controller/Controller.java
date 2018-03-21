package ua.training.controller;

import ua.training.exception.NotUniqueException;
import ua.training.model.Model;
import ua.training.model.Record;
import ua.training.model.Row;
import ua.training.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;
    private Scanner scanner;

    public Controller(Model model, View view) {
        super();
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void processUser() {

        Record record = model.getNotebook().getFirstRecord();

        while (record.hasNextEmptyRow()) {
            Row nextRow = record.getNextRow();
            String value = inputStringValueWithScanner(nextRow.getRequest(), nextRow.getRegex());
            /*  suuudaa */
            try{
                record.writeNextRow(value);
            }
            catch(NotUniqueException e){
                view.printStringInput(e.getMessage());
            }


            record.setLastUpdate();
        }

        view.printFilledRecord(record);
    }

    public String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while (!(scanner.hasNext() && (res = scanner.nextLine()).matches(regex) )) {
            view.printWrongStringInput(message);
        }
        return res;
    }

}

