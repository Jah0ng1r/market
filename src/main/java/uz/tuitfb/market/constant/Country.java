package uz.tuitfb.market.constant;

import java.util.Arrays;
import java.util.List;

public enum Country {
    UZB(1, "Uzbekistan"),
    RUS(2, "Russian");

    private final Integer id;
    private final String name;

    Country(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Country> getCountries() {
        return Arrays.asList(values());
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
