package com.github.renamrgb.flashcardsdio.domain.repository;

import com.github.renamrgb.flashcardsdio.domain.document.DeckDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends ReactiveMongoRepository<DeckDocument, String> {
}
