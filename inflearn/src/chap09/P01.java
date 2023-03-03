package chap09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 씨름 선수
 */
public class P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new ArrayList<>();

        int max = -1;
        int rst = 0;

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] xy = br.readLine().split(" ");
            int height = Integer.parseInt(xy[0]);
            int weight = Integer.parseInt(xy[1]);

            persons.add(new Person(height, weight));
        }
        Collections.sort(persons);

        for (Person person : persons) {
            int weight = person.getWeight();

            if(weight > max) {
                max = weight;
                rst++;
            }
        }
        System.out.println(rst);
    }
}

class Person implements Comparable<Person> {
    private int height;
    private int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person o) {
        return o.height - this.height;
    }
}