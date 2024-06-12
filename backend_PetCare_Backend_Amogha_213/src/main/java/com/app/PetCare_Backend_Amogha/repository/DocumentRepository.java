package com.app.PetCare_Backend_Amogha.repository;

import com.app.PetCare_Backend_Amogha.model.Document;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class DocumentRepository extends SimpleJpaRepository<Document, String> {
    private final EntityManager em;
    public DocumentRepository(EntityManager em) {
        super(Document.class, em);
        this.em = em;
    }
    @Override
    public List<Document> findAll() {
        return em.createNativeQuery("Select * from \"petcare_backend_amogha\".\"Document\"", Document.class).getResultList();
    }
}