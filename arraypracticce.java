

class ArrayExample {
    void demoArray() {
        int[] arr = {10, 5, 3, 6, 2, 8, 4, 10 };

        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
                System.out.println(ans);

            }
        }

    }
}

    public class arraypracticce {
        public static void main(String[] args) {
            ArrayExample obj = new ArrayExample();
            obj.demoArray();
            
           
        }
        
    }
    `