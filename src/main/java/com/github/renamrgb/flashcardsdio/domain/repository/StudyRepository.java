package com.github.renamrgb.flashcardsdio.domain.repository;

import com.github.renamrgb.flashcardsdio.domain.document.StudyDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends ReactiveMongoRepository<StudyDocument, String> {
}
