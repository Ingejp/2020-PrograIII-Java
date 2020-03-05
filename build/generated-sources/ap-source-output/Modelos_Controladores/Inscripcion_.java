package Modelos_Controladores;

import Modelos_Controladores.Alumno;
import Modelos_Controladores.AsignacionCurso;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-29T01:57:50")
@StaticMetamodel(Inscripcion.class)
public class Inscripcion_ { 

    public static volatile SingularAttribute<Inscripcion, Integer> idinscripcion;
    public static volatile CollectionAttribute<Inscripcion, AsignacionCurso> asignacionCursoCollection;
    public static volatile SingularAttribute<Inscripcion, Alumno> alumnonumerocarne;
    public static volatile SingularAttribute<Inscripcion, Date> fechaInscripcion;

}