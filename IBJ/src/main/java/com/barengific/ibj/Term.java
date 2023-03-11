package com.barengific.ibj;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Term {
    SimpleStringProperty description;
    SimpleIntegerProperty number;

    public Term(SimpleIntegerProperty number, SimpleStringProperty description) {
        this.number = number;
        this.description = description;
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public int getNumber() {
        return number.get();
    }

    public SimpleIntegerProperty numberProperty() {
        return number;
    }

    public void setNumber(int number) {
        this.number.set(number);
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public Term(SimpleStringProperty description) {
        this.description = description;
    }
}
