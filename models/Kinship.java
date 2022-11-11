package models;

public class Kinship {
    private final Human who;
    private final Human forWhom;
    private final KinshipType type;

    // Constructors
    public Kinship(Human who, Human forWhom, KinshipType type) {
        this.who = who;
        this.forWhom = forWhom;
        this.type = type;
    }

    // Override
    @Override
    public String toString() {
        return type + ": " + who.toString() + " for " + forWhom;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kinship kinship) {
            return (this.who == kinship.who) && (this.forWhom == kinship.forWhom) && (this.type == kinship.type);
        }
        return false;
    }

    // Getters
    public Human getWho() {
        return who;
    }
    public Human getForWhom() {
        return forWhom;
    }
    public KinshipType getType() {
        return type;
    }
}
