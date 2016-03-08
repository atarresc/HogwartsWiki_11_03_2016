package cat.albert.hogwartswiki.models.persistence.daos.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cat.albert.hogwartswiki.models.business.entities.Place;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.PlacesDAO;

import cat.albert.hogwartswiki.models.persistence.utilities.SQLiteUtils;
/**
 * Created by albert on 01/03/2016.
 */
public class PlacesSQLiteDAO implements PlacesDAO {

    private Context context;

    public PlacesSQLiteDAO(Context context) {
        this.context = context;
    }

    @Override
    public Place getById(long id) {
        Place place = null;
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Places",
                new String[]{"imatge","placename", "placesecuritylevel"},
                "codi = ?", new String[]{String.valueOf(id)}, null, null, null, null, null);

        place = SQLiteUtils.getPlace(result);
        conn.close();

        return place;
    }

    @Override
    public List<Place> getAll() {
        List<Place> places = new ArrayList<>();

        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Places",
                new String[]{"imatge","placename", "placesecuritylevel"},
                null, null, null, null, null, null, null);
        while (result.moveToNext()) {
            places.add(SQLiteUtils.getPlace(result));
        }

        conn.close();

        return places;
    }

    @Override
    public boolean save(Place place) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("imatge", place.getImatge());
        dades.put("placename", place.getPlaceName());
        dades.put("placesecuritylevel", place.getPlaceSecurityLevel());


        try{
            long index = conn.insertOrThrow("Places",null,dades);
            return true;

        }catch(SQLException e){
            Log.e("Places", e.getMessage());
            return false;
        }

    }

    @Override
    public boolean update(Place place) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("imatge", place.getImatge());
        dades.put("placename", place.getPlaceName());
        dades.put("placesecuritylevel", place.getPlaceSecurityLevel());

        return conn.update("Places", dades, "codi = ?", new String[] {String.valueOf(place.getCodi())}) > 0;
    }

    @Override
    public boolean delete(Place place) {
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        return conn.delete("Place", "codi = ?", new String[] {String.valueOf(place.getCodi())})> 0;
    }
}
