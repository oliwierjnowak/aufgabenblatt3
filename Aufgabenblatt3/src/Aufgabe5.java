import javax.lang.model.element.NestingKind;

/*
    Aufgabe 5) Rekursion
*/
public class Aufgabe5 {

    private static String orderCharGroups(String text) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        if (text.length() <= 2) {
            return text;
        }
        char firstchar = text.charAt(text.length() - 1);

        char left = text.charAt(0);
        char right = text.charAt(1);
        if (left == firstchar) {
            String xx = orderCharGroups( text.substring(1 )) + String.valueOf(firstchar) ;
            return xx;
        }
        String xx =    String.valueOf(left)  + orderCharGroups(text.substring(1)) ;
        return xx;
    }


    public static void main(String[] args) {

        System.out.println(orderCharGroups(""));
        System.out.println(orderCharGroups("1"));
        System.out.println(orderCharGroups("12"));
        System.out.println(orderCharGroups("1212"));
        System.out.println(orderCharGroups("abbaaababbaa"));
        System.out.println(orderCharGroups("ABBA"));
        System.out.println(orderCharGroups("11221122"));
        System.out.println(orderCharGroups("AAAAAA"));
        System.out.println();

    }
}
