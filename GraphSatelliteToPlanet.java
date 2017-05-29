
/*
 * Aerovition Digital Inc.
 * Authror: Shaw Rahman
 * All rights reserved.
 */


package guidanceSystemsPackage;
//need to fix..
import java.util.*;
import java.lang.*;

public class GraphSatelliteToPlanet{
	
	Node TopGraphNode = new Node();
	Node LastGraphNode = new Node();
	int count = 0;
	public double weight =  0.0;
	/**
	 * @return the weight
	 */
	public synchronized double getWeight() {
		return weight;
	}


	/**
	 * @param weight the weight to set
	 */
	public synchronized void setWeight(double weight) {
		this.weight = weight;
	}


	public double distance =  0.0;
	
	/**
	 * @return the distance
	 */
	public synchronized double getDistance() {
		return distance;
	}


	/**
	 * @param distance the distance to set
	 * @return 
	 */
	public synchronized double setDistance(double distance) {
		return this.distance = distance;
	}


	public GraphSatelliteToPlanet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GraphSatelliteToPlanet(SatelliteClass satelliteClassobj, SatelliteClass topSatelliteClassobj,
			SatelliteClass lastSatelliteClassobj, EdgeBetweenSatelliteAndPlanet connectingEdge) {
		super();
		SatelliteClassobj = satelliteClassobj;
		TopSatelliteClassobj = topSatelliteClassobj;
		LastSatelliteClassobj = lastSatelliteClassobj;
		this.connectingEdge = connectingEdge;
	}


	/**
	 * @return the satelliteClass
	 */
	public synchronized Node[] getSatelliteClass() {
		return getSatelliteClass();
	}


	/**
	 * @param satelliteClass the satelliteClass to set
	 */
	public synchronized void setSatelliteClass(SatelliteClass satelliteClass) {
		SatelliteClassobj = satelliteClass;
	}


	/**
	 * @return the topSatelliteClass
	 */
	public synchronized Node getTopSatelliteClass() {
		return getTopSatelliteClass();
	}


	/**
	 * @param topSatelliteClass the topSatelliteClass to set
	 */
	public synchronized void setTopSatelliteClass(Node topSatelliteClass) {
		TopGraphNode = topSatelliteClass;
	}


	/**
	 * @return the lastSatelliteClass
	 */
	public synchronized Node getLastSatelliteClass() {
		return LastGraphNode;
	}


	/**
	 * @param lastSatelliteClass the lastSatelliteClass to set
	 */
	public synchronized void setLastSatelliteClass(Node lastSatelliteClass) {
		LastGraphNode = lastSatelliteClass;
	}


	/**
	 * @return the connectingEdge
	 */
	public synchronized EdgeBetweenSatelliteAndPlanet getConnectingEdge() {
		return connectingEdge;
	}


	/**
	 * @param connectingEdge the connectingEdge to set
	 */
	public synchronized void setConnectingEdge(EdgeBetweenSatelliteAndPlanet connectingEdge) {
		this.connectingEdge = connectingEdge;
	}

	public guidanceSystemsPackage.SatelliteClass SatelliteClassobj = new SatelliteClass();
	public guidanceSystemsPackage.SatelliteClass TopSatelliteClassobj = new SatelliteClass();
	public guidanceSystemsPackage.SatelliteClass LastSatelliteClassobj = new SatelliteClass();
	public EdgeBetweenSatelliteAndPlanet connectingEdge = new EdgeBetweenSatelliteAndPlanet(); //singular declaration.
	
	
	public  String[]  missionBehaviour(String[] arr ){
		return arr;
		
	}
	
	
	public Object mission_behaviour_grow_graph_advancepath(){ //chage flag later on 
		//conditions
		//1. add the first node to graph and set top node  and last node the same -node (objects vs graph topnode and last node)
		//2. add the subsequent nodes to graph and grow and set the last node
		//3. add relationships between increasing nodes (of space objects)
		GraphSatelliteToPlanet graph = new GraphSatelliteToPlanet();
		//for satellite......
	try{	
		if((SatelliteClassobj.NodeHead == null)){
			//add node at the top..one node [ ONLY ]inserted.at TOP
			SatelliteClassobj.Name = "first Space object";
			SatelliteClassobj.NodeTail= graph.TopGraphNode;
			graph.LastGraphNode = null;
			
			//set relationship ,between two nodes. to the nearby 
			//move /adjust edge  relationship ;more the distance the less the weight for SEO..
			
			graph.setConnectingEdge(getConnectingEdge());
			
			//check  err etc..
			String[] err = null;
			graph.missionBehaviour(err);
			
			//set weight and distance..
			//these has to be node /space object distance..
			graph.distance = min(graph.getDistance());
			graph.weight = max(graph.getWeight());
			count += count;
		}
		
		if(!(SatelliteClassobj.NodeHead == null)){ //if space object found in between exisitng graph path..
			//advance..insert at last place in graph and go on..
			SatelliteClassobj.Name = "exisiting nodes are present in Space graph a new node added in the moiddle";
			SatelliteClassobj.NodeHead = graph.LastGraphNode;
			graph.LastGraphNode = SatelliteClassobj.NodeTail; 
			SatelliteClassobj.NodeTail = SatelliteClassobj.NodeTail.NodeTail; //increment.numbernode added ,advance..
			
			//set relationship
			//move adjust edge relationship between two nodes. to the nearby 
			graph.setConnectingEdge(getConnectingEdge());
		
			
			//check error etc..
			String[] err = null;
			graph.missionBehaviour(err);
						
			//set weight and distance..more the distance the less the weight for SEO..
			//these has to be node /space object distance..
			graph.distance = min(graph.setDistance(distance));
			graph.weight = max(graph.setDistance(distance));
			
			count += count;
		}
	}
	catch (Exception e){
		e.getMessage();
	}
	return (graph.mission_behaviour_grow_graph_advancepath());  //return mission status..
}

	public SatelliteClass  search_a_space_object( SatelliteClass arr ){
		
		SatelliteClass stc = new SatelliteClass();
		
		if (stc.NodeTail != null){
			stc.getWeight();
			stc.setWeight(weight);
			
			//advance.....
			stc.NodeTail = stc.NodeTail.NodeTail; //increment.
			arr = stc;  //save and move..
		}
		System.out.println("path"+ arr + "\n" );
		return arr; //return a graph path 
		
	} 
	
	private double min(double distance2) {
		// TODO Auto-generated method stub
		return 0;
	}


	private double max(double weight2) {
		// TODO Auto-generated method stub
		return 0;
	}
			
}

