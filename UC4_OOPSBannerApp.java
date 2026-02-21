public class UC4_OOPSBannerApp {
    public static void main(String[] args) {

        int height = 7;  
        int width = 7;    

        for (int i = 0; i < height; i++) {

            
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  "); 

            
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            
            for (int j = 0; j < width; j++) {
                if (j == 0 || (i == 0 && j < width - 1) ||
                    (i == height / 2 && j < width - 1) ||
                    (j == width - 1 && i > 0 && i < height / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height / 2 || i == height - 1 ||
                    (j == 0 && i < height / 2) ||
                    (j == width - 1 && i > height / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println(); 
        }
    }
}
