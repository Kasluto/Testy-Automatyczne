import org.w3c.dom.ls.LSOutput;

public class Kamien {

    //zmienna przechowująca wartość liczbową

    //static int waga = 10 % 2;
    //static double waga = 10.121212D;
    //static float waga2 = 10.121212F;

    //static char znak = 'a';




//byte aByte;
//short aShort;
//int anInt;
//long aLong;

//doubleD dziesiętne liczby - ogromna
//floatF dziesiętne liczby - duża

    String obiektString = "Niebieski Kamien".toUpperCase();


    public static void main(String[] args) {
        //int waga = 10%2 -- jeżeli nie ma static pod klasą to piszemy tutaj
        int wagaInt = 13;
        double wagaDouble = 10.1233432 + 2;
        float wagaFloat = 10.123213123F;

        char znak;
        znak = '\u00E7';
        System.out.println(znak);
        znak = 'b';
        System.out.println(znak);

        boolean zmiennaBoolean = true;
        zmiennaBoolean = false;

        zmiennaBoolean = wagaInt == wagaDouble;


        if (wagaInt < wagaDouble) {
            System.out.println("JESTEM W IFIE");
        }else{
            System.out.println("JESTEM W ELSIE");
        }


        String zmiennaString = "c";
        String wynik;

        if (zmiennaString.equals("c")) {
            wynik = "A";
        }else if (zmiennaString == "b") {
            wynik = "B";
        }else if (zmiennaString == "c") {
            wynik = "C";
        }else if (zmiennaString == "d") {
            wynik = "D";
        }else{
            wynik ="Inna litera hurwo";
        }

        //tego się już nie używa
        switch (zmiennaString){
            case "a":
                System.out.println("TO LITERA A");
                break;
            case "b":
                System.out.println("TO LITERA B");
                break;
            case "c":
                System.out.println("TO LITERA C");
                break;
            case "d":
                System.out.println("TO LITERA D");
                break;
            default:
                System.out.println("TO INNA LITERA");

        }

        String pierwszy = "To jest początek zdania ";
        String drugi = "a to jego koniec";
        String trzeci = pierwszy + drugi;
        System.out.println(trzeci);


    }

}
