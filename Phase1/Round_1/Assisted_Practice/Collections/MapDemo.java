

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    /*------------------------------------- Map --------------------------
     * ---- Method ---
     * > keySet > values > entrySet > all Collection Method
     * 
     */
    public void hashMap() {
        /*
         * > Insertion Order not Preserved..
         * > Value store in key,value pair..
         * > Value can be null - but only 1 null value in key & ..
         * > non-synchronised > fast Performance > initial Capacity 16
         */
        System.out.println("-----------      HashMap   ------------");
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Akshay");
        hm.put(2, "Rudra");
        hm.put(3, "Raja");
        hm.put(null, "--");
        System.out.println("HashMap...\n" + hm);

        // get(key)..... > if not found return null..
        System.out.println("\nget(key)...return Value \n" + hm.get(1));

        // remove(key).....> also return deleted value..
        hm.remove(3);
        System.out.println("\nremove(key)...3 \n" + hm);

        // containsKey(key)....
        System.out.println("\ncontainsKey(key)...1 \n" + hm.containsKey(1));

        // containsValue(key).....
        System.out.println("\ncontainsValue(value)...Raj \n" + hm.containsValue("Raj"));

        // keySet().....
        System.out.println("\nkeySet()...return keys \n" + hm.keySet());

        // values().....
        System.out.println("\nvalues()...return Values \n" + hm.values());

        // entrySet()....
        System.out.println("\nentryset()....");
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void hashTable() {
        /*
         * > Insertion Order not Preserved..
         * > Value store in key,value pair..
         * > Value can't be null...
         * > synchronised > Thread Safe  >  Poor performance than hashMap > initial Capacity 11...
         */
        System.out.println("-----------      HashTable   ------------");
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "aksh");
        ht.put(1, "Ak");
        ht.put(1, "Raja");
        ht.put(1, "Ishu");

        System.out.println("\nentryset()....");
        for (Map.Entry entry : ht.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void treeMap() {
        System.out.println("-----------      TreeMap   ------------");
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(101, "aryan");
        tm.put(102, "Ren");
        tm.put(103, "Raj");
        tm.put(104, "Inzer");

        System.out.println("\nentryset()....");
        for (Map.Entry entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        MapDemo md = new MapDemo();
        md.hashMap();
        // md.hashTable();
        // md.treeMap();
    }

}
