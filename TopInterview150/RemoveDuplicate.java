public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        // remove duplicate 
        int[] res = Arrays.stream(nums).distinct().toArray();
        for(int i = 0; i < res.length; i++) {
            nums[i] = res[i];
        }
        return res.length;
    }
}