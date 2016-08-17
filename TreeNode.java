
public class TreeNode<E> {
	
	TreeNode<E> left, right;
	E e;
	
	public TreeNode(E e,TreeNode<E> left, TreeNode<E> right){
		this.left=left;
		this.right=right;
		this.e=e;
	}

}
