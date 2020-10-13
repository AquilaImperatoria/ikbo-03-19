package ru.mirea.pr7;

import java.util.*;

public class DequeueDrunkard {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] inFirst, inSecond;
        System.out.println("Введите 5 карт разного номинала для игрока 1:");
        inFirst = scan.nextLine().split(" ");
        System.out.println("Введите 5 карт разного номинала для игрока 2:");
        inSecond = scan.nextLine().split(" ");
        Deque<Integer> handFirst = scanToQueue(inFirst);
        Deque<Integer> handSecond = scanToQueue(inSecond);
        play (handFirst, handSecond);
    }
    public static void play(Deque<Integer> handFirst, Deque<Integer> handSecond)
    {
        int counter = 0;
        int winner = 0;
        int curFirst, curSecond;
        if (handFirst.equals(handSecond)) counter = 107;
        while ((counter < 107)&&(winner == 0))
        {
            curFirst = handFirst.poll();
            curSecond = handSecond.poll();
            if ((curFirst == 0)&&(curSecond == 9))
            {
                handFirst.offer(curFirst);
                handFirst.offer(curSecond);
            }
            else if ((curFirst == 9)&&(curSecond == 0))
            {
                handSecond.offer(curSecond);
                handSecond.offer(curFirst);
            }
            else if (curFirst < curSecond)
            {
                handSecond.offer(curSecond);
                handSecond.offer(curFirst);
            }
            else if (curFirst > curSecond)
            {
                handFirst.offer(curFirst);
                handFirst.offer(curSecond);
            }
            counter++;
            if (handFirst.isEmpty()) winner = 2;
            else if (handSecond.isEmpty()) winner = 1;
        }
        if (counter == 107) System.out.println ("botva");
        else if (winner == 1) System.out.println ("first " + counter);
        else if (winner == 2) System.out.println ("second " + counter);
    }
    public static Deque<Integer> scanToQueue(String[] scan) {
        Deque<Integer> handR = new LinkedList();
        for (String s : scan)
            handR.add(Integer.parseInt(s));
        return handR;
    }
}
