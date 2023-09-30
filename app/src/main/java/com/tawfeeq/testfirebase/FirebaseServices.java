package com.tawfeeq.testfirebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices {
    private static FirebaseServices instance;
    private FirebaseAuth auth;

    public FirebaseAuth getAuth() {
        return auth;
    }

    public FirebaseFirestore getStore() {
        return store;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }

    private FirebaseFirestore store;
    private FirebaseStorage storage;

    private FirebaseServices()
    {
        this.auth= FirebaseAuth.getInstance();
        this.store= FirebaseFirestore.getInstance();
        this.storage= FirebaseStorage.getInstance();
    }
    public static FirebaseServices getInstance()
    {
         if(instance==null) instance = new FirebaseServices();

         return instance;
    }
}
