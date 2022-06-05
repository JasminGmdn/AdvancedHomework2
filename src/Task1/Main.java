package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader words = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 6; i++) {
            System.out.println("Add " + i + " word: ");
            String s = words.readLine();

            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);
        for (String entry : result) {
            System.out.println(entry);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list){
       int i = 0;
        for (String value : list){
            list.set(i, value + ", " + value);
            i++;
        }
        return list;
    }
}
