package cat.albert.hogwartswiki.helpers;

import java.util.ArrayList;
import java.util.List;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.models.business.entities.Place;
import cat.albert.hogwartswiki.models.business.entities.Spell;

/**
 * Created by albert on 16/02/2016.
 */
public class CharacterBuilder {
//    public CharacterBuilder() {
//    }

    public List<Character> getCharacters() {
        List<Character> characters = new ArrayList<>();

        characters.add(new Character("Harry", "Potter", "Gryffindor", R.drawable.hp));
        characters.add(new Character("Ron", "Weasley", "Gryffindor", R.drawable.rw));
        characters.add(new Character("Hermione", "Granger", "Gryffindor", R.drawable.hg));
        characters.add(new Character("Neville", "Longbottom", "Gryffindor", R.drawable.nl));
        characters.add(new Character("Ginny", "Weasley", "Gryffindor", R.drawable.gw));
        characters.add(new Character("Draco","Malfoy","Slytherin", R.drawable.dm));
        characters.add(new Character("James", "Potter", "Gryffindor", R.drawable.jp));
        characters.add(new Character("Lily", "Evans", "Gryffindor", R.drawable.le));
        characters.add(new Character("Rubeus", "Hagrid", "Desconegut", R.drawable.rh));
        characters.add(new Character("Albus", "Dumbledore", "Gryffindor", R.drawable.ad));
        characters.add(new Character("Severus", "Snape", "Slytherin", R.drawable.ss));
        characters.add(new Character("Lucius", "Malfoy", "Slytherin", R.drawable.lmal));
        characters.add(new Character("Sirius", "Black", "Desconegut", R.drawable.sb));
        characters.add(new Character("Alastor", "Moody", "Desconegut", R.drawable.am));
        characters.add(new Character("Lord", "Voldemort", "Slytherin", R.drawable.lv));

        return characters;
    }

    public List<Object> getObjects() {
        List<Object> objects = new ArrayList<>();

        objects.add(new Object("Mapa del rondaire", "Revelar mapa", R.drawable.map));
        objects.add(new Object("Pedra filosofal", "Augmentar esp. de vida", R.drawable.pedra));
        objects.add(new Object("Giratemps", "Retrocedeix en el temps", R.drawable.girat));
        objects.add(new Object("Cromos de xocolata", "Col·leccionables", R.drawable.cromos));
        objects.add(new Object("Capa d'invisibilitat", "Ser invisible", R.drawable.capa));
        objects.add(new Object("Mirall d'Oesed", "Mostrar desitjos de la persona", R.drawable.mirall));

        return objects;
    }

    public List<Place> getPlaces() {
        List<Place> places = new ArrayList<>();

        places.add(new Place("Castell de Hogwarts", "Molt alta", R.drawable.hc));
        places.add(new Place("Camp de Quidditch", "Mitja", R.drawable.qp));
        places.add(new Place("Limbo", "Molt alta", R.drawable.lmb));
        places.add(new Place("Orfanat de Wool", "Molt baixa", R.drawable.wo));
        places.add(new Place("Cambra secreta", "Molt baixa", R.drawable.cs));
        places.add(new Place("Bosc prohibit", "Baixa", R.drawable.bp));
        places.add(new Place("Vall de Godric", "Alta", R.drawable.vg));
        places.add(new Place("Londres", "Dés de Alta a Molt alta", R.drawable.lnd));
        places.add(new Place("Cova de l'Horrocrux", "Molt baixa", R.drawable.ch));
        places.add(new Place("Mansió dels Malfoy", "Neutral", R.drawable.mm));


        return places;
    }

    public List<Spell> getSpells() {
        List<Spell> spells = new ArrayList<>();

        spells.add(new Spell("Expecto Patronum", "Molt efectiu", R.drawable.exp));
        spells.add(new Spell("Avada Kedabra", "Molt efectiu", R.drawable.avada));
        spells.add(new Spell("Expelliarmus", "Efectiu", R.drawable.expell));
        spells.add(new Spell("Septusembra", "Molt efectiu", R.drawable.septu));
        spells.add(new Spell("Crucio", "Molt efectiu", R.drawable.crucio));
        spells.add(new Spell("Desmaius", "Variable", R.drawable.desmaius));
        spells.add(new Spell("Wingardium Leviosa", "Neutral", R.drawable.wing));
        spells.add(new Spell("Accio", "Normal", R.drawable.accio));
        spells.add(new Spell("Petrificus Totalus", "Normal", R.drawable.petrif));
        spells.add(new Spell("Confundus", "Variable", R.drawable.confun));
        spells.add(new Spell("Protego", "Protecció pròpia", R.drawable.protego));

        return spells;
    }
}
