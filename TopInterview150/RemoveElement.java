public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] res = new int[nums.length];
        int j = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                res[j++] = nums[i];
                count++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
        return count;
    }
}