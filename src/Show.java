import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    public Director director;

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
            return "Actor list if empty";
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
                System.out.println("Takoy akter uzhe yest'" + "\n");
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
                System.out.println("Takoy akter uzhe yest'" + "\n");
                return null;
            }
        }
        this.listOfActors.add(newActor);
        System.out.println();
        return newActor;
    }

    public void exchangeActorObject(Actor oldActor, Actor newActor) {
        if (oldActor == null || newActor == null) {
            System.out.println("Такого актера нет");
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).equals(oldActor)) {
                listOfActors.set(i, newActor);
                System.out.println("Akter (" + oldActor.toString() + ") byl zamenen na " + newActor.toString());
                return;
            }
        }
        System.out.println("Akter dlya zameny ne naiden" + "\n");
    }


    public void exchangeActor(String oldSurNameActor, String oldNameActor,
                              String newSurNameActor, String newNameActor, Gender gender, double height) {
        Actor newActor = new Actor(newSurNameActor, newNameActor, gender, height);
        for(int i = 0; i < listOfActors.size(); i++){
            if(oldSurNameActor.equals(listOfActors.get(i).surName) && oldNameActor.equals(listOfActors.get(i).name)) {
                listOfActors.set(i, newActor);
                System.out.println("Akter (" + oldSurNameActor + " " + oldNameActor + ") byl zamenen na " + newActor.toString());
                break;
            }
        }
    }

}
