package cat.albert.hogwartswiki.views.impl.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.parceler.Parcels;

import java.util.List;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.presenters.impl.MainViewPresenterImpl;
import cat.albert.hogwartswiki.presenters.interfaces.IMainViewPresenter;
import cat.albert.hogwartswiki.views.impl.adapters.CharacterListAdapter;
import cat.albert.hogwartswiki.views.interfaces.IMainView;

/**
 * Created by albert on 17/02/2016.
 */
public class MainActivity extends AppCompatActivity implements IMainView, AdapterView.OnItemClickListener {

    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainViewPresenter presenter;
    private ListView list;

    private final static int NOM = 0;
    private final static int COGNOM = 1;
    private final static int FAMILIA = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnRetry = (Button) findViewById(R.id.retry);

        presenter = new MainViewPresenterImpl();
        presenter.onCreate(this, getBaseContext());
        presenter.getPersonsFromService();
    }

    public void onClick(View view) {

    }

    @Override
    public CharacterListAdapter createPersonAdapter(List<Character> characters) {
        return new CharacterListAdapter(this, characters);
    }


    public void goToDetailActivity(Character character) {
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("PERSON", Parcels.wrap(character));
//        startActivity(intent);
    }

    public void createList(CharacterListAdapter adapter) {
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    public void emplenarNom(View v) {
        Intent i = new Intent(this, EmplenarCamps.class);
        // Iniciamos la segunda actividad, y le indicamos que la iniciamos
        // para rellenar el nombre:
        startActivityForResult(i, NOM);
    }

    public void emplenarCognom(View v) {
        Intent i = new Intent(this, EmplenarCamps.class);
        // Iniciamos la segunda actividad, y le indicamos que la iniciamos
        // para rellenar el nombre:
        startActivityForResult(i, COGNOM);
    }

    public void emplenarFamilia(View v) {
        Intent i = new Intent(this, EmplenarCamps.class);
        // Iniciamos la segunda actividad, y le indicamos que la iniciamos
        // para rellenar el nombre:
        startActivityForResult(i, NOM);
    }

    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    public void showRetryButton() {
        btnRetry.setVisibility(View.VISIBLE);
    }

    public void hideRetryButton() {
        btnRetry.setVisibility(View.GONE);
    }

    public void showList() {
        list.setVisibility(View.VISIBLE);
    }

    public void hideList() {
        list.setVisibility(View.GONE);
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent i = new Intent(this, SecondActivity.class);
//
//
//        Character character = (Character) parent.getItemAtPosition(position);
//        Bundle b = new Bundle();
//        b.putSerializable(getString(R.string.intent_param_character), character);
//        i.putExtras(b);
//
//        startActivityForResult(i, INTENT_REQUEST);
//
//        presenter.onItemClicked(position);
    }
}

