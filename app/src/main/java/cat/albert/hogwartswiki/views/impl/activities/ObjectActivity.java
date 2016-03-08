package cat.albert.hogwartswiki.views.impl.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.business.entities.Object;
import cat.albert.hogwartswiki.presenters.impl.MainObjectViewPresenterImpl;
import cat.albert.hogwartswiki.presenters.interfaces.IMainObjectViewPresenter;
import cat.albert.hogwartswiki.views.impl.adapters.ObjectListAdapter;
import cat.albert.hogwartswiki.views.interfaces.IMainObjectView;

/**
 * Created by albert on 26/02/2016.
 */
public class ObjectActivity extends AppCompatActivity implements IMainObjectView, AdapterView.OnItemClickListener  {

    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainObjectViewPresenter presenter;
    private ListView list;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnRetry = (Button) findViewById(R.id.retry);

        presenter = new MainObjectViewPresenterImpl();
        presenter.onCreate(this, getBaseContext());
        presenter.getPersonsFromService();
    }



    @Override
    public ObjectListAdapter createPersonAdapter(List<Object> objects) {
        return new ObjectListAdapter(this, objects);
    }


    public void goToDetailActivity(Object object) {
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("PERSON", Parcels.wrap(character));
//        startActivity(intent);
    }

    public void createList(ObjectListAdapter adapter) {
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
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
