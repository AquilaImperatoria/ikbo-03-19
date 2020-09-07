package ru.mirea.pr2.Ball;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball(4.0, 4.0);
        System.out.println(ball);
        ball.setXY(1.1, 2.2);
        System.out.println(ball);
        ball.move(3.3, -3.3);
        System.out.println(ball);
    }
}