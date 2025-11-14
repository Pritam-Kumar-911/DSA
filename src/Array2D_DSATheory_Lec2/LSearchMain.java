package Array2D_DSATheory_Lec2;

public class LSearchMain {
    public static void main(String[] args) {
        LinerSearch linerSearch = new LinerSearch();
        int[] array = {20,45,6,4,23,78};

        //System.out.println(linerSearch.Lsearch(array,100));

        System.out.println(linerSearch.RecursiveLSearch(array,0,78));
    }


}
