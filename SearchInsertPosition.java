/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.你可以假设数组中没有重复项*/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int i=0;
        for(;i<len;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return i;
    }
}
