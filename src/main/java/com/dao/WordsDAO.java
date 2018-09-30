package com.dao;

import com.model.WordsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WordsDAO {
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<WordsEntity> list(){
        Session session = this.sessionFactory.getCurrentSession();
        List<WordsEntity> list = session.createQuery("from WordsEntity").list();
        return list;
    }

    public void addWord(WordsEntity wordsEntity){
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(wordsEntity);
    }
}
