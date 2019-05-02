package com.example.educstarbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResId;

    private Drink(String name, String description, int imageResId) {
        this.name = name;
        this.description = description;
        this.imageResId = imageResId;
    }

    // массив с элементами Drink

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte)
            , new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino)
            , new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private String getName() {
        return name;
    }

    private String getDescription() {
        return description;
    }

    private int getImageResId() {
        return imageResId;
    }

    public String toString() {
        return this.name;
    }
}
