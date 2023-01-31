package by.teachmeskills.collections.task_12;

import java.util.List;
import java.util.Set;

public class BoxDemo {
    public static void main(String[] args) {
        Conteiner conteiner = new Conteiner();

        Set<Ball> balls = Set.of(new Ball(5), new Ball(10), new Ball(15));
        Ball ball = new Ball(20);

        conteiner.printBalls();
        conteiner.addBalls(balls);
        conteiner.printBalls();
        conteiner.printSizeOfEachBall();
        conteiner.getSumOfBallsSizes();
        conteiner.getBallsAmount();
        conteiner.checkBallIfExist(ball);
        conteiner.removeBall(ball);
        conteiner.printBalls();
        conteiner.cleanUpContainer();
        System.out.println(balls);

        Ball ballWithRandomSize = new Ball();
        conteiner.addBall(ballWithRandomSize);

        Set<Ball> ballsNew = Set.of(new Ball(11), new Ball(44), new Ball(75), new Ball(22)
                , new Ball(10), new Ball(18), new Ball(35), new Ball(68), new Ball(84));
        Box box = new Box(10);
        box.printBalls();
        box.addBalls(ballsNew);
        box.printBalls();
        List<Ball> sortedBalls = box.getSortedBalls();
        System.out.println(sortedBalls);
        box.printBalls();
    }
}

