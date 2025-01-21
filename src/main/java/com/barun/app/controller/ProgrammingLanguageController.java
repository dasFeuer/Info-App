package com.barun.app.controller;

import com.barun.app.dto.ProgrammingLanguageDto;
import com.barun.app.entity.ProgrammingLanguages;
import com.barun.app.service.ProgrammingLanguageServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/programmingLanguages")
public class ProgrammingLanguageController {

    @Autowired
    private ProgrammingLanguageServices programmingLanguageServices;

    @GetMapping
    public List<ProgrammingLanguages> getAllProgrammingLanguages(){
        return programmingLanguageServices.getAllProgrammingLanguages();
    }

    @GetMapping("/{programmingLanguageName}")
    public ResponseEntity<Optional<ProgrammingLanguages>> getProgrammingLanguageByItsName(
            @PathVariable("programmingLanguageName")
            String programmingLanguageName){
        Optional<ProgrammingLanguages> programmingLanguageByItsName = programmingLanguageServices.getProgrammingLanguageByItsName(programmingLanguageName);
        return ResponseEntity.ok(programmingLanguageByItsName);
    }

    @PostMapping("/creatorName")
    public Optional<ProgrammingLanguages> getProgrammingLanguageByCreatorName(
            @RequestBody ProgrammingLanguageDto programmingLanguageDto){
        String programmingLanguageByCreatorName = programmingLanguageDto.getCreatorOfLanguage();
       return programmingLanguageServices.getProgrammingLanguageByCreatorName(programmingLanguageByCreatorName);
    }

    @PostMapping("/createData")
    public ResponseEntity<ProgrammingLanguages> createData(@RequestBody ProgrammingLanguages programmingLanguages){
        ProgrammingLanguages languageData = programmingLanguageServices.createLanguageData(programmingLanguages);
        return ResponseEntity.ok(languageData);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProgrammingLanguages> updateProgrammingLanguage(@PathVariable Long id,
                                                                          @Valid @RequestBody ProgrammingLanguages programmingLanguage){
        ProgrammingLanguages updatedProgrammingLanguages = programmingLanguageServices.updateProgrammingLanguages(id, programmingLanguage);
        return ResponseEntity.ok(updatedProgrammingLanguages);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProgrammingLanguages> patchProgrammingLanguage(@PathVariable Long id,
                                                                          @Valid @RequestBody ProgrammingLanguages updates){
        ProgrammingLanguages patchProgrammingLanguages = programmingLanguageServices.patchProgrammingLanguages(id, updates);
        return ResponseEntity.ok(patchProgrammingLanguages);
    }

    @DeleteMapping("/deleteProgrammingLanguage/{id}")
    public void deleteProgrammingLanguagesById(@PathVariable Long id){
        programmingLanguageServices.deleteProgrammingLanguageById(id);
    }

    @DeleteMapping("/deleteAllProgrammingLanguages")
    public void deleteAllProgrammingLanguages(){
        programmingLanguageServices.deleteAllProgrammingLanguages();
    }
}
