package fr.kira.formation.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data
public class Acteur {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private List<String> roles = new ArrayList<>();
}
