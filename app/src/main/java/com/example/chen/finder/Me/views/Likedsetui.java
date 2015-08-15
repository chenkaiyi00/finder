package com.example.chen.finder.Me.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.chen.finder.Me.views.adapter.Gridlikedsetadpter;
import com.example.chen.finder.R;
import com.example.chen.finder.objects.Product;

import java.util.ArrayList;

public class Likedsetui extends AppCompatActivity {
    ArrayList<Product> gridArray= new ArrayList<Product>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likedsetui);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        gridArray.add(new Product(R.drawable.pic1, "Canvas Home", "$19", "$10"));
        gridArray.add(new Product(R.drawable.pic2, "Citizens of Humanity",
                "$99","$10"));
        gridArray.add(new Product(R.drawable.pic3, "Bomabs",
                "$59","$10"));

        gridArray.add(new Product(R.drawable.pic4, "Marc Jacobs",
                "$199","$10"));
        gridArray.add(new Product(R.drawable.pic5, "Oscar de la Renta",
                "$89","$10"));
        gridArray.add(new Product(R.drawable.pic6, "Trigger Backpack",
                "$39","$10"));
        gridArray.add(new Product(R.drawable.product1, "Bandera Chambray",
                "$79","$10"));
        gridArray.add(new Product(R.drawable.product2, "Haskell in Crystal",
                "$119","$10"));
        gridArray.add(new Product(R.drawable.product3, "M3 Slim Straight Indy 3D",
                "$9","$10"));
        gridArray.add(new Product(R.drawable.product4, "Maria",
                "$29","$10"));
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new Gridlikedsetadpter(this,
                R.layout.single_liked_product,
                gridArray));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_likedsetui, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
