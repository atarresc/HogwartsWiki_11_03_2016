package cat.albert.hogwartswiki.models.persistence.daos.interfaces;

import java.util.List;

import cat.albert.hogwartswiki.models.business.entities.Character;

/**
 * Created by albert on 01/03/2016.
 */
public interface CharactersDAO {
    Character getById(long id);
    List<Character> getAll();
    boolean save(Character character);
    boolean update(Character character);
    boolean delete(Character character);
}
