package cat.albert.hogwartswiki.views.impl.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.parceler.Parcels;

import java.util.List;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.business.entities.Place;
import cat.albert.hogwartswiki.presenters.impl.MainPlaceViewPresenterImpl;
import cat.albert.hogwartswiki.presenters.interfaces.IMainPlaceViewPresenter;
import cat.albert.hogwartswiki.views.impl.adapters.PlaceListAdapter;
import cat.albert.hogwartswiki.views.interfaces.IMainPlaceView;

/**
 * Created by albert on 17/02/2016.
 */
public class PlaceActivity extends AppCompatActivity implements IMainPlaceView, AdapterView.OnItemClickListener {

    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainPlaceViewPresenter presenter;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnRetry = (Button) findViewById(R.id.retry);

        presenter = new MainPlaceViewPresenterImpl();
        presenter.onCreate(this, getBaseContext());
        presenter.getPersonsFromService();
    }



    @Override
    public PlaceListAdapter createPersonAdapter(List<Place> places) {
        return new PlaceListAdapter(this, places);
    }


    public void goToDetailActivity(Place place) {
    }

    public void createList(PlaceListAdapter adapter) {
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    //Menú crear nou element
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item_crear, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.menu_item_crear) {
            crearLocalitzacio();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 0 && resultCode == RESULT_OK) {
            Place place = (Place) Parcels.unwrap(data.getParcelableExtra("PLACE"));
            presenter.afegirLocalitzacio(place);
        }
    }

    private void crearLocalitzacio() {
        Intent i = new Intent(this, PlaceOmplirCamps.class);
        startActivityForResult(i, 0, null);

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

    }
}

