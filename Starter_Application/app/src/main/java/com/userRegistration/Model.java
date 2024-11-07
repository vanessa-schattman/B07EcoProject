package com.b072024gr2.ecoproj;

public class MainActivityModel(){
    FirebaseDatabase db;

    private MainActivityModel(){
        db = FirebaseDatabase.getInstance("B07EcoProject.firebaseio.com");
    }
   
    // THIS JUST QUERIES FOR USERS
    public void queryDB(MainActivityPresenter presenter, String username){
        DatabaseReference ref = db.getReference();
        DatabaseReference query = ref.child("users").child(username);
        
        query.addValueEventListener(new EventListener);

        @Override
        public void OnDataChange(DataSnapshot snapshot){
            presenter.setOutputText(snapshot.exists());
        }

        @Override
        public void OnCancellend(DatabaseError error){}
    }
    
    public void write(String string){
        DatabaseReference myRef = db.getReference("message");
        myRef.setValue(string);
    }

}