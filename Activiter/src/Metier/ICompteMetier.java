package Metier;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Models.*;
public interface ICompteMetier {
public ArrayList<Compte> AfficheListe();
public void AjouterCompte(Compte c) throws RemoteException;
public void RechercherParNumC(int code) throws RemoteException;
public ArrayList<Compte>AfficheparNum(int cp);
public void ModifierCompte(Compte c)throws RuntimeException;
public void ModifierSoldeCompte(int solde,int Compte);
}