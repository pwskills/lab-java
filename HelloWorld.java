import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
       this.data=data;
    }
}
class Treeinfo{
    int ht;
    int diam;
    Treeinfo(int ht, int diam){
        this.ht=ht;
        this.diam=diam;
    }
}
class BinaryTree {

    static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;

    }
   public static int diameter(Node root){

        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3= height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }

   
    static Treeinfo diameter2(Node root){

        if(root==null){
            return new Treeinfo(0, 0);
        }
        Treeinfo left = diameter2(root.left);
        Treeinfo right = diameter2(root.right);

        int height= Math.max(left.ht, right.ht)+1;

        int diam1= left.diam;
        int diam2= right.diam;
        int diam3= left.ht+right.ht+1;

        int diameter= Math.max(Math.max(diam1, diam2), diam3);
        Treeinfo treeinfo=new Treeinfo(height, diameter);
        return treeinfo;
    }

    static int sumLevel(Node root,int k){
        Queue <Node> q = new LinkedList<>();
        int i=0;
        int sum=0;
        q.add(root);
        q.add(null);

        while(i<=k){
            Node temp= q.remove();
           
            if(temp==null){
                if(q.isEmpty()){

                    return sum;
                }else {
                    if(k==i){
                        System.out.println("if k==i");
                        return sum;
                    }else {
                        System.out.println("else");
                        q.add(null);
                        i++;
                    }
                }
            }
            else{
                if(k==i){
                    sum+=temp.data;
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }



        return 0;

    }

}
class HelloWorld{
    public static void main(String args[]){
        Node tree= new Node(0);
        tree.left=new Node(1);
        tree.right=new Node(2);
        tree.left.left=new Node(3);
        tree.right.right=new Node(4);
        // System.out.println(tree.data+""+tree.left.data+""+tree.left.left.data+""+tree.right.data);
        // System.out.println("Lagest diametere in the tree is of length: ");
        // Treeinfo Tree = BinaryTree.diameter2(tree);
        // System.out.println(Tree.ht+" "+Tree.diam);
        // // System.out.println(BinaryTree.diameter(tree));
        // System.out.println("Height is :"+ BinaryTree.height(tree));
        System.out.println("Sum of level 2: "+ BinaryTree.sumLevel(tree, 0));


    }
}