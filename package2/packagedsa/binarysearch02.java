

// Search the 'target' value in a 2d integer matrix of dimensions n *m and returns true if found , else false. 
// This matrix has the following properties:-

// 1. Intergers in each row are stored from left to right.
// 2. The first intergers of each row is greater than the last intergers of the previous row.

// input: [[1,3,5,7],[10,11,16,20],[23,30,34,60]]=3
// output: true


// Time complextiy: O(logn*m)

// note: we figured mid(r, c) directly from 2d matrix

// row = : i/m   where m is column of the matrix
// column: i%m  where m is column of the matrix

// r:  (rm +c )/m
// c : (rm +c)%m

public class binarysearch02 {
    public  boolean SearchMatrix(int[][] a, int target) {
        // number of rows = n, number of columns = m
        int n = a.length, m = a[0].length;
        int st = 0 , end= n*m-1;
        while(st<=end) {
            int mid = st*(end-1)/2;
            int midElt = a[mid/m][mid%m];
            if(midElt == target) return true;

            if(midElt< target){
                end=mid-1;
            }else{
                st = mid+1;
            }
    }
    
    
    return false;
}
public static void main(String[] args) {
    int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target = 3;
    binarysearch02 obj = new binarysearch02();
    obj. SearchMatrix(a, target);
    
  
}
}
