package binarySearchTree;

public class TreeImplementation implements TreeInterface {

	@Override
	public Node newNode(int nodeData) {

		// creating new node

		Node temp = new Node();
		temp.nodeData = nodeData;
		temp.leftNode = null;
		temp.rightNode = null;

		return temp;
	}

	@Override
	public Node insertData(Node root, int value) {

		// Creating Binary Search Tree by inserting data

		if (root == null) {
			return newNode(value);
		}
		if (root.nodeData > value) {
			root.leftNode = insertData(root.leftNode, value);
		} else if (root.nodeData == value) {
			System.out.println("Duplicate value not allowed. New node not created.");
		} else {
			root.rightNode = insertData(root.rightNode, value);
		}
		return root;
	}

}
