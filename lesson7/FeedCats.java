package lesson7;

public class FeedCats {
    public static void main(String[] args) {
        int time = 0;
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Петрушка", 150, 3);
        cat[1] = new Cat("Черныш", 100, 5);
        cat[2] = new Cat("Кузя", 90, 4);
        cat[3] = new Cat("Пират",120,4);
        Plate plate = new Plate(800);

        System.out.println("У нас  живут четыре котика: " + cat[0].getName() + ", " + cat[1].getName()+ ", и " + cat[2].getName()
                + ", и " + cat[3].getName()  + ",которые хотят есть каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime()+ ", и " + cat[2].getSatietyTime() + ", и " + cat[3].getSatietyTime()
                + " час(а/ов) соответственно.");
        System.out.println("Утром в миску мы насыпали  " + plate.getFood() + " гр. вкуснейшего мясного кошачьего корма.");
        do {
            for (Cat i : cat) {
                //Кот голоден
                if (i.getSatiety() == 0) {

                    //добавляем корм, когда не хватает
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    //Кормим кота
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() +
                            " гр. корма ,следующая кормежка у него через " + (i.getSatiety()) + " часа(ов)");
                }
                //уменьшение показателя сытости
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("С момента начала кормежки прошел(ло) " + time + " час(а). В миске осталось " + plate.getFood() + " гр. корма.");
                time++;
                if (time>12){
                System.out.println("Никого нет дома, мы пошли в магазин за кормом!");

            }
            // Подкрепление в течении 12 часов
        } while (time <= 12);

    }
}

