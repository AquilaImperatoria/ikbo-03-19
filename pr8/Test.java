package ru.mirea.pr8;

public class Test {

    public static void main(String[] args) {
        WaitList<Integer> list = new WaitList<>();
        System.out.println("isEmpty?   " + list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println("isEmpty?   " + list.isEmpty());
        System.out.println(list);
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        System.out.println(list);
        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(5);
        System.out.println("isEmpty?   " + list2.isEmpty());
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        System.out.println("isEmpty?   " + list2.isEmpty());
        System.out.println(list2);
        list2.remove();
        list2.remove();
        list2.remove();
        System.out.println(list2);
        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();
        System.out.println("isEmpty?   " + list3.isEmpty());
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(7);
        list3.add(8);
        list3.add(9);
        System.out.println("isEmpty?   " + list3.isEmpty());
        System.out.println(list3);
        list3.remove(1);
        list3.remove(2);
        list3.remove(3);
        System.out.println(list3);
    }
}
