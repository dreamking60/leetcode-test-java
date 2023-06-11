public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int t = 0;
        int[] res = new int[m+n];
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                res[t++] = nums1[i++];
            } else {
                res[t++] = nums2[j++];
            }
        }
        while(i < m) {
            res[t++] = nums1[i++];
        }
        while(j < n) {
            res[t++] = nums2[j++];
        }
        for(int k = 0; k < m+n; k++) {
            nums1[k] = res[k];
        }
    }
}