import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter the total number of students: ");
        int totalStudents = inputLine.nextInt();
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Enter the score for student" + i);
            int score = inputLine.nextInt();
            scores.add(score);
        }

        // Get the best score
        int bestScore = scores.stream().max(Integer::compareTo).get();

        // Assign grades based on the scheme
        List<String> grades = scores.stream()
                .map(score -> {
                    if (score >= bestScore - 10)
                        return "A";
                    else if (score >= bestScore - 20)
                        return "B";
                    else if (score >= bestScore - 30)
                        return "C";
                    else if (score >= bestScore - 40)
                        return "D";
                    else
                        return "F";
                })
                .toList();
        int gradesA = (int) grades.stream().filter(s -> s.equals("A")).count();
        int gradesB = (int) grades.stream().filter(s -> s.equals("B")).count();
        int gradesC = (int) grades.stream().filter(s -> s.equals("C")).count();
        int gradesD = (int) grades.stream().filter(s -> s.equals("D")).count();
        int gradesF = (int) grades.stream().filter(s -> s.equals("F")).count();

        // Display the grades
        System.out.println("Grades:" + grades);
        System.out.println("Amount of A:" + gradesA);
        System.out.println("Amount of B:" + gradesB);
        System.out.println("Amount of C:" + gradesC);
        System.out.println("Amount of D:" + gradesD);
        System.out.println("Amount of F:" + gradesF);

    }
}
