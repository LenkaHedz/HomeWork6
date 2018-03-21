package ua.training.view;

import ua.training.model.Record;

public class View {

    public void printStringInput(String message) {
        print("Input your " + message + " and press ENTER");
    }

    public void printWrongStringInput(String message) {
        print("Wrong input. Input your " + message + " again and press ENTER");
    }

    public void printFilledRecord(Record record) {
        print(record.toString());
    }

    public void print(String message) {
        System.out.println(message);
    }

}
