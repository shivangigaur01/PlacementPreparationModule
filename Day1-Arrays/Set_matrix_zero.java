class Solution {
    public void setZeroes(int[][] matrix) {
         if(matrix==null || matrix.length==0){
        return;
    }
    
    boolean r = false;
    boolean c= false;
    
    for(int row=0;row<matrix.length;row++){
        if(matrix[row][0] == 0){
            c=true;
            break;
        }
    }
    for(int col=0;col<matrix[0].length;col++){
        if(matrix[0][col] == 0){
            r=true;
            break;
        }
    }
    for(int row=1;row<matrix.length;row++){
        for(int col=1;col<matrix[0].length;col++){
            if(matrix[row][col]==0){
                matrix[row][0]=0;
                matrix[0][col]=0;
            }
        }
    }
    
    
    for(int row=1;row<matrix.length;row++){
        if(matrix[row][0]==0){
            for(int col=1;col<matrix[0].length;col++){
                matrix[row][col]=0;
            }
        }
    }
    
    
    for(int col=1;col<matrix[0].length;col++){
        if(matrix[0][col]==0){
            for(int row=1;row<matrix.length;row++){
                matrix[row][col]=0;
            }
        }
    }
    
    if(r){
        for(int col=0;col<matrix[0].length;col++){
            matrix[0][col]=0;
        }
    }
    
    if(c){
        for(int row=0;row<matrix.length;row++){
            matrix[row][0]=0;
          }
        }
    }
}
