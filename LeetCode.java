public class LeetCode {
    public static void main(String[] args){
        MergeTwoSortedLists so= new MergeTwoSortedLists();
        ListNode l1=new ListNode(3);
        ListNode l2=new ListNode(2);
        ListNode re=so.mergeTwoLists(l1,l2);
        System.out.println(""+re.val);
        while (re!=null){
            System.out.print(""+re.val);
            re=re.next;
        }

    }
}
