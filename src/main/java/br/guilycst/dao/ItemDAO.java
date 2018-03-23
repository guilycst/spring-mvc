package br.guilycst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.guilycst.model.Item;

@Repository //Enables for DI
@Transactional
public class ItemDAO {
	
	@PersistenceContext
    private EntityManager manager;
	
	public void save(Item item) {
		manager.persist(item);
	}

}
