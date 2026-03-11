public class OopsBanner{
  public static void main(String args[]){
    // Uc1:
    System.out.println("OOPS");
        // uc2:
        System.out.println("   ***       ***     ******    *****  ");
        System.out.println(" **   **   **   **   **   **  **    * ");
        System.out.println(" *     *   *     *   **   **  **      ");
        System.out.println(" *     *   *     *   ******    ***    ");
        System.out.println(" *     *   *     *   **           **  ");
        System.out.println(" **   **   **   **   **      *    **  ");
        System.out.println("   ***       ***     **       *****   ");

         // uc3:
        System.out.println("   ***       *****  ");
        System.out.println(" **   **    **    * ");
        System.out.println(" *     *    **      ");
        System.out.println(" *     *     ***    ");
        System.out.println(" *     *        **  ");
        System.out.println(" **   **   *    **  ");
        System.out.println("   ***      *****   ");

//uc4:
           String[] lines = new String[7]; 
        
        lines[0]=String.join(" ","   ***       *****  ");
        lines[1]=String.join(" "," **   **    **    * ");
        lines[2]=String.join(" "," *     *    **      ");
        lines[3]=String.join(" "," *     *     ***    ");
        lines[4]=String.join(" "," *     *        **  ");
        lines[5]=String.join(" "," **   **   *    **  ");
        lines[6]=String.join(" ","   ***      *****   ");
       
    for (String line : lines) {
        System.out.println(line);
    }
//uc5:
    String[] lines = {
        String.join(" ","   ***       *****  "),
        String.join(" "," **   **    **    * "),
        String.join(" "," *     *    **      "),
        String.join(" "," *     *     ***    "),
        String.join(" "," *     *        **  "),
        String.join(" "," **   **   *    **  "),
        String.join(" ","   ***      *****   ")
    };
        for (String line : lines) {
            System.out.println(line);
        }
  }
  public static String[] getPpattern(){
        return new String[]{
        "   ***   ",
        " **   ** ",     
        " *     * ",
        " *     * ",
        " *     * ",
        " **   ** ",
        "   ***   "
    };

   }
   public static String[] getPpattern(){
    return new String[]{
        " *****  ",
        " **   * ",
        " **   * ",
        " ***    ",
        " **     ",
        " **     ",
        " **     "
    };

   }
   public static String[] getSpattern(){
    return new String[]{
        "  *****  ",
        " **   ** ",
        " **      ",
        "  *****   ",
        "      **  ",
        " **   **  ",
        "  *****   "
    };

   }
    public static void main(String[] args) {
        String[] lines = new String[7];

        String[] opattern=getOpattern();
        String[] ppattern=getPpattern();
        String[] spattern=getSpattern();


        for (int i = 0; i < lines.length; i++) {
            lines[i] = opattern[i] + " " + ppattern[i] + " " + ppattern[i] + " " + spattern[i];
        }
        for (String line : lines) {
            System.out.println(line);
        }
  }

    // Static Inner Class
    static class CharacterPatternMap {

        char letter;          // stores the character
        String[] pattern;     // stores 7 lines of banner

        // Constructor
        CharacterPatternMap(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        // Method to get pattern
        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        String[] oPattern = {
                " * * * ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " * * * "
        };

        // Pattern for P
        String[] pPattern = {
                "* * * * ",
                "*      *",
                "*      *",
                "* * * * ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] sPattern = {
                " * * * * ",
                "*        ",
                "*        ",
                " * * * * ",
                "        *",
                "        *",
                " * * * *  "
        };

        // Create objects
        CharacterPatternMap letterO1 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap letterO2 = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap letterP = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap letterS = new CharacterPatternMap('S', sPattern);

        // Store in array
        CharacterPatternMap[] word = {letterO1, letterO2, letterP, letterS};

        // Print banner row by row
        for (int i = 0; i < 7; i++) {           // 7 rows
            for (int j = 0; j < word.length; j++) {
                System.out.print(word[j].getPattern()[i] + "  ");
            }
            System.out.println();  // move to next line
        }
    }
}