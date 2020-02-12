package com.pratikadrian.controler;

import com.pratikadrian.model.*;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Ciclos ciclo = JAXB.unmarshal("http://gencat.cat/llengua/cinema/cicles.xml", Ciclos.class);
        Cines cines = JAXB.unmarshal("http://gencat.cat/llengua/cinema/cinemes.xml", Cines.class);
        Peliculas peliculas = JAXB.unmarshal("http://gencat.cat/llengua/cinema/provacin.xml", Peliculas.class);
        Sessiones session = JAXB.unmarshal("http://gencat.cat/llengua/cinema/film_sessions.xml", Sessiones.class);
        System.out.println(session);
    }
}
