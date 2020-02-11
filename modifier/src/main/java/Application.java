public class Application {

  public static void main(String[] args) {
    Student Mary = new Student("Mary", 80);
    Student Cindy = new Student("Cindy", 95);

    Teacher Solider = new Teacher("Solider", Mary);
    Teacher Bob = new Teacher("Bob", Cindy);

    Solider.addFiveScore();
    Bob.addFiveScore();

  }
}
