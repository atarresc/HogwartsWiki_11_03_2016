package cat.albert.hogwartswiki.models.persistence.daos.interfaces;

import java.util.List;

import cat.albert.hogwartswiki.models.business.entities.Spell;

/**
 * Created by albert on 01/03/2016.
 */
public interface SpellsDAO {
    Spell getById(long id);
    List<Spell> getAll();
    boolean save(Spell spell);
    boolean update(Spell spell);
    boolean delete(Spell spell);
}