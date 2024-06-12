package com.app.PetCare_Backend_Amogha.function;

import com.app.PetCare_Backend_Amogha.model.Manager;
import com.app.PetCare_Backend_Amogha.model.Pet;
import com.app.PetCare_Backend_Amogha.model.PetCareCenter;
import com.app.PetCare_Backend_Amogha.model.PetOwner;
import com.app.PetCare_Backend_Amogha.model.Document;
import com.app.PetCare_Backend_Amogha.model.PetService;
import com.app.PetCare_Backend_Amogha.enums.PetServiceType;
import com.app.PetCare_Backend_Amogha.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.PetCare_Backend_Amogha.repository.PetServiceRepository;
import com.app.PetCare_Backend_Amogha.repository.PetOwnerRepository;
import com.app.PetCare_Backend_Amogha.repository.PetCareCenterRepository;
import com.app.PetCare_Backend_Amogha.repository.ManagerRepository;
import com.app.PetCare_Backend_Amogha.repository.DocumentRepository;
import com.app.PetCare_Backend_Amogha.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
