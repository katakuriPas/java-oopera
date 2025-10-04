public class Director extends Person{

    public int numberOfShow;

    public Director(String name, String surName, Gender gender, int numberOfShow) {
        super(name, surName, gender);
        this.numberOfShow = numberOfShow;
    }

    @Override
    public String toString(){
        return  surName + " " + name + " " + gender;
    }
}
