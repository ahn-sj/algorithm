package algobox.doitforjava.chap06;

import java.util.PriorityQueue;

/**
 * 우선순위 큐
 * - 일반적인 큐의 구조 (FIFO)
 * - 데이터가 들어온 순서대로 나가는 것이 아닌 우선순위에 따라 우선순위가 높은 데이터가 먼저 나간다
 * - Comparable 구현
 * - 시간 복잡도 O(NLogN)
 * - Queue 인터페이스의 하위 클래스가 아님 (다형성 X)
 * - Heap을 이용하여 구현
 * (최대 값이 우선순위인 큐 = 최대 힙, 최소 값이 우선순위인 큐 = 최소 힙)
 */
public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("학생A", 100));
        pq.add(new Student("학생A", 10));
        pq.add(new Student("학생A", 50));
        pq.add(new Student("학생A", 5));

        while (!pq.isEmpty()) {
            Student student = pq.poll();
            System.out.println("student = " + student);
        }

    }
}


class Student implements Comparable<Student> {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student student) {
        // 오름차순
        if(grade > student.getGrade()) return 1;
        if(grade < student.getGrade()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}