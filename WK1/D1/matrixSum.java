public class matrixSum  
{  
    public static void main(String[] args) {  
        int r,c, sumR, sumC;  

        int a[][] = {     
                        {1, 2, 3},  
                        {2, 1, 4},  
                        {4, 1, 2}  
                    };  
            

          r = a.length;  
          c= a[0].length;  
          

        for(int i = 0; i < r; i++){  
            sumR = 0;  
            for(int j = 0; j < c; j++){  
              sumR = sumR + a[i][j];  
            }  
            System.out.println("Row Sum" + (i+1) + "=" + sumR);  
        }  
            
        for(int i = 0; i < c; i++){  
            sumC = 0;  
            for(int j = 0; j < r; j++){  
              sumC = sumC + a[j][i];  
            }  
            System.out.println("Column Sum" + (i+1) + "=" +sumC);  
        }  
    }  
}  