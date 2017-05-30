
/*
 * Aerovition Digital Inc.
 * Authror: Shaw Rahman
 * All rights reserved.
 */


package guidanceSystemsPackage;



public  class SatelliteClass extends Node {
	public SatelliteClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SatelliteClass(Node satelliteClass, String[] satelliteName, float weight, float coordiante) {
		super();
		SatelliteClass = satelliteClass;
		SatelliteName = satelliteName;
		this.weight = weight;
		this.coordiante = coordiante;
	}
	/**
	 * @return the satelliteClass
	 */
	public synchronized Node getSatelliteClass() {
		return SatelliteClass;
	}
	/**
	 * @param satelliteClass the satelliteClass to set
	 */
	public synchronized void setSatelliteClass(Node satelliteClass) {
		SatelliteClass = satelliteClass;
	}
	/**
	 * @return the satelliteName
	 */
	public synchronized String[] getSatelliteName() {
		return SatelliteName;
	}
	/**
	 * @param satelliteName the satelliteName to set
	 */
	public synchronized void setSatelliteName(String[] satelliteName) {
		SatelliteName = satelliteName;
	}
	/**
	 * @return the weight
	 */
	public synchronized double getWeight() {
		return weight;
	}
	/**
	 * @param weight2 the weight to set
	 */
	public synchronized void setWeight(double weight2) {
		this.weight = weight2;
	}
	/**
	 * @return the coordiante
	 */
	public synchronized float getCoordiante() {
		return coordiante;
	}
	/**
	 * @param coordiante the coordiante to set
	 */
	public synchronized void setCoordiante(float coordiante) {
		this.coordiante = coordiante;
	}
	public Node SatelliteClass = new Node();
	public String[] SatelliteName;
	public double weight;
	public float coordiante;
	
}
