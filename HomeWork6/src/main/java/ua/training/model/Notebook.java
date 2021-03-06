package ua.training.model;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private List<Record> records;

    public Notebook() {
        super();
        records = new ArrayList<Record>();
        records.add(new Record());
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public boolean addRecord(Record record) {
        return records.add(record);
    }

    public Record getFirstRecord() {
        return records.get(0);
    }

}
