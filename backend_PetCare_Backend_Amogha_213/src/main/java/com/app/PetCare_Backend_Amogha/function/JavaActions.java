package com.app.PetCare_Backend_Amogha.function;

import com.app.PetCare_Backend_Amogha.model.Manager;
import com.app.PetCare_Backend_Amogha.model.Pet;
import com.app.PetCare_Backend_Amogha.model.PetCareCenter;
import com.app.PetCare_Backend_Amogha.model.PetOwner;
import com.app.PetCare_Backend_Amogha.model.Document;
import com.app.PetCare_Backend_Amogha.model.PetService;




import com.app.PetCare_Backend_Amogha.enums.PetServiceType;
import com.app.PetCare_Backend_Amogha.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  