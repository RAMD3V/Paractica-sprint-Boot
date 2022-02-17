package com.example.videojuegos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.videojuegos.models.Video;
import com.example.videojuegos.repositories.VideoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // VA A SER DE TIPO SERVICE Hace referencia a servicio....OSEA VAMOS A USAR UN SERVICIO. 
public class VideoServices {
   @Autowired // Inyectabamos dependencias. 
   VideoRepository VideoRepo; // Repositorio Usuario.


   public ArrayList<Video> obtenerVideos(){
               return (ArrayList<Video>) VideoRepo.findAll();
   }

   public String guardarvide(Video video){
        VideoRepo.save(video);
       return "guardado correctamente";
   }

    public Optional<Video> buscarid(Long id){
       return VideoRepo.findById(id);
    }
    public List buscarjuego(String dato){
        List <Video> datosvideoj = VideoRepo.buscarpvideo(dato);
         return datosvideoj;
    }
 

    
}