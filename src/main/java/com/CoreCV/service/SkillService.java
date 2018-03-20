package com.CoreCV.service;

import com.CoreCV.entity.Skill;
import com.CoreCV.entity.Title;
import com.CoreCV.model.SkillModel;
import com.CoreCV.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public SkillModel insertSkill(SkillModel skillModel){
        Skill skill = skillRepository.save(new Skill(skillModel));
        return new SkillModel(skill);
    }

    public List<SkillModel> getAllSkills() {
        List<Skill> skills = skillRepository.findAll();
        List<SkillModel> userModels = new ArrayList<>();
        for(Skill skill: skills) {
            userModels.add(new SkillModel(skill));
        }
        return userModels;
    }


    public void deleteSkill(Long skillId) {
        skillRepository.delete(skillId);
    }


}
