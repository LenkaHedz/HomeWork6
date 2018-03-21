package ua.training;

import ua.training.controller.Controller;
import ua.training.model.DBRecords;
import ua.training.model.Model;
import ua.training.view.View;

public class Main {
    public static void main( String[] args ) {

        for (DBRecords row : DBRecords.values()) {
            System.out.println(row +" ");
        }

        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
