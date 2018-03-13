package Models;

import java.io.Serializable;

public class Compte implements Serializable {
	private int numCp;
	private String TypeCp;
	private int solde;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(int numCp, String typeCp, int solde) {
		super();
		this.numCp = numCp;
		TypeCp = typeCp;
		this.solde = solde;
	}
	public int getNumCp() {
		return numCp;
	}
	public void setNumCp(int numCp) {
		this.numCp = numCp;
	}
	public String getTypeCp() {
		return TypeCp;
	}
	public void setTypeCp(String typeCp) {
		TypeCp = typeCp;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	
}
