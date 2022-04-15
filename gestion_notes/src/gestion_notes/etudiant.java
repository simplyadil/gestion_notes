package gestion_notes;

public class etudiant implements  Comparable<etudiant>{
     private int id;
     private String nom;
     private double note;
     
     etudiant ( int I, String N){
    	 this.note=10;
    	 this.id=I;
    	 this.nom=N;
     }
public String toString() {
	return this.nom +" : "+this.note;
  }


public boolean equals(etudiant obj) {
	if(this.id==obj.id) {
		return true;
	}else {
		return false;
	}
  }
public int compareTo(etudiant e) {
	if (this.note>=e.note) return 1;
	if (this.note==e.note) return 0;
}
