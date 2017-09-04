package com.anpetrus.firebaseadapteralbums.data;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by USUARIO on 04-09-2017.
 */

public class Nodes {

    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference albums(){
        return root.child("albums");
    }


}
