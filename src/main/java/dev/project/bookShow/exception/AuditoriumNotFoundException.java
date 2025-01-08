package dev.project.bookShow.exception;

import dev.project.bookShow.model.Auditorium;

public class AuditoriumNotFoundException extends RuntimeException{

    public AuditoriumNotFoundException(){

    }

    public AuditoriumNotFoundException(String message){
        super(message);
    }

}
