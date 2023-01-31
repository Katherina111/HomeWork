package by.teachmeskills.collections.task_12;

import java.util.Objects;
import java.util.Random;

/*
Создайте класс «Шар».
Класс должен иметь свойство «Размер» и конструктор для установки размера при создании.
Изменять размер шара после создания нельзя.
 */
public class Ball implements Comparable<Ball> {
    private final int size;

    public Ball(int size) {
        this.size = size;
    }

    public Ball(){
        Random random = new Random();
        this.size = random.nextInt(10) + 10;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return getSize() == ball.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public int compareTo(Ball ball) {
        return 0;
    }
}
