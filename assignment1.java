package winsoft;

public class assignment1 {
    public static void Arrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
       
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
        
        
        int i = k + 1; 
        int j = 0; 
        int p = 0; // Current position in X
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[p] = X[i];
                i++;
            } else {
                X[p] = Y[j];
                j++;
            }
            p++;
        }
        
        while (j < n) {
            X[p] = Y[j];
            j++;
            p++;
        }
    }
    
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        Arrays(X, Y);
        
        // Print the merged array X
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
    
}
