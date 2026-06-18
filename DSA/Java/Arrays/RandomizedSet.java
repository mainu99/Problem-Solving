import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

//Link: https://leetcode.com/problems/insert-delete-getrandom-o1/description/?envType=problem-list-v2&envId=a3j9rtxd
public class RandomizedSet {

    HashMap<Integer, Integer> map;
    Random rand;
    List<Integer> list;
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        int indexToRemove = map.get(val);
        int lastElement = list.getLast();

        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);

        list.remove(list.size()-1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
