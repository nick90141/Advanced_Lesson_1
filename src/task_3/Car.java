package task_3;

public class Car implements Comparable <Car> {
    //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Car o) {    // public int compareTo(Car o) {

        // int temp = this.speed - o.speed;
        if (this.speed != o.speed) {
            return this.speed - o.speed;
        } if (this.price != o.price) {
            return this.price - o.price;
        } if (!this.model.equals(o.model)) {
            return this.model.compareTo(o.model);
        } else {
            return this.color.compareTo(o.color);
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}