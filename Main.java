public class Main {
    public static void main(String[] args) {
        AssignmentOne assignmentOne = new AssignmentOne("file1.txt");

        System.out.println("Perimeter: " + assignmentOne.shape.calculatePerimeter());
        System.out.println("The longest side: "+ assignmentOne.shape.findLongestSide());
        System.out.println("The average length: " + assignmentOne.shape.returnAverageLength());
    }
}
