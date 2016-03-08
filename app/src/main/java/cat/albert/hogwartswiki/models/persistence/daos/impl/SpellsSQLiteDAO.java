package cat.albert.hogwartswiki.models.persistence.daos.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cat.albert.hogwartswiki.models.business.entities.Spell;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.SpellsDAO;

import cat.albert.hogwartswiki.models.persistence.utilities.SQLiteUtils;
/**
 * Created by albert on 01/03/2016.
 */
public class SpellsSQLiteDAO implements SpellsDAO {

    private Context context;

    public SpellsSQLiteDAO(Context context) {
        this.context = context;
    }

    @Override
    public Spell getById(long id) {
        Spell spell = null;
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Spells",
                new String[]{"imatge","spellname", "spellimpact"},
                "codi = ?", new String[]{String.valueOf(id)}, null, null, null, null, null);

        spell = SQLiteUtils.getSpell(result);
        conn.close();

        return spell;
    }

    @Override
    public List<Spell> getAll() {
        List<Spell> spells = new ArrayList<>();

        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Spells",
                new String[]{"imatge","spellname", "spellimpact"},
                null, null, null, null, null, null, null);
        while (result.moveToNext()) {
            spells.add(SQLiteUtils.getSpell(result));
        }

        conn.close();

        return spells;
    }

    @Override
    public boolean save(Spell spell) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("imatge", spell.getImatge());
        dades.put("spellname", spell.getSpellName());
        dades.put("spellimpact", spell.getSpellImpact());


        try{
            long index = conn.insertOrThrow("Spells",null,dades);
            return true;

        }catch(SQLException e){
            Log.e("Spells", e.getMessage());
            return false;
        }

    }

    @Override
    public boolean update(Spell spell) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("imatge", spell.getImatge());
        dades.put("spellname", spell.getSpellName());
        dades.put("spellimpact", spell.getSpellImpact());

        return conn.update("Spells", dades, "codi = ?", new String[] {String.valueOf(spell.getCodi())}) > 0;
    }

    @Override
    public boolean delete(Spell spell) {
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        return conn.delete("Spell", "codi = ?", new String[] {String.valueOf(spell.getCodi())})> 0;
    }
}