package cat.albert.hogwartswiki.models.persistence.daos.interfaces;

import java.util.List;

import cat.albert.hogwartswiki.models.business.entities.Place;

/**
 * Created by albert on 01/03/2016.
 */
public interface PlacesDAO {
    Place getById(long id);
    List<Place> getAll();
    boolean save(Place place);
    boolean update(Place place);
    boolean delete(Place place);
}
