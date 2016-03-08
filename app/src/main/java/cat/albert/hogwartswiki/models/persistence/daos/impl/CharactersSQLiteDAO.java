package cat.albert.hogwartswiki.models.persistence.daos.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.CharactersDAO;

import cat.albert.hogwartswiki.models.persistence.utilities.SQLiteUtils;
/**
 * Created by albert on 01/03/2016.
 */
public class CharactersSQLiteDAO implements CharactersDAO {

    private Context context;

    public CharactersSQLiteDAO(Context context) {
        this.context = context;
    }

    @Override
    public Character getById(long id) {
        Character character = null;
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Characters",
                new String[]{"imatge", "firstname", "lastname", "family"},
                "codi = ?", new String[]{String.valueOf(id)}, null, null, null, null, null);

        character = SQLiteUtils.getCharacter(result);
        conn.close();

        return character;
    }

    @Override
    public List<Character> getAll() {
        List<Character> characters = new ArrayList<>();

        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Characters",
                new String[]{"imatge", "firstname", "lastname", "family"},
                null, null, null, null, null, null, null);
        while (result.moveToNext()) {
            characters.add(SQLiteUtils.getCharacter(result));
        }

        conn.close();

        return characters;
    }

    @Override
    public boolean save(Character character) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("imatge", character.getImatge());
        dades.put("firstname", character.getFirstName());
        dades.put("lastname", character.getLastName());
        dades.put("family", character.getFamily());


        try{
            long index = conn.insertOrThrow("Characters",null,dades);
            return true;

        }catch(SQLException e){
            Log.e("Characters", e.getMessage());
            return false;
        }

    }

    @Override
    public boolean update(Character character) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("imatge", character.getImatge());
        dades.put("firstname", character.getFirstName());
        dades.put("lastname", character.getLastName());
        dades.put("family", character.getFamily());

        return conn.update("Characters", dades, "codi = ?", new String[] {String.valueOf(character.getCodi())}) > 0;
    }

    @Override
    public boolean delete(Character character) {
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        return conn.delete("Characters", "codi = ?", new String[] {String.valueOf(character.getCodi())})> 0;
    }
}
