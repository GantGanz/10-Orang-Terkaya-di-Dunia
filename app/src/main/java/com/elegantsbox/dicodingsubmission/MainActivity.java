package com.elegantsbox.dicodingsubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    FloatingActionButton fab;

    int[] images = {R.drawable.jeff,
                    R.drawable.bill,
                    R.drawable.warren,
                    R.drawable.bernard,
                    R.drawable.carlos,
                    R.drawable.amancio,
                    R.drawable.larry,
                    R.drawable.mark,
                    R.drawable.michael,
                    R.drawable.larryp,
    };

    String[] Names =    {"Jeff Bezos",
            "Bill Gates",
            "Warren Buffet",
            "Bernard Arnault",
            "Carlos Slim Helu",
            "Amancio Ortega",
            "Larry Ellison",
            "Mark Zuckerberg",
            "Michael Bloomberg",
            "Larry Page",
    };

    String[] Companies = {"Amazon",
            "Microsoft",
            "Berkshire Hathaway",
            "LVMH",
            "Telecom",
            "Inditex, Zara",
            "Oracle",
            "Facebook",
            "Bloomberg",
            "Alphabet",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
            }
        });

        mListView =(ListView) findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        mListView.setAdapter(customAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent moveIntent = new Intent(MainActivity.this, JeffActivity.class);
                    startActivity(moveIntent);
                }else if(position == 1){
                    Intent moveIntent = new Intent(MainActivity.this, BillActivity.class);
                    startActivity(moveIntent);
                }else if(position == 2){
                    Intent moveIntent = new Intent(MainActivity.this, WarrentActivity.class);
                    startActivity(moveIntent);
                }else if(position == 3){
                    Intent moveIntent = new Intent(MainActivity.this, BernardActivity.class);
                    startActivity(moveIntent);
                }else if(position == 4){
                    Intent moveIntent = new Intent(MainActivity.this, CarlosActivity.class);
                    startActivity(moveIntent);
                }else if(position == 5){
                    Intent moveIntent = new Intent(MainActivity.this, AmancioActivity.class);
                    startActivity(moveIntent);
                }else if(position == 6){
                    Intent moveIntent = new Intent(MainActivity.this, LarryActivity.class);
                    startActivity(moveIntent);
                }else if(position == 7){
                    Intent moveIntent = new Intent(MainActivity.this, MarkActivity.class);
                    startActivity(moveIntent);
                }else if(position == 8){
                    Intent moveIntent = new Intent(MainActivity.this, MichaelActivity.class);
                    startActivity(moveIntent);
                }else if(position == 9){
                    Intent moveIntent = new Intent(MainActivity.this, LarrypActivity.class);
                    startActivity(moveIntent);
                }
            }
        });

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView);
            TextView mTextView = (TextView) view.findViewById(R.id.textView);
            TextView mTextView2 = (TextView) view.findViewById(R.id.textView2);

            mImageView.setImageResource(images[position]);
            mTextView.setText(Names[position]);
            mTextView2.setText(Companies[position]);

            return view;
        }
    }
}
