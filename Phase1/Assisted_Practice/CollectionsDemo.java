package Phase1.Assisted_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class CollectionsDemo {
    /*------------------------------------- List --------------------------
     * > Insertion Order Preserved..
     * > Duplicates Value Allowed...
     * > Heterogeneous Values Allowed...
     */
    public void arrayList() {
        List<Integer> arr = new ArrayList<>();

        System.out.println("-----------      ArrayList   ------------");
        // add(value)/add(index,value)..............
        arr.add(4);
        arr.add(5);
        arr.add(7);
        arr.add(1, 3);
        System.out.println("add()... \n" + arr);

        // remove(index).........
        arr.remove(3);
        System.out.println("\nremove()...index(3) \n" + arr);

        // size......
        int size = arr.size();
        System.out.println("\nsize()... \n" + size);

        // get(index)......
        int fetch = arr.get(2);
        System.out.println("\nget()...index(2) \n" + fetch);

        // set(index,value).....
        arr.set(2, 9); // it also return which value is eleminating..
        System.out.println("\nset()...index(2) \n" + arr);

        // contains()........
        System.out.println("\ncontains()...3 \n" + arr.contains(3));

        // isEmpty()........
        System.out.println("\nisEmpty()...arr \n" + arr.isEmpty());

        // addAll()........
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.addAll(arr);
        System.out.println("\naddAll()...arr to arr1 \narr  : " + arr + "\narr1 : " + arr1);

    }

    public void linkedList() {

        System.out.println("-----------      LinkedList   ------------");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("akshay");
        ll.add("rudra");
        ll.add("ashu");
        ll.add(null); // linkedList can Store null value....

        // getFirst()...
        System.out.println("getFirst()....\n" + ll + "\n" + ll.getFirst());

        // getlast()...
        System.out.println("\ngetLast()....\n" + ll + "\n" + ll.getLast());

        // removeFirst()...
        System.out.println("\nremoveFirst()....\n" + ll + "\n" + ll.removeFirst());

        // removeLast()...
        System.out.println("\nremoveLast()....\n" + ll + "\n" + ll.removeLast());

    }

    /*-------------------------------------  Set  -------------------------
    * > Insertion Order not Preserved..
    * > Duplicates Value not Allowed...
    * > Heterogeneous Values Allowed...
    */
    public void hashSet() {

        System.out.println("-----------      HashSet   ------------");
        HashSet<Integer> hs = new HashSet<>(); // insertion order not preserved
        hs.add(5);
        hs.add(7);
        hs.add(15);
        hs.add(12);
        hs.add(5); // duplicacy not allowed..

        System.out.println("Your hashSet is : " + hs);

        // Remove(value)....
        hs.remove(7);
        System.out.println("\nremove()....8\n" + hs);

        // containsAll....
        HashSet<Integer> hss = new HashSet<>();
        hss.add(12);
        hss.add(15);
        hss.add(16);
        System.out.println("\ncontains()....12,15 in hs \n" + hs.containsAll(hss));

        // addAll.....union
        System.out.println("\naddAll()......union\nHashSet hs : " + hs + "\nHashSet hss : " + hss);
        hs.addAll(hss); // duplicate value not allowed...
        System.out.println("after union hss to hs : " + hs);

        // retainAll.......Intersection --- it preserve only common value...
        hss.retainAll(hs); // -- accept hs element which is common in hss..
        System.out.println("\nretainAll....common in both\n" + hss);// [100, 11, 12]

    }

    public void linkedHashSet() {

        System.out.println("-----------     LinkedHashSet   ------------");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); // insertion order preserved
        lhs.add(5);
        lhs.add(11);
        lhs.add(6);
        lhs.add(200);
        System.out.println("Linked HashSet :  " + lhs);

        // Iterate with foreach by object..
        System.out.println("\nprint hashset by for each loop...");
        for (Object in : lhs) {
            System.out.println(in);
        }

    }

    /*------------------------------------- Queue --------------------------
     * > Insertion Order Preserved..
     * > Duplicates Value Allowed..
     * > implement FIFO(First In First Out)
     * > Heterogeneous Values not Allowed
     */
    public void priorityQueue() {
        /*
         * ------- implement FIFO(First In First Out) ------
         * Note : - Duplicate value allowed, insertion order preserved, heterogeneous
         * value not allowed..
         */
        System.out.println("-----------     Queue   ------------");
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add(value)... // if insertion not success throw error..
        pq.add(5);
        pq.add(10);
        System.out.println("add()....\n" + pq);

        // offer(value)... // if insertion not success return null..
        pq.offer(6);
        pq.offer(7);
        System.out.println("\noffer()....\n" + pq);

        // element()...Head value.. // if queue is empty throw error...
        int head = pq.element();
        System.out.println("\nelement()....\n" + head);

        // peek()...Head value.. // if queue is empty return null..
        int hd = pq.peek();
        System.out.println("\npeek()....\n" + hd);

        // remove(value)/remove()... from head // if queue is empty throw error..
        pq.remove(6);
        System.out.println("\nremove()....\n" + pq);

        // poll(value)... from head // if queue is empty return null..
        pq.poll();
        System.out.println("\npoll()....\n" + pq);

    }

    public static void main(String[] args) {
        CollectionsDemo cd = new CollectionsDemo();
        cd.arrayList();
        cd.linkedList();
        cd.hashSet();
        cd.linkedHashSet();
        cd.priorityQueue();
    }

}
