package e.a52311.tpdm_unidad1_ejercicio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class U1PRACTICA1 extends AppCompatActivity {

    EditText var1;
    Button var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u1_practica1);

    var1=findViewById(R.id.text1);
    var2=findViewById(R.id.aceptar);

    var2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String nombre=var1.getText().toString();
            Toast.makeText(U1PRACTICA1.this,"BIENVENIDO "+nombre,Toast.LENGTH_LONG).show();
        }
    });



    }
}
