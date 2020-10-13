package ru.mirea.pr7;

import java.util.Scanner;
import java.util.Stack;

public class StackDrunkard {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] inFirst, inSecond;
        System.out.println("Введите 5 карт разного номинала для игрока 1:");
        inFirst = scan.nextLine().split(" ");
        System.out.println("Введите 5 карт разного номинала для игрока 2:");
        inSecond = scan.nextLine().split(" ");
        Stack<Integer> handFirst = scanToStack(inFirst);
        Stack<Integer> handSecond = scanToStack(inSecond);
        play (handFirst, handSecond);
    }
    public static void play(Stack<Integer> handFirst, Stack<Integer> handSecond)
    {
        int counter = 0;
        int winner = 0;
        int curFirst, curSecond;
        if (handFirst.equals(handSecond)) counter = 107;
        while ((counter < 107)&&(winner == 0))
        {
            curFirst = handFirst.pop();
            curSecond = handSecond.pop();
            if ((curFirst == 0)&&(curSecond == 9))
            {
                handFirst.push(curFirst);
                handFirst.push(curSecond);
            }
            else if ((curFirst == 9)&&(curSecond == 0))
            {
                handSecond.push(curSecond);
                handSecond.push(curFirst);
            }
            else if (curFirst < curSecond)
            {
                handSecond.push(curSecond);
                handSecond.push(curFirst);
            }
            else if (curFirst > curSecond)
            {
                handFirst.push(curFirst);
                handFirst.push(curSecond);
            }
            counter++;
            if (handFirst.empty()) winner = 2;
            else if (handSecond.empty()) winner = 1;
        }
        if (counter == 107) System.out.println ("botva");
        else if (winner == 1) System.out.println ("first " + counter);
        else if (winner == 2) System.out.println ("second " + counter);
    }
    public static Stack<Integer> scanToStack(String[] scan) {
        Stack<Integer> handR = new Stack<>();
        for (String s : scan)
            handR.add(Integer.parseInt(s));
        return handR;
    }
}
