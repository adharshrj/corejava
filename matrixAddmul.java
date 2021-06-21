class matrixAddmul {
    public static void main(String[] args) {
        int a[][]={{8,2,3},{2,1,4},{4,1,2}};    
        int b[][]={{7,3,4},{5,4,3},{9,2,4}};    
        int c[][]=new int[3][3];
        int d[][]=new int[3][3]; 
    
        for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
        c[i][j]=a[i][j]+b[i][j];  
        System.out.print(c[i][j]+" "); 
        }
    System.out.println();   
    }  
        for(int l=0;l<3;l++){    
            for(int m=0;m<3;m++){
                d[l][m]=a[l][m]*b[l][m];  
                System.out.print(d[l][m]+" ");
            }
        System.out.println();  
        } 
    }
}