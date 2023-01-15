package by.teachmeskills.oop.task_9.main_task_phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    //getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов
    public String getNumber() {
        return number;
    }

    //	Добавить конструктор без параметров
    public Phone() {
    }

    //Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    /*Добавить конструктор в класс Phone, который принимает на вход три
    параметра для инициализации переменных класса - number, model и weight
     */
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Звонит номер " + this.number + "\nМодель телефона " + this.model + "\nВес телефона" + this.weight + "\n";
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " звонит по номеру" + number);
    }

    public void sendMessage(String... length) {
        for (String number : length)
            System.out.println(number);
    }
}

