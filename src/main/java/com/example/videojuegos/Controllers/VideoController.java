package com.example.videojuegos.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.videojuegos.models.Video;
import com.example.videojuegos.services.VideoServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Le decimos que va a ser una respuest de tipo REST
@RequestMapping("/videojuegos") //RUTA DONDE VAMOS A LLAMAR
public class VideoController {
    @Autowired
    VideoServices vidservice;

    @GetMapping()
    public ArrayList<Video> obtenerVideos(){
        return vidservice.obtenerVideos();
    }

    @PostMapping()
    public String guardarvide(@RequestBody Video video){
        return vidservice.guardarvide(video);
    }

    @GetMapping({"/{id}"})
    public Optional<Video> buscarid(@PathVariable("id") Long id){
        return vidservice.buscarid(id);
    }

    @PostMapping("search")
    public List<Video> buscarvideo(@RequestParam("query") String query){
         var datosvideoj = vidservice.buscarjuego(query);
         System.out.println(datosvideoj);
        return datosvideoj; 
    }

}
