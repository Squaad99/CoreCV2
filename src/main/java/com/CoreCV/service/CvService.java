package com.CoreCV.service;

import com.CoreCV.entity.*;
import com.CoreCV.model.*;
import com.CoreCV.repository.CvRepository;
import com.CoreCV.repository.EducationRepository;
import com.CoreCV.repository.SkillCvRepository;
import com.CoreCV.repository.WorkplaceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CvService {

    private final CvRepository cvRepository;
    private final SkillCvRepository skillCvRepository;
    private final EducationRepository educationRepository;
    private final WorkplaceRepository workplaceRepository;

    public CvService(CvRepository cvRepository, SkillCvRepository skillCvRepository, EducationRepository educationRepository, WorkplaceRepository workplaceRepository) {
        this.cvRepository = cvRepository;
        this.skillCvRepository = skillCvRepository;
        this.educationRepository = educationRepository;
        this.workplaceRepository = workplaceRepository;
    }

    public FullCvModel insertCv(FullCvModel fullCvModel) {
        Cv cv = cvRepository.save(new Cv(fullCvModel));

        List<SkillCvModel> skillCvList = fullCvModel.getFullSkillList();
        for (SkillCvModel item : skillCvList) {
            skillCvRepository.save(new SkillCv(item.getName(), item.isExp1(), item.isExp2(), item.isExp3(), cv));
        }

        List<EducationModel> educationModelList = fullCvModel.getEducationList();
        for (EducationModel educationItem : educationModelList) {
            educationRepository.save(new Education(educationItem.getName(), educationItem.getStart(), educationItem.getEnd(), educationItem.getComment(), cv));
        }

        List<WorkplaceModel> workplaceModelList = fullCvModel.getWorkPlaceList();
        for (WorkplaceModel workPlaceItem : workplaceModelList) {
            workplaceRepository.save(new WorkPlace(workPlaceItem.getName(), workPlaceItem.getStart(), workPlaceItem.getEnd(), workPlaceItem.getComment(), cv));
        }
        return new FullCvModel(fullCvModel);
    }

    public List<FullCvViewModel> getAllCvs() {
        List<Cv> cvs = cvRepository.findAll();
        List<FullCvViewModel> cvModels = new ArrayList<>();
        List<SkillCv> fullSkillList = skillCvRepository.findAll();
        List<Education> fullEducationList = educationRepository.findAll();
        List<WorkPlace> fullWorkplaceList = workplaceRepository.findAll();

        for (Cv cv : cvs) {
            FullCvViewModel currentCvModel = new FullCvViewModel(cv);
            for (SkillCv skillCv : fullSkillList) {
                if (skillCv.getCv().getId().equals(cv.getId())) {
                    currentCvModel.getFullSkillList().add(new SkillCvModel(skillCv));
                }
            }
            for (Education education : fullEducationList) {
                if (education.getCv().getId().equals(cv.getId())) {
                    currentCvModel.getEducationList().add(new EducationModel(education));
                }
            }
            for (WorkPlace workPlace : fullWorkplaceList) {
                if (workPlace.getCv().getId().equals(cv.getId())) {
                    currentCvModel.getWorkPlaceList().add(new WorkplaceModel(workPlace));
                }
            }
            cvModels.add(currentCvModel);
        }

        Collections.reverse(cvModels);
        return cvModels;
    }

    public Cv updateCv(FullCvViewModel fullCvViewModel) {
        Cv cv = cvRepository.findOne(fullCvViewModel.getId());
        cv.setFullName(fullCvViewModel.getFullName());
        cv.setBirthYear(fullCvViewModel.getBirthYear());
        cv.setEmail(fullCvViewModel.getEmail());
        cv.setCvAddress(fullCvViewModel.getCvAddress());
        cv.setCvCountry(fullCvViewModel.getCvCountry());
        cv.setCity(fullCvViewModel.getCity());
        cv.setZipCode(fullCvViewModel.getZipCode());
        cv.setPhone(fullCvViewModel.getPhone());
        cv.setTitle(fullCvViewModel.getTitle());
        cv.setComment(fullCvViewModel.getComment());
        return cvRepository.save(cv);
    }


    public Education updateEducation(EducationModel educationModel) {
        Education education = educationRepository.findOne(educationModel.getId());
        education.setName(educationModel.getName());
        education.setStart(educationModel.getStart());
        education.setEnd(educationModel.getEnd());
        education.setComment(educationModel.getComment());
        education.setCv(educationModel.getCv());
        return educationRepository.save(education);
    }

    public WorkPlace updateWorkplace(WorkplaceModel workplaceModel) {
        WorkPlace workPlace = workplaceRepository.findOne(workplaceModel.getId());
        workPlace.setName(workplaceModel.getName());
        workPlace.setStart(workplaceModel.getStart());
        workPlace.setEnd(workplaceModel.getEnd());
        workPlace.setComment(workplaceModel.getComment());
        workPlace.setCv(workplaceModel.getCv());
        return workplaceRepository.save(workPlace);
    }

    public void deleteCv(Long cvId){
        cvRepository.delete(cvId);
    }

}
