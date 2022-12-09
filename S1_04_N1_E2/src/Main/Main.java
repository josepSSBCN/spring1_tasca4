package Main;

public class Main {
    public static void main(String[] args) {
        // DEFINITION VARIABLES
        CalculateDNI myCalculateDNI = new CalculateDNI();
        String text = "";

        // ACTIONS
        text = "La lletra del DNI '99999999' és la: " + myCalculateDNI.getLetter(99999999);

        // OUT
        System.out.println(text + "\r\n\nFinal del programa");

    }
}