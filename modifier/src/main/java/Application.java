public class Application {

  public static void main(String[] args) {
    Student Mary = new Student("Mary", 80);
    Student Cindy = new Student("Cindy", 95);

    Teacher Solider = new Teacher("Solider", Mary);
    Teacher Bob = new Teacher("Bob", Cindy);

    Solider.addScore(5);
    Bob.addScore(5);

    System.out.println("- Solider's Student Info -");
    System.out.println("name: " + Solider.getMember().getName()
        + "\nscore: " + Solider.getMember().getScore() + "\n");

    System.out.println("- Bob's Student Info -");
    System.out.println("name: " + Bob.getMember().getName()
        + "\nscore: " + Bob.getMember().getScore());

  }
}
