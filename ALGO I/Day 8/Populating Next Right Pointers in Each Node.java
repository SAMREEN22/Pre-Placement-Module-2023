/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node temp=root;
        if(root==null){
            return null;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node first=q.poll();
            int size=q.size();
            if(first.left!=null){
                q.add(first.left);
            }
            if(first.right!=null){
                q.add(first.right);
            }
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                first.next=curr;
                first=curr;
            }
        }
        return temp;
    }
}
