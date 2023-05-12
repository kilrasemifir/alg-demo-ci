package fr.kira.formation.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActeurRepository extends MongoRepository<Acteur, String> {
}
