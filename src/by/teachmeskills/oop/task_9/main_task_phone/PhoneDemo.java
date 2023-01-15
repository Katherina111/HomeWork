package by.teachmeskills.oop.task_9.main_task_phone;

/*
Класс Phone.
●	Создайте класс Phone, который содержит переменные number, model и
weight.
●	Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
●	Добавить в класс Phone методы:
●	receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
●	 getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
●	Добавить конструктор в класс Phone, который принимает на вход три
параметра для инициализации переменных класса - number, model и
weight.
●	Добавить конструктор, который принимает на вход два параметра для
инициализации переменных класса - number, model.
●	Добавить конструктор без параметров.
●	Вызвать из конструктора с тремя параметрами конструктор с двумя.
●	Добавьте перегруженный метод receiveCall, который принимает два
параметра - имя звонящего и номер телефона звонящего. Вызвать этот
метод.
●	Создать метод sendMessage с аргументами переменной длины (Шилдт, стр. 213).
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера
этих телефонов.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone phoneFirst = new Phone("+375291111111", "Apple", 110);
        phoneFirst.receiveCall("Dasha");
        phoneFirst.getNumber();

        phoneFirst.sendMessage("+375291111111", "+375292222222", "+375293333333");
        System.out.println(phoneFirst.toString());

        Phone phoneSecond = new Phone("+375292222222", "Samsung", 120);
        phoneSecond.getNumber();
        System.out.println(phoneSecond.toString());

        Phone phoneThird = new Phone("+375293333333", "Xiaomi", 130);
        phoneThird.getNumber();
        System.out.println(phoneThird.toString());
    }
}
