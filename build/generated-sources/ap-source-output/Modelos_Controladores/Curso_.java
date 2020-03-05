package Modelos_Controladores;

import Modelos_Controladores.AsignacionCurso;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-29T01:57:50")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> codigoCurso;
    public static volatile CollectionAttribute<Curso, AsignacionCurso> asignacionCursoCollection;
    public static volatile SingularAttribute<Curso, String> nombre;

}