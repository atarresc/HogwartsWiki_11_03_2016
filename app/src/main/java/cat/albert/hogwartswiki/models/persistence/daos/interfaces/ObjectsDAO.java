package cat.albert.hogwartswiki.models.persistence.daos.interfaces;

import java.util.List;

import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.models.business.entities.Spell;

/**
 * Created by albert on 01/03/2016.
 */
public interface ObjectsDAO {
    Object getById(long id);
    List<Object> getAll();
    boolean save(Object object);
    boolean update(Object object);
    boolean delete(Object object);
}