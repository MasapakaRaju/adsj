package experimenal;

import java.util.*;

public class serveStudents {
    public static void main(String[] args) {
        PriorityQueue<Student> stds = new PriorityQueue<>();
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int totalEvents = sc.nextInt();

        for (int i = 0; i <= totalEvents; i++) {
            String event = sc.nextLine();
            if (event.length() < 7 && event.equals("SERVED")) {
                Student ss = compareStds(students);
                stds.add(ss);
                students.remove(ss);
            } else if (event.equals("ENTER")) {
                String[] events = event.split(" ");
                students.add(new Student(Integer.parseInt(events[3]), events[1], Double.parseDouble(events[2])));
            } else
                continue;
        }
        while (students.size() != 0) {
            int size = students.size();
            System.out.println(students.get(size - 1).getName());
            students.remove(size - 1);
        }
    }

    private static Student compareStds(List<Student> stds) {
        int size = stds.size();
        Student max = stds.get(size-1);
        size=size-1;
        while (size >= 0) {
            Student next = stds.get(size);
            max = compare(max, next);
        }
        return max;
    }

    private static Student compare(Student s1, Student s2) {
        if (s1.getCGPA() < s2.getCGPA())
            return s2;
        else if (s1.getCGPA() > s2.getCGPA())
            return s1;
        else if (s1.getCGPA() == s2.getCGPA()) {
            if (s1.getName().compareTo(s2.getName()) > 0)
                return s1;
            else if (s1.getName().compareTo(s2.getName()) < 0)
                return s2;
            else {
                return s1.getId() > s2.getId() ? s1 : s2;
            }
        }
        return null;
    }
}
