package material;

import java.time.LocalDate;

public class CrispyFlour extends Material{
    private int quantity;
    public CrispyFlour(){
    }
    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity){
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CrispyFlour {ID='" + getId() + "' name='" + getName() + "' manufacturingDate='" + getManufacturingDate() + "' quantity='" + getQuantity() + "'}";
    }
    @Override
    public double getAmount() {
        return this.quantity * this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }
}
