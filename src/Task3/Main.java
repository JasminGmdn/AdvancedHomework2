package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayDeque<String> states = new ArrayDeque<>();
        BufferedReader stat = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 4; i++) {
            System.out.println("Add place of living of the " + i + " family: ");
            String s = stat.readLine();

            states.add(s);
        }


        ArrayList<String> families = new ArrayList<>();
        BufferedReader fam = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 4; i++) {
            System.out.println("Add name of the " + i + " family: ");
            String n = fam.readLine();

            families.add(n);
        }


        Scanner in = new Scanner(System.in);
        System.out.println("Write the city of living: ");
        String c = in.next();
        if(Objects.equals(c, states.getFirst())){
            System.out.println(families.get(0));
        } else if (Objects.equals(c, states.getLast())) {
            System.out.println(families.get(2));
        } else {
            System.out.println(families.get(1));
        }

    }
}




