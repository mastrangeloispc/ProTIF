
package com.portfolio.protif.Interface;

import com.portfolio.protif.Entity.Persona;
import java.io.Serializable;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;

public interface IPersonaService {
        public List<Persona> getPersona();
        
        public void savePersona(Persona persona);
        
        public void deletePersona(Long id);
        
        public Persona findPersona(Long id);

    public void deletePersona(SingularAttribute<AbstractPersistable, Serializable> id);
                
}
