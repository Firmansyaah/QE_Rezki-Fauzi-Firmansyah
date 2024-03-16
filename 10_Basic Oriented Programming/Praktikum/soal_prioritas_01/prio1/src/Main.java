//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course courOne = new Course(
                "data science",
                "learn about data science",
                "john doe",
                "all level",
                150000
        );

        Course courTwo = new Course(
                "algorithm",
                "master the basic of algorithm",
                "enki",
                "beginner",
                75000

        );Course courThree = new Course(
                "docker",
                "learn about docker from ero to master",
                "ray krienger",
                "all level",
                125000
        );

        courOne.accelerate();
        courOne.getInfo();
        courTwo.getInfo();
        courThree.getInfo();
    }
}