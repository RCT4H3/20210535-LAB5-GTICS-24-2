package com.example.lab3_20210535.controller;

import com.example.lab3_20210535.entity.lugares;
import com.example.lab3_20210535.entity.mascotas;
import com.example.lab3_20210535.entity.persona;
import com.example.lab3_20210535.entity.viajes;
import com.example.lab3_20210535.repository.LugaresRepository;
import com.example.lab3_20210535.repository.MascotasRepository;
import com.example.lab3_20210535.repository.PersonaRepository;
import com.example.lab3_20210535.repository.ViajesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class viajesController {
    final MascotasRepository mascotasRepository;
    final LugaresRepository lugaresRepository;
    final PersonaRepository personaRepository;
    final ViajesRepository viajesRepository;

    public viajesController(MascotasRepository mascotasRepository, LugaresRepository lugaresRepository, PersonaRepository personaRepository, ViajesRepository viajesRepository) {
        this.mascotasRepository = mascotasRepository;
        this.lugaresRepository = lugaresRepository;
        this.personaRepository = personaRepository;
        this.viajesRepository = viajesRepository;
    }

    @GetMapping("/")
    public String vistaPrincial(){
        return "vistaPrincipal";
    }

    @GetMapping("/listaViajes")
    public String listaViajes(Model model){
        List<viajes> listaViajes = viajesRepository.findAll();
        model.addAttribute("listaViajes",listaViajes);
        return "listaViajes";
    }

    @GetMapping("/listaMascotas")
    public String listaMascotas(Model model){
        List<mascotas> listaMascotas = mascotasRepository.findAll();
        model.addAttribute("listaMascotas",listaMascotas);
        return "listaMascotas";
    }

    @GetMapping("/listaLugares")
    public String listaLugares(Model model){
        List<lugares> listaLugares = lugaresRepository.findAll();
        model.addAttribute("listaLugares",listaLugares);
        return "listaLugares";
    }

    @GetMapping("/nuevoViaje")
    public String nuevoViaje(Model model){
        List<lugares> listaLugares = lugaresRepository.findAll();
        List<persona> listaPersona = personaRepository.findAll();
        model.addAttribute("listaPersonas", listaPersona);
        model.addAttribute("listaLugares", listaLugares);
        return "nuevoViaje";
    }
    @PostMapping("/crearViaje")
    public String crearViaje(viajes viajes){
        viajesRepository.save(viajes);

        return "redirect:/listaViajes";
    }

    @GetMapping("/nuevoMascota")
    public String nuevoMascota(Model model){
        List<lugares> listaLugares = lugaresRepository.findAll();
        List<persona> listaPersona = personaRepository.findAll();
        model.addAttribute("listaPersonas", listaPersona);
        model.addAttribute("listaLugares", listaLugares);
        return "nuevoMascota";
    }

    @GetMapping("/borrarMascota/{id}")
    public String borrarMascota(@PathVariable int id){
        mascotasRepository.deleteById(id);
        return "redirect:/listaMascotas";
    }

}
