package com.CoreCV.service;

import com.CoreCV.entity.Title;
import com.CoreCV.model.TitleModel;
import com.CoreCV.repository.TitleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TitleService {

    private final TitleRepository titleRepository;

    public TitleService(TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }


    public TitleModel insertTitle(TitleModel titleModel){
        Title title = titleRepository.save(new Title(titleModel));
        return new TitleModel(title);

    }

    public List<TitleModel> getAllTitles() {
        List<Title> titles = titleRepository.findAll();
        List<TitleModel> titleModels = new ArrayList<>();
        for(Title title: titles) {
            titleModels.add(new TitleModel(title));
        }
        return titleModels;
    }


    public void deleteTitle(Long TitleId) {
        titleRepository.delete(TitleId);
    }


}
