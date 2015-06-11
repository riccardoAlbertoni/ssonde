/** 
 * SSONDE, a framework providing an instance similarity enabling in a detailed comparison, 
 * ranking of resources through the comparison of their RDF ontology driven metadata.
 * From the theoretical point of view SSONDE adapts the instance similarity presented in 
 * "Asymmetric and Context-Dependent Semantic Similarity among Ontology Instances. J. Data 
 * Semantics 10: 1-30 (2008)" into a linked data settings.
 *
 * Copyright (C) 2012  Riccardo Albertoni,  Monica De Martino 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
**/

package SSONDEv1;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Riccardo Albertoni
 * 
 * 
 */
public class AscendentClasses {

	private ArrayList <ArrayList<String>> tree;
	boolean brachesIteratorIsInizialized=false;
	//Iterator <ArrayList<String>> branchesIterator;
	//Iterator <String> classesIterator;
	
	public AscendentClasses (){
		tree=new  ArrayList <ArrayList<String>>();
	
	}

	/**
	 * @param c class that is checked as contained 
	 * @return true if the class c is contained in one of the  branches 
	 */
	public boolean contains(String c){
		boolean found=false;
		Iterator<ArrayList<String>> i= tree.iterator();
		while (i.hasNext() &&(!found)  ){
			if (i.next().contains(c)) found=true;
		}
		return found;
	}


	/**
	 * @return the iterator to the branches 
	 */
	public Iterator <ArrayList<String>> getBranchIterator(){
		return tree.iterator();

	}

	public Iterator <String> getSolutionIterator(){
		return null;
	}
	

}
