/*
    Aufgabe 1) Codeanalyse, Codingstyle und Methoden
*/
public class Aufgabe1 {
    //TODO zu Punkt a): Beschreiben Sie hier in 1-2 Sätzen was der Spaghetticode macht
    // Zeichenet einen Diamanten. beginnet mit der ersten row #++++++++++++++#
    //dann wird der Umfang von dem Diamanten gezeichnet bis zur mitte
    //und dann von hinten dasselbe nochmal

    //TODO zu Punkt b): Beschreiben Sie in 1-2 Sätzen was Sie ändern würden und warum
    // alt l und formatierung zu erst
    // 4 methoden schreiben die alles stukrieren
    //


    //TODO zu Punkt c und d): Implementieren Sie hier die Methoden Ihrer Lösung

    public static void main(String args[]) {
        //********************************************************
        //TODO zu Punkt c,d und e): Implementieren Sie hier Ihre Lösung für die Angabe

        int length = 38;
        System.out.println("Ihre Ausgabe:");
        System.out.println();
        drawRectangle(length);
        //********************************************************

        System.out.println();
        System.out.println("Ausgabe Spaghetticode:");

        System.out.print("#");
        for (int i = 1; i <= 8; i++) {
            System.out.print("+");
        }
        System.out.println("#");

        for (int i = 1; i < 5; i++) {
            System.out.print("#");
            for (int j = 2; j <= (8 / 2 - i + 1); j++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 2; j <= (8 / 2 - i + 1); j++) {
                System.out.print(".");
            }
            System.out.print("#");
            System.out.println();
        }

        System.out.println("#|      |#");
        for (int i = 1; i < 5; i++) {
            System.out.print("#");
            for (int j = 2; j <= i; j++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int j = 1; j <= (8 - 2 * i); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 2; j <= i; j++) {
                System.out.print(".");
            }
            System.out.print("#");
            System.out.println();
        }

        System.out.print("#");
        for (int i = 1; i <= 8; i++) {
            System.out.print("+");
        }
        System.out.println("#");
    }

    public static void printFirstOrLastRow(int length){
        System.out.print("#");
        for (int i = 1; i <= length; i++) {
            System.out.print("+");
        }
        System.out.println("#");
    }

    public static void printUpperMiddle(int length){
        int calc = length/2+1;
       // int  iter = length%2 == 0 ? 0:1;
        for (int i = 1; i < length/2+1; i++) {
            System.out.print("#");
            for (int j = 2; j <= (length / 2 - i + 1); j++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            int noteven = length%2 == 0 ? 1:2;
            for (int j = 2; j <= (length / 2 - i + noteven); j++) {
                System.out.print(".");
            }
            System.out.print("#");
            System.out.println();
        }
    }

    public static void printLowerMiddle(int length){
        int calc2 = length/2+1;
        int  iter = length%2 == 0 ? 1:2;
        for (int i = iter; i < length/2+1; i++) {
            System.out.print("#");
            for (int j = 2; j <= i; j++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int j = 1; j <= (length - 2 * i); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 2; j <= i; j++) {
                System.out.print(".");
            }
            System.out.print("#");
            System.out.println();
        }
    }

    public static void drawRectangle(int length){
        if (length < 4) {
            length = 4;
        }
        printFirstOrLastRow(length);
        printUpperMiddle(length);
        String spacebettwen = "";
        for (int i = 1; i < length-1; i++) {
            spacebettwen += " ";
        }
        System.out.println("#|"+spacebettwen+"|#");
        printLowerMiddle(length);
        printFirstOrLastRow(length);

    }
}


