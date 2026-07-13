import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;

    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void showListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Ошибка: актёр " + actor.toString() + " уже есть в спектакле '" + title + "'.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor.toString() + " успешно добавлен в спектакль '" + title + "'!");
        }
    }

    public void replaceActor(String oldActorSurname, Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Ошибка: актёр " + newActor.toString() + " уже есть в спектакле '" + title + "'.");
            return;
        }

        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(oldActorSurname)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Ошибка: актёр " + oldActorSurname + " отсутствует в спектакле '" + title + "'.");
            return;
        }
        listOfActors.set(index, newActor);
        System.out.println("Актёр " + oldActorSurname + " в спектакле '" + title + "' заменен на актёра "
                + newActor.toString() + ".");
    }

    public String getTitle() {
        return title;
    }

    public void showInfo() {
        System.out.println();
        System.out.println("------ «" + title + "» ------");
        System.out.println("Список актёров:");
        this.showListOfActors();
    }
}
