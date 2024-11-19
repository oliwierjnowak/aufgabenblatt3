/*
    Aufgabe 4) Rekursion
*/
public class Aufgabe4 {

    private static boolean isStartAndEndSeq(String text, String sequence) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        if (text.length() < sequence.length()) {
            return false;
        }


        if (text.charAt(0) == sequence.charAt(0) && text.length()-1 == sequence.length()) {
            if (text.length() == 2) {
                return true;
            } else {
                return isStartAndEndSeq(text.substring(1), sequence.substring(1));
            }
        }
        if(text.charAt(0) != sequence.charAt(0)) {
            return false;
        }

        String begin = text.substring(0, sequence.length());
        String end = text.substring(text.length() - sequence.length(), text.length());
        if (text.length() == begin.length() && text.length() == end.length()) {
            return false;
        }

        return isStartAndEndSeq(begin+" ", sequence) && isStartAndEndSeq(end+ " ", sequence); //Zeile kann geändert oder entfernt werden.
    }

    public static void main(String[] args) {

        System.out.println(isStartAndEndSeq("", "1"));
        System.out.println(isStartAndEndSeq("AA", "A"));
        System.out.println(isStartAndEndSeq("ABBAB", "AB"));
        System.out.println(isStartAndEndSeq("ABBBA", "AB"));
        System.out.println(isStartAndEndSeq("ottootto", "otto"));
        System.out.println(isStartAndEndSeq("otto", "otto"));
        System.out.println(isStartAndEndSeq("ottotto", "otto"));
        System.out.println(isStartAndEndSeq("ottoottt", "otto"));
        System.out.println(isStartAndEndSeq("test1234test", "test"));
        System.out.println(isStartAndEndSeq("NEN", "NEEN"));

        //DIE NACHFOLGENDEN ZEILEN SIND ZUM TESTEN DER METHODE.
        //**********************************************************************
        assert (isStartAndEndSeq("", "1") == false);
        assert (isStartAndEndSeq("AA", "A") == true);
        assert (isStartAndEndSeq("ABBAB", "AB") == true);
        assert (isStartAndEndSeq("ABBBA", "AB") == false);
        assert (isStartAndEndSeq("ottootto", "otto") == true);
        assert (isStartAndEndSeq("otto", "otto") == false);
        assert (isStartAndEndSeq("ottotto", "otto") == false);
        assert (isStartAndEndSeq("ottoottt", "otto") == false);
        assert (isStartAndEndSeq("test1234test", "test") == true);
        assert (isStartAndEndSeq("NEN", "NEEN") == false);
        //**********************************************************************
    }
}
