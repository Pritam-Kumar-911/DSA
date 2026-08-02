    package Arrays_and_hashing;

    import java.util.HashSet;

    public class contains_duplicate_revisit {
        public static void main(String[] args) {
            int[] nums = {1,1,1,3,3,4,3,2,4,2};
            HashSet<Integer> set = new HashSet<>();
            boolean flag = false;

            for (int arr: nums){
                if (set.contains(arr)){
                    flag = true;
                }else {
                    set.add(arr);
                }
            }

            System.out.println(flag);
        }
    }
