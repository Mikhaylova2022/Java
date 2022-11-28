package lesson5;

public class Main{
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Букля Виктор Павлович","Директор","buklya@mail.ru","894532214",100000,47);
        persArray[1] = new Employee("Вираж Ирина Васильевна","Главный бухгалтер","virag@mail.ru","894532215",70000,38);
        persArray[2] = new Employee("Вахненко Влад Семенович","Технолог- кондитер","vahnenko@mail.ru","894532216",50000,39);
        persArray[3] = new Employee("Кекс Нина Григорьевна", "Повар-кондитер","keks@mail.ru","894532217",40000,27);
        persArray[4] = new Employee("Брикет Геннадий Петрович","Водитель", "briket@mail.ru","894532218", 35000,42);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].printInfo();
            }
        }
    }