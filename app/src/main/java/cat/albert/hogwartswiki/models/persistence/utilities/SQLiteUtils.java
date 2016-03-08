package cat.albert.hogwartswiki.models.persistence.utilities;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.models.business.entities.Place;
import cat.albert.hogwartswiki.models.business.entities.Spell;

/**
 * Created by albert on 01/03/2016.
 */
public class SQLiteUtils {
    static final String NOM_BD = "Characters.db";
    static final int VERSIO_BD =3;

    public static SQLiteDatabase getConnection(Context context) {

        return new CharactersSQLiteHelper(context, NOM_BD, null, VERSIO_BD).getWritableDatabase();
    }

    public static Character getCharacter(Cursor reader) {
        Character character = new Character();

        character.setImatge(reader.getInt(reader.getColumnIndex("imatge")));
        character.setFirstName(reader.getString(reader.getColumnIndex("firstname")));
        character.setLastName(reader.getString(reader.getColumnIndex("lastname")));
        character.setFamily(reader.getString(reader.getColumnIndex("family")));

        return character;

    }

    public static Place getPlace(Cursor reader) {
        Place place = new Place();

        place.setImatge(reader.getInt(reader.getColumnIndex("imatge")));
        place.setPlaceName(reader.getString(reader.getColumnIndex("placename")));
        place.setPlaceSecurityLevel(reader.getString(reader.getColumnIndex("placesecuritylevel")));

        return place;

    }


    public static Spell getSpell(Cursor reader) {
        Spell spell = new Spell();

        spell.setImatge(reader.getInt(reader.getColumnIndex("imatge")));
        spell.setSpellName(reader.getString(reader.getColumnIndex("spellname")));
        spell.setSpellImpact(reader.getString(reader.getColumnIndex("spellimpact")));

        return spell;
    }

    public static Object getObject(Cursor reader) {
        Object object = new Object();

        object.setImatge(reader.getInt(reader.getColumnIndex("imatge")));
        object.setObjectName(reader.getString(reader.getColumnIndex("objectname")));
        object.setObjectInfo(reader.getString(reader.getColumnIndex("objectinfo")));

        return object;
    }
}

