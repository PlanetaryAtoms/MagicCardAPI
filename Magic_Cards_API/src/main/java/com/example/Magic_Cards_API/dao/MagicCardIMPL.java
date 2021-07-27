package com.example.Magic_Cards_API.dao;

import com.example.Magic_Cards_API.entity.MagicCard;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

//Call the Repository Annotation
@Repository
public class MagicCardIMPL implements MagicCardDAO {

    private final EntityManager entityManager;

    //Dependency Injection
    @Autowired
    public MagicCardIMPL(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional //Makes a transaction possible
    public List<MagicCard> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query myQuery = currentSession.createQuery("from MagicCard");
        return myQuery.getResultList();
    }


    @Override
    @Transactional
    public Object findById(int cardId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(MagicCard.class, cardId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(MagicCard magic_card) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(magic_card);
    }

    @Override
    @Transactional
    public void deleteById(int cardId) {
        Session currentSession = entityManager.unwrap(Session.class);
        MagicCard myMagicCard = currentSession.get(MagicCard.class, cardId);
        currentSession.delete(myMagicCard);
    }
}
