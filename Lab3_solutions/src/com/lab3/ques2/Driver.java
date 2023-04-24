package com.lab3.ques2;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Driver {
	class Node {
		private Node left;
		private Node right;
		private int data;
		
		Node(int key) {
			left = right = null;
			data = key;
		}
	}
	
	public Node insert(Node root, int key) {
		if(root == null)
			return new Node(key);
		if(key<root.data) {
			root.left = insert(root.left, key);
		}
		else {
			root.right = insert(root.right, key);
		}
		return root;
	}
	
	public static boolean findPair(Node current, int sum, Set set) {
		if(current==null) {
			return false;
		}
		else {
			boolean isPresent = findPair(current.left, sum, set);
			if(isPresent) {
				return isPresent;
			}
			
			if(set.contains(sum - current.data)) {
				System.out.println("Pair is ("+ (sum - current.data) + "," + current.data + ")");
				return true;
			}
			else {
				set.add(current.data);
			}
			return findPair(current.right, sum, set);
		}
	}
	
	public static void findPairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		boolean isPresent = findPair(root, sum, set);
		
		if(!isPresent) {
			System.out.println("Pair does not exist");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pairsum = sc.nextInt();
		Node root = null;
		
		Driver driver = new Driver();
		root = driver.insert(root, 20);
		root = driver.insert(root, 30);
		root = driver.insert(root, 60);
		root = driver.insert(root, 10);
		root = driver.insert(root, 40);
		root = driver.insert(root, 80);
		root = driver.insert(root, 90);
		root = driver.insert(root, 70);
		findPairWithGivenSum(root, pairsum);
	}
}
