package com.barun.app.repo;

import com.barun.app.entity.ProgrammingLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguages, Long> {
    Optional<ProgrammingLanguages> findByProgrammingLanguage(String programmingLanguage);
    Optional<ProgrammingLanguages> findProgrammingLanguageByCreatorOfLanguage(String creatorOfLanguage);
}
