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
}