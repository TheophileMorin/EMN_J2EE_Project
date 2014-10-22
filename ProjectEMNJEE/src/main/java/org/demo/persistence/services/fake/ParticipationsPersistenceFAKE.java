/*
 * Created on 21 oct. 2014 ( Time 13:09:05 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package main.java.org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import main.java.org.demo.bean.jpa.ParticipationsEntity;
import main.java.org.demo.persistence.commons.fake.GenericFakeService;
import main.java.org.demo.persistence.services.ParticipationsPersistence;

/**
 * Fake persistence service implementation ( entity "Participations" )
 *
 * @author Telosys Tools Generator
 */
public class ParticipationsPersistenceFAKE extends GenericFakeService<ParticipationsEntity> implements ParticipationsPersistence {

	public ParticipationsPersistenceFAKE () {
		super(ParticipationsEntity.class);
	}
	
	protected ParticipationsEntity buildEntity(int index) {
		ParticipationsEntity entity = new ParticipationsEntity();
		// Init fields with mock values
		entity.setId( nextInteger() ) ;
		entity.setEmail( nextString() ) ;
		entity.setNom( nextString() ) ;
		entity.setPrenom( nextString() ) ;
		entity.setSociete( nextString() ) ;
		return entity ;
	}
	
	
	public boolean delete(ParticipationsEntity entity) {
		log("delete ( ParticipationsEntity : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( Integer id, String email ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(ParticipationsEntity entity) {
		log("insert ( ParticipationsEntity : " + entity + ")" ) ;
	}

	public ParticipationsEntity load( Integer id, String email ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<ParticipationsEntity> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<ParticipationsEntity> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<ParticipationsEntity> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public ParticipationsEntity save(ParticipationsEntity entity) {
		log("insert ( ParticipationsEntity : " + entity + ")" ) ;
		return entity;
	}

	public List<ParticipationsEntity> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

	public long countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
