/*
    Aufgabe 6) Kreise => Rekursiv
*/

import codedraw.*;

import java.awt.*;

public class Aufgabe6 {

    private static void drawCirclesRec(CodeDraw myDrawObj, int y, int radius, int num) {
        myDrawObj.setColor(new Color(255 - num * 30, 255 - num * 30, 0));
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
       if(num == 0){
           return;
       }
       else{
           num --;
       }
        myDrawObj.drawCircle(512/2,y * (3/2),radius);
        myDrawObj.drawCircle(512/2,y * (1/2),radius);


        radius = radius / 2;

       // drawCirclesRec(myDrawObj,y/2,radius,num);
       // drawCirclesRec(myDrawObj,(y) * 3/2,radius,num);
        drawCirclesRec(myDrawObj,(y) ,radius,num);

      //  num = num - 1;
       // drawCirclesRec(myDrawObj,y/num,radius,num);
      //  myDrawObj.show();
    }

    public static void main(String[] args) {
        int pixelWidth = 512;
        int pixelHeight = 512;
        CodeDraw myDrawObj = new CodeDraw(pixelWidth, pixelHeight);
        drawCirclesRec(myDrawObj, pixelHeight / 2, pixelWidth / 2, 5);
        myDrawObj.show();
    }
}



