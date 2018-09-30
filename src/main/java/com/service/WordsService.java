package com.service;

import com.dao.WordsDAO;
import com.model.WordsEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WordsService {
    private WordsDAO wordsDAO;
    public void setWordsDAO(WordsDAO wordsDAO) {
        this.wordsDAO = wordsDAO;
    }

    @Transactional
    public List<WordsEntity> list(){
        return wordsDAO.list();
    }

    @Transactional
    public void add(WordsEntity wordsEntity){
        wordsDAO.addWord(wordsEntity);
    }
}
