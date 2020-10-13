package ru.mirea.pr7;

import java.util.*;

public class DoubleListDrunkard {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] inFirst, inSecond;
        System.out.println("Введите 5 карт разного номинала для игрока 1:");
        inFirst = scan.nextLine().split(" ");
        System.out.println("Введите 5 карт разного номинала для игрока 2:");
        inSecond = scan.nextLine().split(" ");
        ArrayList<Integer> handFirst = scanToArrayList(inFirst);
        ArrayList<Integer> handSecond = scanToArrayList(inSecond);
        play (handFirst, handSecond);
    }
    public static void play(ArrayList<Integer> handFirst, ArrayList<Integer> handSecond)
    {
        int counter = 0;
        int winner = 0;
        int curFirst, curSecond;
        if (handFirst.equals(handSecond)) counter = 107;
        while ((counter < 107)&&(winner == 0))
        {
            curFirst = handFirst.get(0);
            curSecond = handSecond.get(0);
            handFirst.remove(0);
            handSecond.remove(0);
            if ((curFirst == 0)&&(curSecond == 9))
            {
                handFirst.add(curFirst);
                handFirst.add(curSecond);
            }
            else if ((curFirst == 9)&&(curSecond == 0))
            {
                handSecond.add(curSecond);
                handSecond.add(curFirst);
            }
            else if (curFirst < curSecond)
            {
                handSecond.add(curSecond);
                handSecond.add(curFirst);
            }
            else if (curFirst > curSecond)
            {
                handFirst.add(curFirst);
                handFirst.add(curSecond);
            }
            counter++;
            if (handFirst.isEmpty()) winner = 2;
            else if (handSecond.isEmpty()) winner = 1;
        }
        if (counter == 107) System.out.println ("botva");
        else if (winner == 1) System.out.println ("first " + counter);
        else if (winner == 2) System.out.println ("second " + counter);
    }
    public static ArrayList<Integer> scanToArrayList(String[] scan) {
        ArrayList<Integer> handR = new ArrayList();
        for (String s : scan)
            handR.add(Integer.parseInt(s));
        return handR;
    }
}
