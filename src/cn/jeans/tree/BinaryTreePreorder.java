package cn.jeans.tree;

public class BinaryTreePreorder {
	 
	 public static void preOrder(BinaryTree root){  //�ȸ�����
	  if(root!=null){
	   System.out.print(root.data+"-");
	   preOrder(root.left);
	   preOrder(root.right);
	  }
	 }
	 
	 public static void inOrder(BinaryTree root){     //�и�����

	  if(root!=null){
	   inOrder(root.left);
	   System.out.print(root.data+"--");
	   inOrder(root.right);
	  }
	 }
	 
	 public static void postOrder(BinaryTree root){    //�������

	  if(root!=null){
	   postOrder(root.left);
	   postOrder(root.right);
	   System.out.print(root.data+"---");
	  }
	 }
	 
	 public static void main(String[] str){
	  int[] array = {12,76,35,22,16,48,90,46,9,40};
	  BinaryTree root = new BinaryTree(array[0]);   //����������
	  for(int i=1;i<array.length;i++){
	   root.insert(root, array[i]);       //��������в�������
	  }
	  System.out.println("�ȸ�������");
	  preOrder(root);
	  System.out.println();
	  System.out.println("�и�������");
	  inOrder(root);
	  System.out.println();
	  System.out.println("���������");
	  postOrder(root);
	 }
}