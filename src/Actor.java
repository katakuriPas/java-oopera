import java.util.Objects;

public class Actor extends Person{

    private double height;

    public Actor(String name, String surName, Gender gender, double height) {
        super(name, surName, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return surName + " " + name + " " + "(" + height + ")";
    }

    @Override
    public boolean equals(Object actor) {
        if (this == actor) return true;
        if (actor == null || getClass() != actor.getClass()) return false;
        Actor otherActor = (Actor) actor;
        return Objects.equals(this.surName, otherActor.surName)
                && Objects.equals(this.name, otherActor.name)
                && Objects.equals(this.gender, otherActor.gender)
                && (this.height == otherActor.height);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,surName, gender, height);
    }
}
