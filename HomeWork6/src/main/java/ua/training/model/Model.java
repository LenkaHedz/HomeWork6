package ua.training.model;

public class Model {

    private Notebook notebook;

    public Model() {
        super();
        notebook = new Notebook();
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

}
