package fr.kira.formation.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acteurs")
@CrossOrigin("*") // Allow all origins
public class ActeurController {
    private final ActeurRepository acteurRepository;

    public ActeurController(ActeurRepository acteurRepository) {
        this.acteurRepository = acteurRepository;
    }

    @GetMapping
    public List<Acteur> findAll() {
        return acteurRepository.findAll();
    }

    @PostMapping
    public Acteur save(@RequestBody Acteur entity) {
        return acteurRepository.save(entity);
    }

    @GetMapping("/{id}")
    public Optional<Acteur> findById(@PathVariable String id) {
        return acteurRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        acteurRepository.deleteById(id);
    }
}
