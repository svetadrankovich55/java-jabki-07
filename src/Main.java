import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**
         * Классы AnimalClasswork & Dog
         * Наследование (extends)
         * Наследование — это механизм, при котором один класс может унаследовать свойства и методы другого класса.
         */
        Dog dog = new Dog();
        AnimalClasswork animal = new AnimalClasswork();

        /**
         * Классы AnimalClasswork & Dog
         * Переопределение методов (@Override)
         * Переопределение — это написание своей версии метода, который уже есть в суперклассе.
         */
        dog.speak();
        animal.speak();

        /**
         * Классы VehicleClasswork & Car
         * Ключевое слово super
         * Используется, чтобы:
         * - Вызвать конструктор суперкласса
         * - Вызвать метод родителя
         */
        Car car = new Car("Лада", "Нива");
        car.startEngine();

        /**
         * - Класс Car наследует VehicleClasswork
         * - В конструкторе Car используется super(brand), чтобы вызвать конструктор VehicleClasswork
         * - Метод startEngine() переопределён, но всё ещё вызывает оригинальный метод родителя
         * через super.startEngine() — это позволяет дополнить, а не заменить поведение
         */

        /**
         * Классы Shape & Circle & Rectangle
         * Полиморфизм (от греч. «много форм») — это способность одного "интерфейса" работать с объектами разных типов.
         *
         * Полиморфизм обычно проявляется через:
         * - наследование (extends)
         * - переопределение методов (@Override)
         * - использование ссылок суперкласса для объектов подклассов (super)
         */
        Shape[] shapes = {new Circle(), new Rectangle(), new Shape()};
        for (Shape s : shapes) {
            s.draw();
        }

        /**
         * Что даёт полиморфизм?
         * Гибкость: можно обрабатывать объекты по общему интерфейсу
         * Расширяемость: добавление новых подклассов — без изменения старого кода
         * Упрощение кода: меньше условий, меньше зависимостей
         *
         * Примеры из жизни:
         * - Мы используем клавиатуру, мышь, сканер для ввода информации (один метод read(..)), но везде своя реализация
         * - В комании работают разные люди и все получают зарплату, но реализация может отличаться (в продажах сделка, у разработчиков фикс)
         */
        // 1. Банковские счета
        System.out.println("\n 1. Банковские счета \n");

        Account[] accounts = {new SavingsAccount("SAV001", 2000, 3.5), new CreditAccount("CRD001", 500, 1000)};
        for (Account a : accounts) {
            a.displayInfo();
            System.out.println();
        }

        for (Account a : accounts) {
            a.withdraw(550);
            a.displayInfo();
            System.out.println();
        }

        // 2. Система доставки
        System.out.println("\n 2. Система доставки \n");
        Vehicle truck = new Truck(90, 1000);
        Vehicle drone = new Drone(100, 1);

        DeliverySystem.startDelivery(truck, "Москва");
        DeliverySystem.startDelivery(drone, "Санкт-Петербург");

        // 3. Зоопарк
        System.out.println("\n 3. Зоопарк \n");

        List<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Лёва", 1));
        animals.add(new Parrot("Кеша", 5));
        animals.add(new Lion("Симба", 5));
        animals.add(new Lion("Муфаса", 8));
        animals.add(new Parrot("Гоша", 1));

        for (Animal a : animals) {
            a.makeSound();
        }

        // 4. Игровые персонажи
        System.out.println("\n 4. Игровые персонажи \n");
        Warrior warrior = new Warrior("Наруто", 100);
        Mage mage = new Mage("Саске", 100);
        System.out.println("Саске, вернись в Коноху");
        warrior.attack();
        mage.takeDamage(50);
        mage.heal(20);
        mage.attack();
        warrior.takeDamage(50);
        mage.attack();
        warrior.block();
        warrior.takeDamage(50);
        mage.attack();
        warrior.takeDamage(15);
        warrior.attack();
        mage.takeDamage(50);
        warrior.attack();
        mage.takeDamage(15);
        System.out.printf("\nНаруто терапия сработала и Саске признал поражение! Бой окончен. Победил: %s", warrior.getName());
    }
}