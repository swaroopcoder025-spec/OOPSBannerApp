import java.util.*;

public class UC7_OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        List<CharacterPatternMap> characters = new ArrayList<>();

        // O pattern
        characters.add(new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        }));

        // O pattern again
        characters.add(new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        }));

        // P pattern
        characters.add(new CharacterPatternMap('P', new String[]{
                "*****  ",
                "*   *  ",
                "*   *  ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        }));

        // S pattern
        characters.add(new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        // Print banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : characters) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}