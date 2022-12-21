package hackerrank;

import java.util.ArrayList;
import java.util.List;
  	 	
public class FindLongestPath {

		static class Node {
			
			int data;
			Node left, right;
			
			Node(int data) {
				this.data = data;
				
				this.left = this.right = null;
				
			}
		}
		public static void main(String[] args ) {
			
			Node root = new Node(100);
			root.left = new Node(20);
			root.right = new Node(130);
			root.left.left = new Node(10);
			root.left.right = new Node(50);
			root.right.left = new Node(110);
			root.right.right = new Node(140);
			root.left.left.left = new Node(5);
			
			List<Integer> output = findLongestPath1(root);
			
			System.out.print(output.get(output.size() -1));
			
			for(int i = output.size() -2; i>=0; i--) {
				System.out.print("->" + output.get(i));
			}	
		
		}
			
			private static List<Integer> findLongestPath1(Node root){
			
			if(root == null) {
				
				return new ArrayList<Integer>();
			}
			
			List<Integer> leftPath = findLongestPath1(root.left);
			List<Integer> rightPath = findLongestPath1(root.right);
			
			if (rightPath.size() < leftPath.size()) {
				leftPath.add(root.data);
			} else {
				rightPath.add(root.data);
			}
			
			if (leftPath.size() > rightPath.size()) {
				return leftPath;
			} else {
				return rightPath;
			
			}	
			}
		//}

		private static List<Integer> findLongestPath(Node root) {
			return null;
		}

	}
		
	

