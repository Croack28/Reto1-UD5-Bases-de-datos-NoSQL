package com.example.accessingmongodbdatarest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "personas", path = "personas")
public interface PersonaRepository extends MongoRepository<Persona, String> {

  List<Persona> findByApellidos(@Param("apellidos") String apellidos);

}