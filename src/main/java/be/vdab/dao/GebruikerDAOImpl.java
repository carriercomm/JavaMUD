/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
    
package be.vdab.dao;
    
import be.vdab.entities.Gebruiker;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tim Van den Langenbergh (tmtvl)
 * @version 1.0: 30-09-2013(tmtvl): Initial version.
 */
@Repository
public class GebruikerDAOImpl implements GebruikerDAO {
    public static List<Gebruiker> gebruikers = new ArrayList<>();
    
    public GebruikerDAOImpl(){
        // TODO: Add gebruikers
    }
    
    @Override
    public void create(Gebruiker gebruiker){
        gebruikers.add(gebruiker);
    }
    
    @Override
    public Gebruiker read(long id){
        return null;
    }
    
    @Override
    public void update(Gebruiker gebruiker){
        
    }
    
    @Override
    public void delete(long id){
        
    }
    
    @Override
    public Gebruiker findByEmail(String email){
        return null;
    }
    
    @Override
	public Gebruiker inloggen(long gebruikerId) {
		// TODO Auto-generated method stub
		return null;
	}
}
