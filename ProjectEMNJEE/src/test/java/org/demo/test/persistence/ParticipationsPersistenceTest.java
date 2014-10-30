/*
 * Created on 29 oct. 2014 ( Time 23:42:22 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package test.java.org.demo.test.persistence;


import main.java.org.demo.bean.jpa.ParticipationsEntity;
import main.java.org.demo.mock.ParticipationsEntityMock;
import main.java.org.demo.persistence.PersistenceServiceProvider;
import main.java.org.demo.persistence.services.ParticipationsPersistence;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test case for Participations persistence service
 * 
 * @author Telosys Tools Generator
 *
 */
public class ParticipationsPersistenceTest 
{
	@Test
	public void test1() {
		
		System.out.println("Test count ..." );
		
		ParticipationsPersistence service = PersistenceServiceProvider.getService(ParticipationsPersistence.class);
		System.out.println("CountAll = " + service.countAll() );
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test Participations persistence : delete + load ..." );
		
		ParticipationsPersistence service = PersistenceServiceProvider.getService(ParticipationsPersistence.class);
		
		ParticipationsEntityMock mock = new ParticipationsEntityMock();
		
		// TODO : set primary key values here 
		process( service, mock, 0  );
		// process( service, mock, ... );
	}

	private void process(ParticipationsPersistence service, ParticipationsEntityMock mock, Integer id ) {
		System.out.println("----- "  );
		System.out.println(" . load : " );
		ParticipationsEntity entity = service.load( id );
		if ( entity != null ) {
			// Found 
			System.out.println("   FOUND : " + entity );
			
			// Save (update) with the same values to avoid database integrity errors  
			System.out.println(" . save : " + entity );
			service.save(entity);
			System.out.println("   saved : " + entity );
		}
		else {
			// Not found 
			System.out.println("   NOT FOUND" );
			// Create a new instance 
			entity = mock.createInstance( id ) ;
			Assert.assertNotNull(entity);

			// This entity references the following entities : 
			// . Events
			/* Insert only if references are OK
			// Try to insert the new instance
			System.out.println(" . insert : " + entity );
			service.insert(entity);
			System.out.println("   inserted : " + entity );
			*/

			System.out.println(" . delete : " );
			boolean deleted = service.delete( id );
			System.out.println("   deleted = " + deleted);
		}		
	}
}
