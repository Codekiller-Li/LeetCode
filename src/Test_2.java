public class Test_2 {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=revert(l1);
        l2=revert(l2);
        int tag=0;
        ListNode result = new ListNode(0);
        ListNode p=result;
        while (l1!=null){
            if(tag==1){
                ListNode temp =new ListNode((l1.val+l2.val+1)%10);
                if((l1.val+l2.val+1)-10>=0){
                    tag=1;
                }else {
                    tag=0;
                }
                l1=l1.next;
                l2=l2.next;
                p.next=temp;
                p=p.next;
            }else {
                ListNode temp =new ListNode((l1.val+l2.val)%10);
                if((l1.val+l2.val)-10>=0){
                    tag=1;
                }else {
                    tag=0;
                }
                l1=l1.next;
                l2=l2.next;
                p.next=temp;
                p=p.next;
            }
        }
//        result.next=revert(result.next);
//        result.next=revert(result.next);
        return result.next;
    }

    //不含头节点就地逆置单链表
    private ListNode revert(ListNode L){
        if(L==null||L.next==null)
            return L;
        ListNode p=L;
        ListNode newL=null;
        while(p!=null){
            ListNode q=p;
            p=p.next;
            q.next=newL;
            newL=q;
        }
        return newL;
    }

    //含头节点L的逆置
    private ListNode reverse(ListNode L){
        //单链表为空或只有头结点或只有一个元素，不用进行逆置操作
        if(L==null||L.next==null||L.next.next==null)
            return L;
        ListNode p=L.next.next;//令p指向线性表中第2个元素a2
        L.next.next=null;//令线性表中第1个元素a1的next为空
        while(p!=null){
            ListNode q=p.next;
            //将p插入头结点之后
            p.next=L.next;
            L.next=p;
            p=q;//继续访问下一个元素
        }
        return L;
    }

    public static void main(String[] args){
        Test_2 test_2  = new Test_2();
        ListNode l0 = new ListNode(9);
        ListNode l1 = new ListNode(4);
        l0.next=l1;
        ListNode l2 = new ListNode(3);
        l1.next=l2;
        ListNode l3 = new ListNode(3);
        l2.next=l3;


        ListNode ll0 = new ListNode(4);
        ListNode ll1 = new ListNode(6);
        ll0.next=ll1;
        ListNode ll2 = new ListNode(4);
        ll1.next=ll2;
        ListNode ll3 = new ListNode(8);
        ll2.next=ll3;

//        System.out.println(test_2.addTwoNumbers(l0,ll1));
//        System.out.println(result.val);

//        System.out.println(l0.val+"||"+l0.next.val+"||"+l0.next.next.val+"||"+l0.next.next.next.val+"||"+l0.next.next.next.next.val);
        ListNode test = new ListNode(0);
        test=test_2.addTwoNumbers(l0,ll0);
        while (test!=null){
            System.out.println(test.val);
            test=test.next;
        }
    }
}
