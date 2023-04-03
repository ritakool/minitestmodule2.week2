package material;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class MaterialManagement implements Discount{
    private ArrayList<Material> materials;
    public MaterialManagement () {
        this.materials = new ArrayList<>();
    }
    public MaterialManagement(ArrayList<Material> materials) {
        this.materials = materials;
    }
    public void addArray(Material material) {
        this.materials.add(material);
    }
    public void outputMaterial () {
        for (Material m: materials) {
            System.out.println(m);
        }
    }
    public void updateMaterial(String id,Material material) {
        int index = -1;
        for (Material m : materials) {
            if (m.getId().equals(id)) {
                index = materials.indexOf(m);
                break;
            }
        }
            materials.set(index, material);
    }
    public void deleteMaterial(String id) {
        for (Material m: materials) {
            if ( m.getId().equals(id)){
                materials.remove(m);
                break;
            }
        }
    }

    @Override
    public double getRealMoney(Material material) {
        double amount = material.getAmount();
        double realmoney = 0;
        if (material instanceof CrispyFlour){
            LocalDate aboutDays = ((CrispyFlour)material).getExpiryDate();
            Period period = Period.between(LocalDate.now(), aboutDays);
            int month = (int) period.getMonths() + 12 * period.getYears();
            if (month >= 4){
                realmoney = amount * 0.95;
            } else if (month >= 2) {
                realmoney = amount * 0.8;
            } else {
                realmoney = amount * 0.6;
            }
        } else if (material instanceof Meat) {
            LocalDate aboutDays = ((Meat)material).getExpiryDate();
            Period period = Period.between(LocalDate.now(), aboutDays);
            int Day = (int) period.getDays();
            if (Day >= 5) {
                realmoney = amount * 0.9;
            } else {
                realmoney = amount * 0.7;
            }
        }
        return realmoney;
    }
    public void Summ() {
        double sum = 0;
        for (Material material : materials){
            sum += getRealMoney(material);
        }
        System.out.println("sum");
    }
}
