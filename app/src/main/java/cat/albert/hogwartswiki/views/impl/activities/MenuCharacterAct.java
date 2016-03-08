package cat.albert.hogwartswiki.views.impl.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.presenters.interfaces.IMainViewPresenter;

/**
 * Created by albert on 04/03/2016.
 */
public class MenuCharacterAct extends AppCompatActivity{

    private ShareActionProvider myShareActionProvider;
    private ImageView imatge;

    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainViewPresenter presenter;
    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.characteroptions);

        list = (ListView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnRetry = (Button) findViewById(R.id.retry);

    }

    public void onClick(View view) {
        Intent intent = new Intent(MenuCharacterAct.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(MenuCharacterAct.this, EmplenarCamps.class);
        startActivity(intent);
    }
}
