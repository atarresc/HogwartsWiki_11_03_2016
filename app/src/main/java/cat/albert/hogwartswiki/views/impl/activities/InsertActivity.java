package cat.albert.hogwartswiki.views.impl.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.persistence.daos.interfaces.CharactersDAO;
import cat.albert.hogwartswiki.models.business.entities.Character;
import cat.albert.hogwartswiki.presenters.interfaces.IMainViewPresenter;

/**
 * Created by albert on 04/03/2016.
 */
public class InsertActivity extends AppCompatActivity{

    private ShareActionProvider myShareActionProvider;
    private ImageView imatge;

    Button btAcceptar, btCancelar;
    EditText etResultat;

    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainViewPresenter presenter;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        btAcceptar = (Button)findViewById(R.id.button_accept);
        btCancelar = (Button)findViewById(R.id.button_cancel);
        etResultat = (EditText) findViewById(R.id.editText);
    }

        public void onClick(View v) {
            if (etResultat.getText().length()!=0) {
                String resultat = etResultat.getText().toString();
                Intent i = getIntent();
                i.putExtra("RESULTAT", resultat);
                setResult(RESULT_OK, i);
                finish();
            } else {
                Toast.makeText(InsertActivity.this, "ERROR. Text no introduït", Toast.LENGTH_SHORT).show();
            }
         btCancelar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 setResult(RESULT_CANCELED);
                 finish();
             }
         });
        }

    }
