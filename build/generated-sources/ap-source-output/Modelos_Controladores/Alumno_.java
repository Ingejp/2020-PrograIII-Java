package Modelos_Controladores;

import Modelos_Controladores.Genero;
import Modelos_Controladores.Inscripcion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-29T01:57:50")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, Integer> numeroCarne;
    public static volatile SingularAttribute<Alumno, String> apellido;
    public static volatile SingularAttribute<Alumno, String> correo;
    public static volatile SingularAttribute<Alumno, Genero> generoIdgenero;
    public static volatile SingularAttribute<Alumno, String> direccion;
    public static volatile SingularAttribute<Alumno, String> telefono;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile CollectionAttribute<Alumno, Inscripcion> inscripcionCollection;

}