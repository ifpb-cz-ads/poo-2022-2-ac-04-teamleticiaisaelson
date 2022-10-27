public class BMExercicio07 {
        public static void main(String[] args) { 
            int x = 180; 
            while (x>1) { 
                if ((x%2)==0) {
                //se x é par:
                    x= x/2; 
                } 
                // se x é impar:
                else { 
                    x=3*x+1; 
                } 
                    if (x==1) { 
                        System.out.print(x);   
                    }
                    else { 
                        System.out.print(x+"->"); 
                    } 
            } x--; 
            
        } 
        
    }
    

