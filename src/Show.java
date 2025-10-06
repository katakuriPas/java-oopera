import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;

    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    @Override
    public String toString() {
        if(this.listOfActors.isEmpty()){
            return "❌ Actor list is empty";
        }

        String res = "";
        System.out.println("-----Actor list-----" + "\n" + "Surname  |  Name  |  Height");
        for(Actor actor : listOfActors) {
            res += actor.toString() + "\n";
        }
        return res;
    }

    public void addActorObject(Actor newActor) {
        for (Actor actor : listOfActors) {
            if(actor.equals(newActor)) {
                System.out.println("----------------------");
                System.out.println("The actor is already on the list" + "\n");
                return;
            }
        }
        this.listOfActors.add(newActor);
        System.out.println();
    }

    public Actor addActor(String name, String surName, Gender gender, double height) {
        Actor newActor = new Actor(name, surName,gender,height);
        for (Actor actor : listOfActors) {
            if(actor.equals(newActor)) {
                System.out.println("----------------------");
                System.out.println("The actor is already on the list" + "\n");
                return null;
            }
        }
        this.listOfActors.add(newActor);
        System.out.println();
        return newActor;
    }

    public void exchangeActorObject(String oldSurNameActor, String oldNameActor, Actor newActor) {
        if (newActor == null) {
            System.out.println("There is no such actor");
            return;
        }

        String nonExistentActor = "";
        for (int i = 0; i < listOfActors.size(); i++) {
            if (oldSurNameActor.equals(listOfActors.get(i).surName) && oldNameActor.equals(listOfActors.get(i).name)) {
                listOfActors.set(i, newActor);
                System.out.println("✅ Actor (" + listOfActors.get(i).toString() + ") has been replaced " + newActor.toString());
                return;
            }
        }
        System.out.println("❌ No replacement actor " + oldSurNameActor + " " + oldNameActor + " has been found" + "\n");
    }

    /*
    public void exchangeActorObject(Actor oldActor, Actor newActor) {
        if (oldActor == null || newActor == null) {
            System.out.println("There is no such actor");
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).equals(oldActor)) {
                listOfActors.set(i, newActor);
                System.out.println("Actor (" + oldActor.toString() + ") has been replaced " + newActor.toString());
                return;
            }
        }
        System.out.println("No replacement actor has been found" + "\n");
    }
    */

    /*
    public void exchangeActor(String oldSurNameActor, String oldNameActor,
                              String newSurNameActor, String newNameActor, Gender gender, double height) {
        Actor newActor = new Actor(newSurNameActor, newNameActor, gender, height);
        for(int i = 0; i < listOfActors.size(); i++){
            if(oldSurNameActor.equals(listOfActors.get(i).surName) && oldNameActor.equals(listOfActors.get(i).name)) {
                listOfActors.set(i, newActor);
                System.out.println("Actor (" + oldSurNameActor + " " + oldNameActor + ") has been replaced " + newActor.toString());
                break;
            }
        }
    }
    */

}
