package vsga.mobile.project1c_alarazwarisetiawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvItem;
    private String[] namaMakanan = new String[] {
            "Karedok", "Lotek", "Doclang", "Nasi Liwet", "Nasi Timbel", "Nasi Tutug Oncom", "Pais", "Sayur Asem",
            "Tumis Genjer Oncom", "Mie Kocok", "Soto Bandung", "Sate Manggarai", "Laksa Bogor", "Soto Mie", "Kupat Tahu",
            "Asinan Bogor"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, namaMakanan);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih : " +namaMakanan[position],
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}