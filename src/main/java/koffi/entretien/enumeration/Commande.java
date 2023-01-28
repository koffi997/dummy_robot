package koffi.entretien.enumeration;

public enum Commande {
    DEVANT,DERRIERE,GAUCHE,DROITE,BOUGE;
    public static Commande valueOfIgnoreCase(String name) {
        return valueOf(name.toUpperCase());
    }
}
