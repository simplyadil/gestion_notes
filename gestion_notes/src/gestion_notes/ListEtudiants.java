package gestion_notes;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<etudiant> {
	
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//redefinition de add
public boolean add(etudiant e) {
	   if(this.indexOf(e)>0) {
		   int i=indexOf(e);
		   super.set(i, e);
		   return false;
	   }
	return super.add(e);
   }

//methode filtrer
  public ListEtudiants filtrer(Condition c){
	  if (c.estVrai(e)) {
		  
	  }
  }