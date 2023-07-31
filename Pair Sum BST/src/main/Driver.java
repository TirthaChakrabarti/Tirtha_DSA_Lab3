package main;

import java.util.Scanner;

import binarySearchTree.Node;
import binarySearchTree.TreeImplementation;
import pairSum.PairSumImplementation;

public class Driver {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Node root = null;
		TreeImplementation tree = new TreeImplementation();
		PairSumImplementation pairSum = new PairSumImplementation();

		// Creating Binary Search Tree

		System.out.print("Number of nodes in the Binary Search Tree: ");
		int m = scan.nextInt();

		System.out.println("Provide all the node data: ");
		for (int i = 0; i < m; i++) {
			System.out.print((i + 1) + ") ");
			root = tree.insertData(root, scan.nextInt());
		}

		// Searching for pair when a sum is provided

		System.out.print("Sum: ");
		pairSum.findPair(root, scan.nextInt());
	}

}
