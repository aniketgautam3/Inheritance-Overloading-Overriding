package Assignment1.packages.material;

import Assignment1.packages.stock.Inventory;

public class Accessories extends Inventory {
    private int id;
    private String description;

    public Accessories(int id) {
        this.id = id;
        this.description = "A"+id;
        super.setLowOrderLevelQuantity(5);
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", lowOrderLevelQuantity=" + lowOrderLevelQuantity +
                '}';
    }
}