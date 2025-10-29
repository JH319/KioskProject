package level5;

public class MenuItem {
    /*--------------속성---------------*/
    private String name;
    private String price;
    private String description;

    /*--------------생성자---------------*/
    public MenuItem (String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    /*--------------기능---------------*/
    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }
}