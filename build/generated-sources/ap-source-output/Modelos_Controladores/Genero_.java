package Modelos_Controladores;

import Modelos_Controladores.Alumno;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-29T01:57:50")
@StaticMetamodel(Genero.class)
public class Genero_ { 

    public static volatile SingularAttribute<Genero, String> descripcion;
    public static volatile CollectionAttribute<Genero, Alumno> alumnoCollection;
    public static volatile SingularAttribute<Genero, Integer> idgenero;

}