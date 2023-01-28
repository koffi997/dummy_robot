package koffi.entretien;

import koffi.entretien.enumeration.Commande;
import koffi.entretien.model.Robot;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int table = 5;
        Integer x, y;
        Robot robot = new Robot();
        Scanner in = new Scanner(System.in);

        System.out.println("Please your robot x : ...");
        x = in.nextInt();
        robot.setX(x);

        System.out.println("Please your robot y : ...");
        y = in.nextInt();
        robot.setY(y);

        do {
            System.out.println("command me: ...");
            String c = in.next();
            try {
                Commande com = Commande.valueOf(c);
                // System.out.println("commande me: ... " + com);
                if (com.equals(Commande.BOUGE)) {
                    robot.move();
                    System.out.println("RAPPORT : " + robot);
                } else {
                    robot.setDirection(com);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("PAS DE COMMANDE "+ c);
            }
        } while (table > 0);
        in.close();
    }
}
