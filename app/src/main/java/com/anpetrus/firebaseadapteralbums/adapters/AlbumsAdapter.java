package com.anpetrus.firebaseadapteralbums.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.anpetrus.firebaseadapteralbums.R;
import com.anpetrus.firebaseadapteralbums.data.Nodes;
import com.anpetrus.firebaseadapteralbums.models.Album;
import com.firebase.ui.database.FirebaseRecyclerAdapter;

/**
 * Created by USUARIO on 04-09-2017.
 */

public class AlbumsAdapter extends FirebaseRecyclerAdapter<Album,AlbumsAdapter.AlbumHolder>{


    private boolean first = true;

    public AlbumsAdapter() {
        super(Album.class, R.layout.list_item_album, AlbumHolder.class, new Nodes().albums());
    }

    @Override
    protected void populateViewHolder(final AlbumHolder viewHolder, Album model, int position) {

        viewHolder.name.setText(model.getName());
        viewHolder.band.setText(model.getBand());
        viewHolder.release.setText(String.valueOf(model.getRelease()));

    }

    static public class AlbumHolder extends RecyclerView.ViewHolder{

        private TextView name, band, release;

        public AlbumHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTv);
            band = itemView.findViewById(R.id.bandTv);
            release = itemView.findViewById(R.id.releaseTv);
        }
    }
}
