import java.io.File;

public class LeetCode {
    public static void main(String[] args){
        int[] nums1=new int[10];
        nums1[0]=1;
        nums1[1]=3;
        nums1[2]=5;
        nums1[3]=6;
        int[] nums2=new int[3];
        nums2[0]=0;
        nums2[1]=4;
        nums2[2]=5;
        merge so=new merge();
        so.merge(nums1,4,nums2,3);

    }
}
