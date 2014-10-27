/*
 * Created on 27 oct. 2014 ( Time 14:32:44 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a composite Primary Key  


package main.java.org.demo.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "PARTICIPATIONS"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="PARTICIPATIONS", schema="APP" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ParticipationsEntity.countAll", query="SELECT COUNT(x) FROM ParticipationsEntity x" )
} )
public class ParticipationsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private ParticipationsEntityKey compositePrimaryKey ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="NOM", nullable=false, length=100)
    private String     nom          ;

    @Column(name="PRENOM", nullable=false, length=100)
    private String     prenom       ;

    @Column(name="SOCIETE", length=255)
    private String     societe      ;

	// "fkEvent" (column "FK_EVENT") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="FK_EVENT", referencedColumnName="ID")
    private EventsEntity events      ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ParticipationsEntity() {
		super();
		this.compositePrimaryKey = new ParticipationsEntityKey();       
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE COMPOSITE KEY 
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.compositePrimaryKey.setId( id ) ;
    }
    public Integer getId() {
        return this.compositePrimaryKey.getId() ;
    }
    public void setEmail( String email ) {
        this.compositePrimaryKey.setEmail( email ) ;
    }
    public String getEmail() {
        return this.compositePrimaryKey.getEmail() ;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : NOM ( VARCHAR ) 
    public void setNom( String nom ) {
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }

    //--- DATABASE MAPPING : PRENOM ( VARCHAR ) 
    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }
    public String getPrenom() {
        return this.prenom;
    }

    //--- DATABASE MAPPING : SOCIETE ( VARCHAR ) 
    public void setSociete( String societe ) {
        this.societe = societe;
    }
    public String getSociete() {
        return this.societe;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setEvents( EventsEntity events ) {
        this.events = events;
    }
    public EventsEntity getEvents() {
        return this.events;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        if ( compositePrimaryKey != null ) {  
            sb.append(compositePrimaryKey.toString());  
        }  
        else {  
            sb.append( "(null-key)" ); 
        }  
        sb.append("]:"); 
        sb.append(nom);
        sb.append("|");
        sb.append(prenom);
        sb.append("|");
        sb.append(societe);
        return sb.toString(); 
    } 

}
