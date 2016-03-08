package cat.albert.hogwartswiki.models.persistence.utilities;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import cat.albert.hogwartswiki.R;


/**
 * Created by albert on 01/03/2016.
 *
 */
public class CharactersSQLiteHelper extends SQLiteOpenHelper {
    private final String SQL_CREATE_PERSONATGE = "CREATE TABLE Characters(" +
            "   codi INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "   imatge INTEGER, " +
            "	firstname TEXT, " +
            "	lastname TEXT, " +
            "	family TEXT)";

    private final String SQL_CREATE_LLOC = "CREATE TABLE Places(" +
            "   codi INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "   imatge INTEGER, " +
            "   placename TEXT, " +
            "   placesecuritylevel TEXT)";

    private final String SQL_CREATE_ENCANTERI = "CREATE TABLE Spells(" +
            "   codi INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "   imatge INTEGER, " +
            "   spellname TEXT, " +
            "   spellimpact TEXT)";

    private final String SQL_CREATE_OBJECTE = "CREATE TABLE Objects(" +
            "   codi INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "   imatge INTEGER, " +
            "   objectname TEXT, " +
            "   objectinfo TEXT)";

    public CharactersSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_PERSONATGE);
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.hp + ",'Harry','Potter','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.rw + ",'Ronald','Weasley','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.hg + ",'Hermione','Granger','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.nl + ",'Neville','Longbottom','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.gw + ",'Ginny','Weasley','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.dm + ",'Draco','Malfoy','Slytherin')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.jp + ",'James','Potter','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.le + ",'Lily','Evans','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.rh + ",'Rubeus','Hagrid','Classificat')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.ad + ",'Albus','Dumbledore','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.ss + ",'Severus','Snape','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.lmal + ",'Lucius','Malfoy','Slytherin')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.sb + ",'Sirius','Black','Slytherin')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.am + ",'Alastor','Moody','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.lv + ",'Lord','Voldemort','Slytherin')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.dob + ",'Dobby','---','Classificat')");

        sqLiteDatabase.execSQL(SQL_CREATE_LLOC);
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.hc + ",'Castell de Hogwarts','Molt alta')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.qp + ",'Camp de Quidditch','Mitja')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.lmb + ",'Limbo','Molt alta')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.wo + ",'Orfanat de Wool','Molt baixa')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.cs + ",'Cambra secreta','Molt baixa')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.bp + ",'Bosc prohibit','Baixa')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.vg + ",'Vall de Godric','Alta')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.lnd + ",'Londres','Dés de Alta a Molt alta')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.ch + ",'Cova dels Horricreus','Molt baixa')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.mm + ",'Mansió dels Malfoy','Neutral')");

        sqLiteDatabase.execSQL(SQL_CREATE_ENCANTERI);
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.exp + ",'Expecto Patronum','Molt efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.avada + ",'Avada Kedabra','Molt efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.expell + ",'Expelliarmus','Efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.septu + ",'Septusembra','Molt efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.crucio + ",'Crucio','Molt efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.desmaius + ",'Desmaius','Variable')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.wing + ",'Wingardium Leviosa','Neutral')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.accio + ",'Accio','Normal')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.petrif + ",'Petrificus Totalus','Normal')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.confun + ",'Confundus','Variable')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.protego + ",'Protego','Protecció pròpia')");

        sqLiteDatabase.execSQL(SQL_CREATE_OBJECTE);
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.map + ",'Mapa del rondaire','Revelar mapa')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.pedra + ",'Pedra filosofal','Augmentar esperança de vida')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.girat + ",'Giratemps','Retrocedir en el temps')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.cromos + ",'Cromos de xocol·lata','Només col·leccionables')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.capa + ",'Capa de la invisibilitat','Ser invisible')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.mirall + ",'Mirall de Oesed','Mostrar desitjos de la persona')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Characters,Places,Spells,Objects");
        sqLiteDatabase.execSQL(SQL_CREATE_PERSONATGE);
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.hp + ",'Harry','Potter','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.rw + ",'Ronald','Weasley','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.hg + ",'Hermione','Granger','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.nl + ",'Neville','Longbottom','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.gw + ",'Ginny','Weasley','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.dm + ",'Draco','Malfoy','Slytherin')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.jp + ",'James','Potter','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.le + ",'Lily','Evans','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.rh + ",'Rubeus','Hagrid','Classificat')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.ad + ",'Albus','Dumbledore','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.ss + ",'Severus','Snape','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.lmal + ",'Lucius','Malfoy','Slytherin')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.sb + ",'Sirius','Black','Slytherin')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.am + ",'Alastor','Moody','Gryffindor')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.lv + ",'Lord','Voldemort','Slytherin')");
        sqLiteDatabase.execSQL("INSERT INTO CHARACTERS(imatge,firstname,lastname,family) VALUES (" + R.drawable.dob + ",'Dobby','---','Classificat')");

        sqLiteDatabase.execSQL(SQL_CREATE_LLOC);
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.hc + ",'Castell de Hogwarts','Molt alta')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.qp + ",'Camp de Quidditch','Mitja')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.lmb + ",'Limbo','Molt alta')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.wo + ",'Orfanat de Wool','Molt baixa')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.cs + ",'Cambra secreta','Molt baixa')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.bp + ",'Bosc prohibit','Baixa')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.vg + ",'Vall de Godric','Alta')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.lnd + ",'Londres','Dés de Alta a Molt alta')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.ch + ",'Cova dels Horricreus','Molt baixa')");
        sqLiteDatabase.execSQL("INSERT INTO PLACES(imatge,placename,placesecuritylevel) VALUES (" + R.drawable.mm + ",'Mansió dels Malfoy','Neutral')");

        sqLiteDatabase.execSQL(SQL_CREATE_ENCANTERI);
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.exp + ",'Expecto Patronum','Molt efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.avada + ",'Avada Kedabra','Molt efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.expell + ",'Expelliarmus','Efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.septu + ",'Septusembra','Molt efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.crucio + ",'Crucio','Molt efectiu')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.desmaius + ",'Desmaius','Variable')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.wing + ",'Wingardium Leviosa','Neutral')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.accio + ",'Accio','Normal')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.petrif + ",'Petrificus Totalus','Normal')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.confun + ",'Confundus','Variable')");
        sqLiteDatabase.execSQL("INSERT INTO SPELLS(imatge,spellname,spellimpact) VALUES (" + R.drawable.protego + ",'Protego','Protecció pròpia')");

        sqLiteDatabase.execSQL(SQL_CREATE_OBJECTE);
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.map + ",'Mapa del rondaire','Revelar mapa')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.pedra + ",'Pedra filosofal','Augmentar esperança de vida')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.girat + ",'Giratemps','Retrocedir en el temps')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.cromos + ",'Cromos de xocol·lata','Només col·leccionables')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.capa + ",'Capa de la invisibilitat','Ser invisible')");
        sqLiteDatabase.execSQL("INSERT INTO OBJECTS(imatge,objectname,objectinfo) VALUES (" + R.drawable.mirall + ",'Mirall de Oesed','Mostrar desitjos de la persona')");

    }
}

