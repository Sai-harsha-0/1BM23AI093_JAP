import java.util.Scanner;

class student {
    int marks;
}
public class studrecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;

        student obj[] = new student[n];
        for (int i = 0; i <n; i++) {
            obj[i] = new student();
            System.out.println("enter Student "+ i+1+" marks:");
            obj[i].marks = scanner.nextInt();
            System.out.println("Student  marks are: "+ obj[i].marks);
        }
    }
}
/*
enter Student 01 marks:
50
Student  marks are: 50
enter Student 11 marks:
80
Student  marks are: 80
enter Student 21 marks:
60
Student  marks are: 60
enter Student 31 marks:
30
Student  marks are: 30
enter Student 41 marks:
20
Student  marks are: 20

Process finished with exit code 0
 */