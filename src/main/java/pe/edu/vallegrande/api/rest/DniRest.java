package pe.edu.vallegrande.api.rest;

import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.api.model.DniModel;
import pe.edu.vallegrande.api.service.DniService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/reniec/")
public class DniRest {
    private final DniService service;

    public DniRest(DniService service) {
        this.service = service;
    }

    @GetMapping("/listar/{estado}")
    public Flux<DniModel> listarPorEstado(@PathVariable String estado) {
        return service.listarPorEstado(estado);
    }

    @GetMapping("/ListaGeneral")
    public Flux<DniModel> getAllIpQueries() {
        return service.getAll();
    }

    @DeleteMapping("/inactivar/{id}")
    public Mono<String> deleteIp(@PathVariable Long id) {
        return service.deleteDni(id);
    }

    @PutMapping("/restaurar/{id}")
    public Mono<String> restoreIp(@PathVariable Long id) {
        return service.restoreDni(id);
    }

    @PostMapping("/consultar")
    public Mono<DniModel> consultarDni(@RequestParam String dni) {
        return service.consultarYGuardarDni(dni);
    }

    @PutMapping("/editar/{id}")
    public Mono<String> updateDni(@PathVariable Long id, @RequestParam String dni) {
        return service.updateDni(id, dni);
    }

}
