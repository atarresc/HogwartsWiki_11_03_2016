package cat.albert.hogwartswiki.models.persistence.daos.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.ObjectsDAO;

import cat.albert.hogwartswiki.models.persistence.utilities.SQLiteUtils;
/**
 * Created by albert on 01/03/2016.
 */
public class ObjectsSQLiteDAO implements ObjectsDAO {

    private Context context;

    public ObjectsSQLiteDAO(Context context) {
        this.context = context;
    }

    @Override
    public Object getById(long id) {
        Object object = null;
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Objects",
                new String[]{"imatge", "objectname", "objectinfo"},
                "codi = ?", new String[]{String.valueOf(id)}, null, null, null, null, null);

        object = SQLiteUtils.getObject(result);
        conn.close();

        return object;
    }

    @Override
    public List<Object> getAll() {
        List<Object> objects = new ArrayList<>();

        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        Cursor result = conn.query(true, "Objects",
                new String[]{"imatge", "objectname", "objectinfo"},
                null, null, null, null, null, null, null);
        while (result.moveToNext()) {
            objects.add(SQLiteUtils.getObject(result));
        }

        conn.close();

        return objects;
    }

    @Override
    public boolean save(Object object) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("imatge", object.getImatge());
        dades.put("objectname", object.getObjectName());
        dades.put("objectinfo", object.getObjectInfo());


        try{
            long index = conn.insertOrThrow("Objects",null,dades);
            return true;

        }catch(SQLException e){
            Log.e("Objects", e.getMessage());
            return false;
        }

    }

    @Override
    public boolean update(Object object) {
        ContentValues dades = new ContentValues();
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);

        dades.put("imatge", object.getImatge());
        dades.put("objectname", object.getObjectName());
        dades.put("objectinfo", object.getObjectInfo());

        return conn.update("Objects", dades, "codi = ?", new String[] {String.valueOf(object.getCodi())}) > 0;
    }

    @Override
    public boolean delete(Object object) {
        SQLiteDatabase conn = SQLiteUtils.getConnection(context);
        return conn.delete("Objects", "codi = ?", new String[] {String.valueOf(object.getCodi())})> 0;
    }
}