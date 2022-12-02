package fisei.ti.francisco_ruales_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText EditTextNombre;
    EditText EditTextApellido;

    Button ButtonSiguiente;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonSiguiente = findViewById(R.id.buttonmain1);


/*        Bundle extra = getIntent().getExtras();

        String nombre = extra.getString("Nombre");
        String apellido = extra.getString("Apellido");

        EditTextNombre = findViewById(R.id.editTextNombreMain1);
        EditTextApellido = findViewById(R.id.editTextApellidoMain1);

        EditTextNombre.setText(nombre);
        EditTextApellido.setText(apellido);*/

        ButtonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                startActivity(intent);
            }
        });
    }


}