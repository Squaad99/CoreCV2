package com.CoreCV.service;

import com.CoreCV.entity.Cv;
import com.CoreCV.entity.SkillCv;
import com.CoreCV.model.FullCvModel;
import com.CoreCV.model.SkillCvModel;
import com.CoreCV.repository.SkillCvRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillCvService {

    public SkillCvService(SkillCvRepository skillCvRepository) {
        this.skillCvRepository = skillCvRepository;
    }

    private final SkillCvRepository skillCvRepository;


    public void insertSkillList(FullCvModel inFullCvModel, Cv cv) {
        List<SkillCvModel> skillList = inFullCvModel.getFullSkillList();
        for(SkillCvModel skillItem: skillList){
            skillCvRepository.save(new SkillCv(skillItem.getName(), skillItem.isExp1(), skillItem.isExp2(), skillItem.isExp3(), cv));
        }
    }

}
