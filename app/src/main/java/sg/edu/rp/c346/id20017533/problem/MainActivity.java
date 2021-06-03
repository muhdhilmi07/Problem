package sg.edu.rp.c346.id20017533.problem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etNew;
    Button btnAdd;
    Button btnClear;
    ListView lvDo;

    ArrayList<String> alTodo;
    ArrayAdapter<String> aaTodo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNew = findViewById(R.id.editNewToDo);
        btnAdd = findViewById(R.id.buttonAdd);
        btnClear = findViewById(R.id.buttonClear);
        lvDo = findViewById(R.id.listViewTodo);

        alTodo = new ArrayList<>();

        aaTodo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alTodo);
        lvDo.setAdapter(aaTodo);

        btnAdd.setOnClickListener((v -> {
            String newTodo = etNew.getText().toString();
            alTodo.add(newTodo);
            aaTodo.notifyDataSetChanged();
            etNew.setText(null);
        }));

        btnClear.setOnClickListener((v -> {
            alTodo.clear();
            aaTodo.notifyDataSetChanged();
        }));
    }
}




