package ser210.quinnipiac.edu.starbuzzdatabase;

/**
 * Created by juliannashevchenko on 2/18/18.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of expresso shots with steamed milk.", R.drawable.latte),
            new Drink("Cappuccino", "Expresso, hot milk, and a steamed milk foam.", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality coffee beans roasted and brewed fresh.", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
