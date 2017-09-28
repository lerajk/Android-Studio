package com.example.lee.leenoyrajkhowa_comp304lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class activity_foodmenu extends AppCompatActivity {

    private Intent intent;
    private int Cusine_id;

    private View Food_One;
    private View Food_Two;
    private View Food_Three;

    private String menu_Item_One;
    private String menu_Item_Two;
    private String menu_Item_Third;

    private TextView food_Display_One;
    private TextView food_Display_Two;
    private TextView food_Display_Three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodmenu);


        Food_One = findViewById(R.id.first_item);
        Food_Two = findViewById(R.id.second_item);
        Food_Three = findViewById(R.id.third_item);

        food_Display_One = (TextView) Food_One.findViewById(R.id.food_item);
        food_Display_Two = (TextView) Food_Two.findViewById(R.id.food_item);
        food_Display_Three = (TextView) Food_Three.findViewById(R.id.food_item);


        intent = getIntent();
        Cusine_id = intent.getIntExtra("cuisine_id", 0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        setMenu(Cusine_id, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setFood(item.getItemId());

        return true;
    }



    private void setMenu(int cusine_id, Menu menu){

        switch (cusine_id){
            case R.id.rdb_american:
            {
                menu.clear();
                menu.add(Menu.NONE, R.string.mc_d, Menu.NONE, getResources().getString(R.string.mc_d));
                menu.add(Menu.NONE, R.string.five_guys, Menu.NONE, getResources().getString(R.string.five_guys));
                menu.add(Menu.NONE, R.string.pizza_pizza, Menu.NONE, getResources().getString(R.string.pizza_pizza));
                break;
            }
            case R.id.rdb_chinese:
            {
                menu.clear();
                menu.add(Menu.NONE, R.string.Pho, Menu.NONE, getResources().getString(R.string.Pho));
                menu.add(Menu.NONE, R.string.Phung, Menu.NONE, getResources().getString(R.string.Phung));
                menu.add(Menu.NONE, R.string.Tik, Menu.NONE, getResources().getString(R.string.Tik));
                break;
            }
            case R.id.rdb_indian:
            {
                menu.clear();
                menu.add(Menu.NONE, R.string.sheer, Menu.NONE, getResources().getString(R.string.sheer));
                menu.add(Menu.NONE, R.string.mugal_mahal, Menu.NONE, getResources().getString(R.string.mugal_mahal));
                menu.add(Menu.NONE, R.string.biriyani, Menu.NONE, getResources().getString(R.string.biriyani));
                break;
            }

        }

    }



    private void setFood(int Rest_id){
        switch (Rest_id) {
            //Amercian
            case R.string.mc_d: {
                menu_Item_One = getResources().getString(R.string.mc_chicken);
                menu_Item_Two = getResources().getString(R.string.big_mac);
                menu_Item_Third = getResources().getString(R.string.fish_fillet);
                break;
            }
            case R.string.pizza_pizza: {
                menu_Item_One = getResources().getString(R.string.peperoni);
                menu_Item_Two = getResources().getString(R.string.cheese);
                menu_Item_Third = getResources().getString(R.string.chicken);
                break;
            }
            case R.string.five_guys: {
                menu_Item_One = getResources().getString(R.string.veg_burger);
                menu_Item_Two = getResources().getString(R.string.chicken_burger);
                menu_Item_Third = getResources().getString(R.string.beef_burger);
                break;
            }

            //Indian
            case R.string.mugal_mahal: {
                menu_Item_One = getResources().getString(R.string.kofta);
                menu_Item_Two = getResources().getString(R.string.paneer);
                menu_Item_Third = getResources().getString(R.string.kheer);
                break;
            }
            case R.string.biriyani: {
                menu_Item_One = getResources().getString(R.string.kabob);
                menu_Item_Two = getResources().getString(R.string.dal);
                menu_Item_Third = getResources().getString(R.string.rice);
                break;
            }
            case R.string.sheer: {
                menu_Item_One = getResources().getString(R.string.tandoori);
                menu_Item_Two = getResources().getString(R.string.tikka);
                menu_Item_Third = getResources().getString(R.string.curry);
                break;
            }

            //chinese
            case R.string.Pho: {
                menu_Item_One = getResources().getString(R.string.soup);
                menu_Item_Two = getResources().getString(R.string.spring_roll);
                menu_Item_Third = getResources().getString(R.string.tofu);
                break;
            }
            case R.string.Phung: {
                menu_Item_One = getResources().getString(R.string.red_curry);
                menu_Item_Two = getResources().getString(R.string.basil);
                menu_Item_Third = getResources().getString(R.string.green_curry);
                break;
            }
            case R.string.Tik: {
                menu_Item_One = getResources().getString(R.string.jasmine);
                menu_Item_Two = getResources().getString(R.string.bean);
                menu_Item_Third = getResources().getString(R.string.noddle);
                break;
            }

        }
    }

    public void back_button(View view)
    {
        Intent intent = new Intent(this, activity_cuisine.class);
        startActivity(intent);
    }

    public void btn_submit (View view)
    {
        Intent intent = new Intent(this, activity_customer_info.class);
        startActivity(intent);

        food_Display_One.setText(menu_Item_One);
        food_Display_Two.setText(menu_Item_Two);
        food_Display_Two.setText(menu_Item_Two);

    }



}
