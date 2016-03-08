package cat.albert.hogwartswiki.views.impl.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cat.albert.hogwartswiki.R;
import cat.albert.hogwartswiki.models.business.entities.Spell;

public class SpellListAdapter extends ArrayAdapter<Spell>{
    private Context context;
    private LayoutInflater inflater;

    public SpellListAdapter(Context context, List<Spell> comments) {
        super(context, 0, comments);

        this.context = context;
        this.inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        SpellHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.spell_list, parent, false);

            holder = new SpellHolder();
            addViewsToHolder(convertView, holder);
            convertView.setTag(holder);
        } else {
            holder = (SpellHolder) convertView.getTag();
        }
        Spell spell = getItem(position);
        setDataIntoHolder(holder, spell);

        return convertView;
    }

    private void addViewsToHolder(View convertView, SpellHolder holder) {
        holder.spellName = (TextView) convertView.findViewById(R.id.main_txtview_spellname);
        holder.spellImpact = (TextView) convertView.findViewById(R.id.main_txtview_spellimpact);
        holder.imageView = (ImageView) convertView.findViewById(R.id.imageView_3);
    }

    private void setDataIntoHolder(SpellHolder holder, Spell spell) {
        holder.spellName.setText(String.format("Nom: %s", spell.getSpellName()));
        holder.spellImpact.setText(String.format("Impacte: %s", spell.getSpellImpact()));
        holder.imageView.setImageResource(spell.getImatge());
    }

    class SpellHolder {
        TextView spellName;
        TextView spellImpact;
        ImageView imageView;
    }
}