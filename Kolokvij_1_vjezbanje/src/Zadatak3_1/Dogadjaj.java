package Zadatak3_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Dogadjaj {
    private String naziv;
    private LocalDate datum;

    public Dogadjaj(String naziv, LocalDate datum) {
        this.naziv = naziv;
        this.datum = datum;
    }

    public LocalDate getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return naziv + " - " + datum.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
