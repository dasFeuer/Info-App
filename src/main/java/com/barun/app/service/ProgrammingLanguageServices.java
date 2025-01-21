package com.barun.app.service;

import com.barun.app.entity.ProgrammingLanguages;
import com.barun.app.repo.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammingLanguageServices {
    @Autowired
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public List<ProgrammingLanguages> getAllProgrammingLanguages(){
        return programmingLanguageRepository.findAll();
    }

    public Optional<ProgrammingLanguages> getProgrammingLanguageByItsName(String programmingLanguageName){
        return programmingLanguageRepository.findByProgrammingLanguage(programmingLanguageName);
    }

    public Optional<ProgrammingLanguages> getProgrammingLanguageByCreatorName(String creatorName){
        return programmingLanguageRepository.findProgrammingLanguageByCreatorOfLanguage(creatorName);
    }

    public ProgrammingLanguages createLanguageData(ProgrammingLanguages programmingLanguages){
        return programmingLanguageRepository.save(programmingLanguages);
    }

    public ProgrammingLanguages updateProgrammingLanguages(Long id, ProgrammingLanguages programmingLanguage){
        ProgrammingLanguages programmingLanguages = programmingLanguageRepository.findById(id)
                .orElseThrow();
        programmingLanguages.setProgrammingLanguage(programmingLanguage.getProgrammingLanguage());
        programmingLanguages.setCreatorOfLanguage(programmingLanguage.getCreatorOfLanguage());
        programmingLanguages.setInventedIn(programmingLanguage.getInventedIn());
        programmingLanguages.setLanguageDetailsAndUserFor(programmingLanguage.getLanguageDetailsAndUserFor());
        return programmingLanguageRepository.save(programmingLanguages);
    }

    public ProgrammingLanguages patchProgrammingLanguages(Long id, ProgrammingLanguages updates){
        ProgrammingLanguages existingProgrammingLanguages = programmingLanguageRepository.findById(id)
                .orElseThrow();
        if(updates.getProgrammingLanguage() != null){
            existingProgrammingLanguages.setProgrammingLanguage(updates.getProgrammingLanguage());
        }
        if(updates.getCreatorOfLanguage() != null){
            existingProgrammingLanguages.setCreatorOfLanguage(updates.getCreatorOfLanguage());
        }
        if(updates.getInventedIn() != null){
            existingProgrammingLanguages.setInventedIn(updates.getInventedIn());
        }
        if(updates.getLanguageDetailsAndUserFor() != null){
            existingProgrammingLanguages.setLanguageDetailsAndUserFor(updates.getLanguageDetailsAndUserFor());
        }
        return programmingLanguageRepository.save(existingProgrammingLanguages);
    }

    public void deleteProgrammingLanguageById(Long id){
        programmingLanguageRepository.deleteById(id);
    }

    public void deleteAllProgrammingLanguages(){
        programmingLanguageRepository.deleteAll();
    }
}
