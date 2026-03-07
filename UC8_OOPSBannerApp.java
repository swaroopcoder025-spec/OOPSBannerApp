import java.util.HashMap;
import java.util.Map;

public class UC8_OOPSBannerApp {

    // Map to store character and its ASCII pattern
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Function to load patterns into Map
    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        patternMap.put('P', new String[]{
                "*****  ",
                "*   *  ",
                "*   *  ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    // Function to render banner word
    public static void renderBanner(String word) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        loadPatterns();        // Load patterns into map
        renderBanner("OOPS");  // Display banner
    }
}