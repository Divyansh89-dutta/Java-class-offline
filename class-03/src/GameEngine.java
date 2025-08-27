/*
   Java Naming Conventions & Identifiers

   Rules for Identifiers (names for classes, variables, methods, etc.)
   1. Must start with a letter (A–Z, a–z), _ (underscore), or $ (dollar)
   2. Cannot start with a number
   3. Can contain letters, digits, _ and $
   4. Cannot contain spaces
   5. Cannot be a reserved keyword (like int, class, static, etc.)
   6. Java is CASE SENSITIVE → 'Game', 'game', and 'GAME' are different
*/

/*
   Naming Conventions
   - Class & Interface names → PascalCase (e.g., StudentDetails, GameEngine)
   - Variable & Method names → camelCase (e.g., studentName, calculateScore)
*/

/*
   Types of Brackets
   ( ) → Parentheses → Used in methods
   { } → Curly Braces → Used for scope/body
   [ ] → Square Brackets → Used for arrays
   < > → Angular Brackets → Used for generics
*/

public class GameEngine {  // Class name → PascalCase

    // Variable → camelCase
    private String playerName;

    // Constructor → same name as class (PascalCase)
    public GameEngine(String playerName) {
        this.playerName = playerName;
    }

    // Method → camelCase
    public void startGame() {
        // Curly braces { } define the body/scope of the method
        System.out.println("🎮 Game started for " + playerName);

        // [ ] Square brackets → Arrays
        int[] scores = {10, 20, 30};

        // ( ) Parentheses → Used when calling methods
        for (int score : scores) {
            System.out.println("Score: " + score);
        }

        // < > Angular Brackets → Generics (like ArrayList<String>)
        java.util.List<String> levels = new java.util.ArrayList<>();
        levels.add("Level 1");
        levels.add("Level 2");

        System.out.println("Available Levels: " + levels);
    }

    // main() → program starts here
    public static void main(String[] args) {
        // Object name → camelCase
        GameEngine game = new GameEngine("Shery"); // Creating object
        game.startGame(); // Calling method using ( )
    }
}
