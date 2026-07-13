public class Theatre {

    public static void main(String[] args) {
        Actor firstActor = new Actor("Фёдор", "Филиппов", Gender.MALE, 179);
        Actor secondActor = new Actor("Оксана", "Васильева", Gender.FEMALE, 170);
        Actor thirdActor = new Actor("Милана", "Каверина", Gender.FEMALE, 167);
        Director firstDirector = new Director("Валентин", "Степашин", Gender.MALE, 34);
        Director secondDirector = new Director("Пётр", "Ёлкин-Палкин", Gender.MALE, 17);
        Person musicAuthor = new Person("Ольга", "Кораблёва", Gender.FEMALE);
        Person choreographer = new Person("Михаил", "Алексеев", Gender.MALE);

        Opera opera = new Opera(
                "Сказка о браузере",
                92,
                firstDirector,
                musicAuthor,
                "Когда злой дракон Поп-ап похитил невинную принцессу Куку, отважный Хром запел " +
                        "трагическую арию, ибо две сотни открытых вкладок сожрали всю Оперативную Память " +
                        "и обрушили на него Синий Экран Смерти.",
                18
        );
        opera.addActor(firstActor);
        opera.addActor(thirdActor);

        Ballet ballet = new Ballet(
                "С корабля на Бал... ет?",
                76,
                secondDirector,
                musicAuthor,
                "Матрос путает абордаж с па-де-де и грациозно тонет в оркестровой яме.",
                choreographer
        );
        ballet.addActor(secondActor);
        ballet.addActor(thirdActor);

        Show show = new Show(
                "Утиный пруд",
                45,
                secondDirector
        );
        show.addActor(firstActor);
        show.addActor(secondActor);
        show.addActor(thirdActor);

        opera.showInfo();
        ballet.showInfo();
        show.showInfo();

        System.out.println();
        ballet.replaceActor("Каверина", firstActor);
        ballet.showInfo();
        System.out.println();
        opera.replaceActor("Иванов", secondActor);
    }
}
