public class array {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        System.out.println("lentgth " + arr[1].length);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                // System.out.print(arr[i][j] + " ");
            }
            // System.out.println();
        }

        int arr1[][] = new int[4][5];
        // FOR EACH LOOP
        for (int n[] : arr1) {
            for (int m : n) {
                m = (int) (Math.random() * 10);
                // System.out.print(m + " ");
            }
            // System.out.println("");
        }

        int arr2[][] = new int[3][4];
        for (int a[] : arr2) {
            for (int b : a) {
                b = (int) (Math.random() * 10);
                // System.out.print(b + " ");
            }
            // System.out.println("");
        }

        // 3D Array

        int arr3[][][] = new int[3][3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    arr3[i][j][k] = (int) (Math.random() * 10);
                    // System.out.print(arr3[i][j][k] + " ");
                }
                // System.out.print(" ");
            }
            // System.out.println(" ");

        }

        int arr4[][][] = new int[3][3][2];
        for(int a[][]:arr4){
            for(int b[]:a){
                for(int c:b){
                    c= (int)(Math.random()*10);
                    System.out.print(c+" ");
                }
                 System.out.print(" ");
            }
            
            System.out.println(" ");

        }


    }
}
