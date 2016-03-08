package cat.albert.hogwartswiki.views.impl.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.presenters.interfaces.IMainViewPresenter;


/**
 * Created by albert on 05/03/2016.
 */
public class EmplenarCamps extends AppCompatActivity {
    private final static int NOM = 0;
    private final static int COGNOM = 1;
    private final static int FAMILIA = 2;
    EditText etNom, etCognom, etFamilia;

    private ShareActionProvider myShareActionProvider;
    private ImageView imatge;

    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainViewPresenter presenter;
    private ListView list;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.characterinsert);

        etNom = (EditText)findViewById(R.id.editText_txtnom);
        etCognom = (EditText)findViewById(R.id.editText_txtcognom);
        etFamilia = (EditText)findViewById(R.id.editText_txtfamilia);

        list = (ListView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnRetry = (Button) findViewById(R.id.retry);
    }

    public void emplenarNom(View v) {
        Intent i = new Intent(this, InsertActivity.class);
        startActivityForResult(i, NOM);
    }

    public void emplenarCognom(View v) {
        Intent i = new Intent(this, InsertActivity.class);
        startActivityForResult(i, COGNOM);
    }

    public void emplenarFamilia(View v) {
        Intent i = new Intent(this, InsertActivity.class);
        startActivityForResult(i, FAMILIA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_CANCELED) {
            Toast.makeText(this, "Resultat cancel·lat", Toast.LENGTH_SHORT).show();
        } else {
            String resultat = data.getExtras().getString("RESULTAT");
            switch (requestCode) {
                case NOM:
                    etNom.setText(resultat);
                    break;
                case COGNOM:
                    etCognom.setText(resultat);
                    break;
                case FAMILIA:
                    etFamilia.setText(resultat);
                    break;
            }
        }
    }
}
