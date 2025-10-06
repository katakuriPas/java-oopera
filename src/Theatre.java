public class Theatre {
    public static void main(String[] args) {

        // Создаем актеров
        Actor actorPasP = new Actor("Pavel", "Pas", Gender.MALE, 177);
        Actor actorTazI = new Actor("Ivan", "Taz", Gender.MALE, 166);
        Actor actorSechkoR = new Actor("Regina", "Sechko", Gender.FEMALE, 166);
        Actor actorIvanovA = new Actor("Aleksey", "Ivanov", Gender.MALE, 178);
        Actor actorSmirnovM = new Actor("Mariya", "Smirnova", Gender.FEMALE, 165);
        Actor actorKuznetsov = new Actor("Dmitriy", "Kuznetsov", Gender.MALE, 182);

        // Создаем режиссеров
        Director directorSemchenkoS = new Director("Stanislav", "Semchenko",  Gender.MALE, 22);
        Director directorIvanovichP = new Director("Pyotr", "Ivanovich",  Gender.MALE, 44);

        Person musicAuthorGromovaM = new Person("Maria", "Gromova", Gender.FEMALE);

        Person choreographerSmirnovK = new Person("Konstantin", "Smirnov", Gender.MALE);

        // Создаем постановки
        Show classic = new Show("Dracula", 180, directorSemchenkoS);
        Opera opera = new Opera("King Stakh's Wild Hunt",
                120,
                directorSemchenkoS,
                musicAuthorGromovaM,
                "XXX",
                30);

        Ballet ballet = new Ballet("Shchelkunchik",
                220,
                directorIvanovichP,
                musicAuthorGromovaM,
                "YYY",
                choreographerSmirnovK);

        // Написал два метода для добавления актера: addActorObject(Actor actor) и addActor(Конструктор)
        // Добавляем актеров в классическую постановку
        classic.addActorObject(actorPasP);
        classic.addActorObject(actorTazI);
        classic.addActorObject(actorSechkoR);
        Actor actorGavriloA = classic.addActor("Aleksandr", "Gavrilo", Gender.MALE, 196);
        Actor actorUrbanovichM = classic.addActor("Maxim", "Urbanovich", Gender.MALE, 183);

        // Добавляем актеров в оперную постановку
        opera.addActorObject(actorIvanovA);
        opera.addActorObject(actorSmirnovM);
        opera.addActorObject(actorKuznetsov);
        Actor actorMorozovaO = opera.addActor("Olga", "Morozova", Gender.FEMALE, 168);
        Actor actorLebedevaY = opera.addActor("Yekaterina", "Lebedeva", Gender.FEMALE, 163);

        // Добавляем актеров на балет
        ballet.addActorObject(actorPasP);
        ballet.addActorObject(actorSmirnovM);
        Actor actorVolkovD = ballet.addActor("Dmitriy", "Volkov", Gender.MALE, 183);
        Actor actorMorozovA = ballet.addActor("Anastasiya", "Morozova", Gender.FEMALE, 170);

        // Вывод актеров
        System.out.println("---> Classic");
        System.out.println(classic.toString());

        System.out.println("---> Opera");
        System.out.println(opera.toString());

        System.out.println("---> Ballet");
        System.out.println(ballet.toString());

        // Замена существующим актером из другой постановки
        ballet.exchangeActorObject("Pas", "Pavel", actorIvanovA);
        System.out.println(ballet.toString());

        // Замена несуществующего актера
        ballet.exchangeActorObject("Lebedeva", "Yekaterina", actorIvanovA);
        System.out.println(ballet.toString());
    }
}


