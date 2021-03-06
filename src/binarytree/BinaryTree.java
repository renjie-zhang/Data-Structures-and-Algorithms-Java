package binarytree;


public class BinaryTree {

    private Node root;

    /**
     * root根节点的set
     * @param root
     */
    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 二叉树的递归前序遍历
     */
    public void preOrder(){
        if(this.root != null){
            this.root.postOrder();
        }else {
            System.out.println("当前二叉树为空，无法进行遍历");
        }
    }

    /**
     * 二叉树的递归中序遍历
     */
    public void infixOrder(){
        if(this.root != null){
            this.root.infixOrder();
        }else {
            System.out.println("当前二叉树为空，无法进行遍历");
        }
    }

    /**
     * 二叉树的递归后序遍历
     */
    public void postOrder(){
        if(this.root != null){
            this.root.postOrder();
        }else {
            System.out.println("当前二叉树为空，无法进行遍历");
        }
    }
}

