package ru.example.prometheustestapp.model;

import java.time.LocalDate;

public class LocalDateWrapper {
    private LocalDate currentServerDate;

    public LocalDateWrapper(LocalDate date) {
        this.currentServerDate = date;
    }


    public LocalDate getCurrentServerDate() {
        return currentServerDate;
    }

    public void setCurrentServerDate(LocalDate currentServerDate) {
        this.currentServerDate = currentServerDate;
    }
}
