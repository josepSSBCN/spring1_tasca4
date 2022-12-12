package ObjectsPackage;

public class Car {
    //region ATTRIBUTES
    private String model;
    private int hp;
    private int km;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public Car(String model, int hp, int km) {
        this.model = model;
        this.hp = hp;
        this.km = km;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    //endregion GETTERS & SETTERS


    //region METHODS

    //endregion METHODS


}
