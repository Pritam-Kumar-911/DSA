package Array2D_DSATheory_Lec2;

public class BinarySearch {
    public int binarySearch(int[] a, int x){
        int lb=0;
        int ub=a.length-1;
        while (lb <= ub){
            int mid = (lb+ub)/2;

            if (a[mid] == x){
                return mid;
            } else if (a[mid] > x) {
                ub = mid - 1;
            }else {
                lb = mid + 1;
            }
        }
        return -1;
    }
    public int RecursiveBinarySearch(int[] a , int p , int q , int x){
        if (p>q){
            return -1;
        }else {
            int mid = (p+q)/2;
            if (a[mid] == x){
                return mid;
            } else if (a[mid] > x) {
                return RecursiveBinarySearch(a,p,mid-1,x);
            }else {
                return RecursiveBinarySearch(a,mid+1,q,x);
            }
        }
    }
}
