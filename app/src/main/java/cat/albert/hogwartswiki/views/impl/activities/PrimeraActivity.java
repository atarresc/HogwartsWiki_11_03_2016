package cat.albert.hogwartswiki.views.impl.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.io.InputStream;
import java.net.URL;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.presenters.interfaces.IMainViewPresenter;

/**
 * Created by albert on 25/02/2016.
 */
public class PrimeraActivity extends AppCompatActivity {

    private ShareActionProvider myShareActionProvider;
    private ImageView imatge;

    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainViewPresenter presenter;
    private ListView list;

    public void onClickPersonatges(View view) {
        Intent intent = new Intent(PrimeraActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickLocalitzacions(View view) {
        Intent intent = new Intent(PrimeraActivity.this, PlaceActivity.class);
        startActivity(intent);
    }

    public void onClickEncanteris(View view) {
        Intent intent = new Intent(PrimeraActivity.this, SpellActivity.class);
        startActivity(intent);
    }

    public void onClickObjectes(View view) {
        Intent intent = new Intent(PrimeraActivity.this, ObjectActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_primera);

        list = (ListView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnRetry = (Button) findViewById(R.id.retry);

        imatge = (ImageView) findViewById(R.id.imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        MenuItem shareOpt = menu.findItem(R.id.menu_item_share);
        myShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(shareOpt);

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT, "Hola! He pensat que et podria interessar viatjar a Hogwarts i conèixer més sobre el món màgic de la saga Harry Potter! \n\n'The Hogwarts App' és la teva App! \nDesenvolupada per: Albert Tarrés");
        myShareActionProvider.setShareIntent(i);

        return true;
    }

    public void descarregarImatge(View v) {
        new Thread(new Runnable() {
            public void run() {

                final Bitmap b;
                b = loadImageFromNetwork("http://icons.iconarchive.com/icons/anton-gerasimenko/harry-potter/128/Golden-Snitch-icon.png");
                imatge.post(new Runnable() {
                    @Override
                    public void run() {
                        imatge.setImageBitmap(b);
                    }
                });
            }
        }).start();
    }

    private Bitmap loadImageFromNetwork(String imageURL) {
        try {
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(imageURL).getContent());
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
