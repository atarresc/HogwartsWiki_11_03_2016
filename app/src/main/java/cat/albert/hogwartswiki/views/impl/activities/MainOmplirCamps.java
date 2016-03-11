package cat.albert.hogwartswiki.views.impl.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.parceler.Parcels;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.business.entities.Character;


/**
 * Created by albert on 05/03/2016.
 */
public class MainOmplirCamps extends AppCompatActivity implements View.OnClickListener {
    private EditText etNom, etCognom, etFamilia;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.characterinsert);

        etNom = (EditText)findViewById(R.id.editText_txtnom);
        etCognom = (EditText)findViewById(R.id.editText_txtcognom);
        etFamilia = (EditText)findViewById(R.id.editText_txtfamilia);
        btnCrear = (Button) findViewById(R.id.button_accept);
        btnCrear.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Character newCharacter = new Character();

        newCharacter.setFirstName(etNom.getText().toString());
        newCharacter.setLastName(etCognom.getText().toString());
        newCharacter.setFamily(etFamilia.getText().toString());
        newCharacter.setImatge(R.drawable.nouelement);
        Intent intent = new Intent();
        intent.putExtra("CHARACTER",Parcels.wrap(newCharacter));
        setResult(RESULT_OK, intent );
    }
}
