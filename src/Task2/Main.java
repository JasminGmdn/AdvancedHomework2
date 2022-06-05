package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static LinkedList<Integer> getIntegerList(List<Integer> list){
        System.out.println("List size = " + list.size());
        System.out.println("List: ");
        return (LinkedList<Integer>) list;
    }

    public static LinkedList<Integer> getMinimum(List<Integer> list){
        int min = list.get(0);
         for (int i = 0; i < list.size(); i++){
             if(min > list.get(i)) {
                 min = list.get(i);
                 System.out.println("Minimum is " + min);
             }
         }
        System.out.println("List: ");
        return (LinkedList<Integer>) list;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> list = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 4; i++) {
            System.out.println("Add number " + i + ": ");
            String N = reader.readLine();

            list.add(Integer.valueOf(N));
        }

        LinkedList<Integer> result = getIntegerList(list);
        for (Integer entry : result){
            System.out.println(entry);
        }

        LinkedList<Integer> result1 = getMinimum(list);
        for (Integer min : result1){
            System.out.println(min);
        }
    }
}
