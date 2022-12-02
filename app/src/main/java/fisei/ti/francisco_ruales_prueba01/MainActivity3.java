package fisei.ti.francisco_ruales_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText EditTextNombre;
    EditText EditTextApellido;
    EditText EditTextDividendo;
    EditText EditTextDivisor;
    EditText EdittextNumero;

    Button buttonCerrar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditTextDividendo = findViewById(R.id.editTextDividendoMain3);
        EditTextDivisor = findViewById(R.id.editTextDivisorMain3);
        EdittextNumero = findViewById(R.id.editTextNumberMin3);
        buttonCerrar = findViewById(R.id.buttonCerrarMain3);

        Bundle extra = getIntent().getExtras();

        String nombre = extra.getString("Nombre");
        String apellido = extra.getString("Apellido");

        EditTextNombre = findViewById(R.id.editTextNombreMain3);
        EditTextApellido = findViewById(R.id.editTextApellidoMain3);

        EditTextNombre.setText(nombre);
        EditTextApellido.setText(apellido);

        buttonCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Dividendo = EditTextDividendo.getText().toString();
                String Divisor = EditTextDivisor.getText().toString();
                String Numero = EdittextNumero.getText().toString();

                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);

                intent.putExtra("Dividendo",Dividendo);
                intent.putExtra("Divisor",Divisor);
                intent.putExtra("Numero",Numero);

                startActivity(intent);
            }
        });

    }
}