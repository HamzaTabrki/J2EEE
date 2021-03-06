package Metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.PreparedStatement;
import Models.Compte;
public class CompteMetier extends UnicastRemoteObject implements ICompteMetier {
	private Connection con=null;
	private PreparedStatement st=null;
	private ResultSet rs=null;
	public CompteMetier() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		con=SingletonConnection.getConnection();
	}

	@Override
	public ArrayList<Compte> AfficheListe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AjouterCompte(Compte c) throws RemoteException {
		// TODO Auto-generated method stub
		try {
		st=(PreparedStatement) con.prepareStatement("insert into compte (NumCp,TypeCp,Solde) Value (?,?,?)");
		st.setInt(1, c.getNumCp());
		st.setString(2, c.getTypeCp());
		st.setInt(3, c.getSolde());
		st.executeUpdate();
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public void RechercherParNumC(int code) throws RemoteException {
		// TODO Auto-generated method stub
		Compte c=null;
		try {
			st=(PreparedStatement) con.prepareStatement("Select * From compte Where NumCp=?");
			st.setInt(1, code);
			rs=st.executeQuery();
			if(rs.next()) {
				c=new Compte();
				c.setNumCp(rs.getInt("NumCp"));
				c.setTypeCp(rs.getString("TypeCp"));
				c.setSolde(rs.getInt("Solde"));
			
			}
		}catch(Exception ex) {
			
		}
	}

	@Override
	public ArrayList<Compte> AfficheparNum(int cp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ModifierCompte(Compte c) throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModifierSoldeCompte(int solde, int Compte) {
		// TODO Auto-generated method stub
		
	}
	
}
