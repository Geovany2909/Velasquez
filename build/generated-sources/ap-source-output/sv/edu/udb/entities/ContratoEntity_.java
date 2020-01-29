package sv.edu.udb.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.udb.entities.UsuarioEntity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-28T22:47:44")
@StaticMetamodel(ContratoEntity.class)
public class ContratoEntity_ { 

    public static volatile SingularAttribute<ContratoEntity, Date> fechaInicio;
    public static volatile SingularAttribute<ContratoEntity, UsuarioEntity> medico;
    public static volatile SingularAttribute<ContratoEntity, Integer> id;
    public static volatile SingularAttribute<ContratoEntity, Date> fechaFin;

}