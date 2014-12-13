import java.util.Arrays;

public class GradeBookTester
{
    public static void main(String[] args) 
    {
        GradeBook book = new GradeBook();
        System.out.println(book.getStudents());
        System.out.println(book.getTopics());
        System.out.println(book.getScores());
        System.out.println(book.totalForStudent(0));
        System.out.println("Expected: 37.0");
        System.out.println(book.totalForStudent(21));
        System.out.println("Expected: 32.0");
        System.out.println(book.totalForStudent(-10));
        System.out.println("Expected: -1.0");
        
        // Test that all the student totals are calculated correctly. 
        System.out.print("Actual:   ");
        double[] studentTotals = book.totalsForAllStudents();
        for (int i = 0; i < studentTotals.length; i++)
        {
            System.out.print(studentTotals[i] + " ");
        }
        System.out.println();
        System.out.println("Expected: 37.0 40.0 29.0 27.0 43.0 32.0 35.0 29.0 35.0 38.0 34.0 26.0 32.0 32.0 28.0 29.0 25.0 36.0 43.0 42.0 39.0 32.0");
        
        // Test that all the topic totals are calculated correctly.
        System.out.print("Actual:   ");
        double[] topicTotals = book.totalsForAllTopics();
        for (int i = 0; i < topicTotals.length; i++)
        {
            System.out.print(topicTotals[i] + " ");
        }
        System.out.println();
        System.out.println("Expected: 158.0 144.0 166.0 121.0 154.0");
        System.out.println("Teacher comment: ");
        System.out.println(book.getTeacherComment(0));
    }
}
