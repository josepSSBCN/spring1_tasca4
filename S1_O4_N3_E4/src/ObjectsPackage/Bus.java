package ObjectsPackage;

public class Bus {
    //region ATTRIBUTES
    private int numLine;
    private int numPassengers;
    private int yearsOld;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public Bus(int numLine, int numPassengers, int yearsOld) {
        this.numLine = numLine;
        this.numPassengers = numPassengers;
        this.yearsOld = yearsOld;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS
    public int getNumLine() {
        return numLine;
    }

    public void setNumLine(int numLine) {
        this.numLine = numLine;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    //endregion GETTERS & SETTERS


    //region METHODS

    //endregion METHODS


}
