 

class Calculator{

    int a = 1;
    public int add(int n1,int n2){
        int res  = n1+n2+a;
        return res;
    }
}



class Hello {

    
    public static void main(String[] args) {
        
       Calculator calc = new Calculator();
       
       
        System.out.println( calc.add(1,3));
           
        
        


    }
}