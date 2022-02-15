public class Main {
  public static void main(String[] args) {
    String greeting = "Hi Guise,";
    System.out.println(greeting);
    // Pluralize
    int dogCount = 1;
    int catCount = 2;
    int turtleCount = 0;

    String plural1 = pluralize("dog", dogCount);
    System.out.println("I own " + dogCount + " " + plural1);
    String plural2 = pluralize("cat", catCount);
    System.out.println("I own " + catCount + " " + plural2);
    String plural3 = pluralize("turtle", turtleCount);
    System.out.println("I own " + turtleCount + " " + plural3);

   
  }
  public static String pluralize(String animal, int count) {
    if (count > 1) {
      animal = animal + "s";
    }
    if (count < 1) {
      animal = animal + "s";
    }
    return animal;
  }
}
