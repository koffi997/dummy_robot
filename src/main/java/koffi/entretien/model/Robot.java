package koffi.entretien.model;

import koffi.entretien.enumeration.Commande;

public class Robot {
    private int x;
    private int y;
    private Commande direction;

    public Robot() {

    }

    public Robot(int x, int y, Commande direction) {
        super();
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Commande getDirection() {
        return direction;
    }

    public void setDirection(Commande direction) {
        this.direction = direction;
    }

    public void move() {
        try {
            switch (direction) {
                case DERRIERE -> this.x--;
                case DEVANT -> this.x++;
                case GAUCHE -> this.y--;
                case DROITE -> this.y++;
                default -> throw new IllegalArgumentException("Unexpected value: " + direction);
            }
        } catch (NullPointerException e) {
            System.out.println("direction is not initilise");
        }
    }

    @Override
    public String toString() {
        return "Robot [x=" + x + ", y=" + y + ", direction=" + direction + "]";
    }

    public int[] report() {
        int [] myArray = {this.x,this.y};
        return myArray ;
    }
}
