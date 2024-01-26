
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] ar){
        int sum=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                sum+=ar[i][j];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] ar){
        double sum=sum(ar);
        sum=sum/(ar.length*ar[0].length);
        return sum;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] ar){
        int m=ar[0][0];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                m=Math.min(ar[i][j],m);
            }
        }
        return m;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] ar){
        int m=ar[0][0];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                m=Math.max(ar[i][j],m);
            }
        }
        return m;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] ar){
        int cnt=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(ar[i][j]%2==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] ar){
        int cnt=0;
        for(int[] row:ar){
            for(int col:row){
                if(col%2==0) cnt++;
            }
        }
        return cnt;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] ar){
        for(int[] row:ar){
            for(int col:row){
                if(col<0) return false;
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] ar){
        int[] out=new int[ar.length];
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=0;j<ar[i].length;j++){
                sum+=ar[i][j];
            }
            out[i]=sum;
        }
        return out;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] ar){
        int[] out=new int[ar[0].length];
        for(int i=0;i<ar[0].length;i++){
            int sum=0;
            for(int j=0;j<ar.length;j++){
                sum+=ar[j][i];
            }
            out[i]=sum;
        }
        return out;
    }
}
