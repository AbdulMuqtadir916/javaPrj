class Pattern{
    public void HalfPyramidPattern(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}

public class arraypattern {
    public static void main(String[] args) {
        Pattern obj = new Pattern();
        obj.HalfPyramidPattern(4);
        
    }
}
