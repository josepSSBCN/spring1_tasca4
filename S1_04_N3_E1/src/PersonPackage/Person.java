package PersonPackage;

public class Person {
    //region ATTRIBUTES
    protected String name;
    protected String surname;
    protected String dni;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public Person(){

    }

    public Person(String name, String surname, String dni){
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //endregion GETTERS & SETTERS


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        if (!surname.equals(person.surname)) return false;
        return dni.equals(person.dni);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + dni.hashCode();
        return result;
    }
}
