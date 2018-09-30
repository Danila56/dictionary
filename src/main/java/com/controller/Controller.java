package com.controller;

import com.model.WordsEntity;
import com.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
    private WordsService wordsService;
    @Autowired(required = true)
    @Qualifier("wordsService")
    public void setWordsService(WordsService wordsService) { this.wordsService = wordsService; }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("word", new WordsEntity());
        model.addAttribute("wordsList", wordsService.list());
        return "index";
    }

    @RequestMapping(value = "/addWord", method = RequestMethod.GET)
    public String addWord(WordsEntity wordsEntity){
        wordsService.add(wordsEntity);
        return "redirect:/";
    }
}
