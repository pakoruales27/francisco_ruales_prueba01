package fisei.ti.francisco_ruales_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText EditTextNombre;
    EditText EditTextApellido;

    Button ButtonSiguiente2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditTextNombre = findViewById(R.id.editTextNombreMain2);
        EditTextApellido = findViewById(R.id.editTextApellidoMAin2);
        ButtonSiguiente2 = findViewById(R.id.buttonMain2);

        ButtonSiguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Nombre = EditTextNombre.getText().toString();

                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);

                startActivity(intent);
            }
        });
    }
}