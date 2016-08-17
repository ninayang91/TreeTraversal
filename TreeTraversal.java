
public class TreeTraversal<E> {
	
	public void preOrder(TreeNode<E> subroot){
		if(subroot!=null){
			visit(subroot);
			preOrder(subroot.left);
			preOrder(subroot.right);
		}
	}
	
	public void inOrder(TreeNode<E> subroot){
		if(subroot !=null){
			inOrder(subroot.left);
			visit(subroot);
			inOrder(subroot.right);
		}
	}
	
	public void postOrder(TreeNode<E> subroot){
		if(subroot!=null){
			postOrder(subroot.left);
			postOrder(subroot.right);
			visit(subroot);
		}
	}
	
	public void levelOrder(TreeNode<E> subroot){
		ArrayQueue<TreeNode<E>> q = new ArrayQueue<>();
		q.enqueue(subroot);
		while(!q.isEmpty()){
			TreeNode<E> t = q.dequeue();
			visit(t);
			if(t.left!=null){
				q.enqueue(t.left);
			}
			if(t.right!=null){
				q.enqueue(t.right);
			}	
		}
	}
	
	public void visit(TreeNode<E> t){
		System.out.println(t.e);
	}

}
