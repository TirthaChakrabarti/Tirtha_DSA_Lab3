package pairSum;

import java.util.HashSet;
import java.util.Set;
import binarySearchTree.Node;

public class PairSumImplementation implements PairSumInterface {

	@Override
	public void findPair(Node root, int sum) {

		Set<Integer> set = new HashSet<>();
		boolean result = findPairUtil(root, sum, set);

		if (!result) {
			System.out.println("Pair is not found");
		}
	}

	private boolean findPairUtil(Node root, int sum, Set<Integer> set) {

		// finding pair by inorder traversing the BST

		if (root == null) {
			return false;
		}

		if (findPairUtil(root.leftNode, sum, set)) {
			return true;
		}

		if (set.contains(sum - root.nodeData)) {
			System.out.println("Pair is found: (" + (sum - root.nodeData) + "," + root.nodeData + ")");
			return true;
		} else {
			set.add(root.nodeData);
		}

		return findPairUtil(root.rightNode, sum, set);
	}

}
