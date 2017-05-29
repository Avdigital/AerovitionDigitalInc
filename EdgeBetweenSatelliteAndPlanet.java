/*
 * Aerovition Digital Inc.
 * Authror: Shaw Rahman
 * All rights reserved.
 */


package guidanceSystemsPackage;

import spaceObjectDefinitionPackage.SpaceStation;

public  class EdgeBetweenSatelliteAndPlanet {
	public String [] edgeFromSatelliteToPlanet;
	/**
	 * @return the edgeFromSatelliteToPlanet
	 */
	public synchronized String[] getEdgeFromSatelliteToPlanet() {
		return edgeFromSatelliteToPlanet;
	}
	/**
	 * @param edgeFromSatelliteToPlanet the edgeFromSatelliteToPlanet to set
	 */
	public synchronized void setEdgeFromSatelliteToPlanet(String[] edgeFromSatelliteToPlanet) {
		this.edgeFromSatelliteToPlanet = edgeFromSatelliteToPlanet;
	}
	/**
	 * @return the edgeFromPlanetToSatellite
	 */
	public synchronized String[] getEdgeFromPlanetToSatellite() {
		return edgeFromPlanetToSatellite;
	}
	/**
	 * @param edgeFromPlanetToSatellite the edgeFromPlanetToSatellite to set
	 */
	public synchronized void setEdgeFromPlanetToSatellite(String[] edgeFromPlanetToSatellite) {
		this.edgeFromPlanetToSatellite = edgeFromPlanetToSatellite;
	}
	/**
	 * @return the edgeFromSatelliteToSpaceStation
	 */
	public synchronized String[] getEdgeFromSatelliteToSpaceStation() {
		return edgeFromSatelliteToSpaceStation;
	}
	/**
	 */
	public synchronized void setEdgeFromSatelliteToSpaceStation() {
		this.edgeFromSatelliteToSpaceStation = edgeFromSatelliteToSpaceStation;
	}
	/**
	 * @return the edgeFromSpacceStationToSatellite
	 */
	public synchronized String[] getEdgeFromSpacceStationToSatellite() {
		return edgeFromSpacceStationToSatellite;
	}
	/**
	 * @param edgeFromSpacceStationToSatellite the edgeFromSpacceStationToSatellite to set
	 * @return 
	 */
	public synchronized boolean setEdgeFromSpacceStationToSatellite(String[] edgeFromSpacceStationToSatellite) {
		this.edgeFromSpacceStationToSatellite = edgeFromSpacceStationToSatellite;
		return false;
	}
	/**
	 * @return the edgeFromPlanetToPlanet
	 */
	public synchronized String[] getEdgeFromPlanetToPlanet() {
		return edgeFromPlanetToPlanet;
	}
	/**
	 * @param edgeFromPlanetToPlanet the edgeFromPlanetToPlanet to set
	 */
	public synchronized void setEdgeFromPlanetToPlanet(String[] edgeFromPlanetToPlanet) {
		this.edgeFromPlanetToPlanet = edgeFromPlanetToPlanet;
	}
	/**
	 * @return the edgeFromSatelitteToSatellite
	 */
	public synchronized String[] getEdgeFromSatelitteToSatellite() {
		return edgeFromSatelitteToSatellite;
	}
	/**
	 * @param edgeFromSatelitteToSatellite the edgeFromSatelitteToSatellite to set
	 */
	public synchronized void setEdgeFromSatelitteToSatellite(String[] edgeFromSatelitteToSatellite) {
		this.edgeFromSatelitteToSatellite = edgeFromSatelitteToSatellite;
	}
	/**
	 * @return the eumer_names
	 */
	public synchronized EdgePropertyTypeValueEnumerator getEumer_names() {
		return eumer_names;
	}
	/**
	 * @param eumer_names the eumer_names to set
	 */
	public synchronized void setEumer_names(EdgePropertyTypeValueEnumerator eumer_names) {
		this.eumer_names = eumer_names;
	}
	public String [] edgeFromPlanetToSatellite;
	public String [] edgeFromSatelliteToSpaceStation;
	public String [] edgeFromSpacceStationToSatellite;
	public String [] edgeFromPlanetToPlanet;
	public String [] edgeFromSatelitteToSatellite;
	public EdgePropertyTypeValueEnumerator eumer_names;
	
	
	
	SatelliteClass Satellite = new SatelliteClass();  
	SpaceStation Spacest = new SpaceStation(); 
	EdgeBetweenSatelliteAndPlanet  edSatPla = new EdgeBetweenSatelliteAndPlanet();
	
	
	
	public EdgeBetweenSatelliteAndPlanet func_behaviour_create_edge(SatelliteClass Satellite,  SpaceStation Spacest, EdgeBetweenSatelliteAndPlanet edSatPla){
		System.out.println(Satellite.Name); //from satellite
		System.out.println(Spacest.equals(getClass())); //to a [any] spaceObject type
		System.out.println(edSatPla.getEdgeFromSatelliteToSpaceStation()); //get a connection type for edge to establish a "graph edge".
		System.out.println(edSatPla.func_behaviour_create_edge_flag_y_n()); //connection established with relationship between a satellite and a space object such as  planet or space station
		System.out.println(edSatPla.setEdgeFromSpacceStationToSatellite(edgeFromSpacceStationToSatellite));
		edSatPla.func_behaviour_create_edge(Satellite, Spacest, edSatPla); //callback recursively. to expand to interconnect space objects.in  Mission advancing.
		return edSatPla; // return an edge of the created graph edge.
		
	}
	public boolean func_behaviour_create_edge_flag_y_n(){
		return true;
		
	}
}
