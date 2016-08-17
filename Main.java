
public class Main {

	public static void main(String[] args) {
		TreeNode<Integer> t9=new TreeNode<>(9,null,null);
		TreeNode<Integer> t8=new TreeNode<>(8,null,null);
		TreeNode<Integer> t6=new TreeNode<>(6,null,null);
		TreeNode<Integer> t7=new TreeNode<>(7,null,null);
		TreeNode<Integer> t5=new TreeNode<>(5,null,null);
		TreeNode<Integer> t4=new TreeNode<>(4,t8,t9);
		TreeNode<Integer> t2=new TreeNode<>(2,t4,t5);
		TreeNode<Integer> t3=new TreeNode<>(3,t6,t7);
		TreeNode<Integer> t1=new TreeNode<>(1,t2,t3);
		
		TreeTraversal<Integer> treeTravel = new TreeTraversal<>();
		treeTravel.inOrder(t1);
	}
	
	
}
