/*
 * Aerovition Digital Inc.
 * Authror: Shaw Rahman
 * All rights reserved.
 */


package guidanceSystemsPackage;

public  class Node {
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight2 the weight to set
	 */
	public void setWeight(double weight2) {
		this.weight = weight2;
	}
	/**
	 * @return the nodeHead
	 */
	public Node getNodeHead() {
		return NodeHead;
	}
	/**
	 * @param nodeHead the nodeHead to set
	 */
	public void setNodeHead(Node nodeHead) {
		NodeHead = nodeHead;
	}
	/**
	 * @return the nodeTails
	 */
	public Node getNodeTail() {
		return NodeTail;
	}
	/**
	 * @param nodeTail the nodeTail to set
	 */
	public void setNodeTail(Node nodeTail) {
		NodeTail = nodeTail;
	}
	public String Name;
	public double weight;
	public Node NodeHead;
	public Node NodeTail;

}
