package moreno.alex.loginbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombre, editTextPass;
    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //match con la vista
        setContentView(R.layout.activity_main);

        //match con los widgets
        editTextNombre = findViewById(R.id.etName);
        editTextPass = findViewById(R.id.etContra);
        botonIngreso = findViewById(R.id.btnIniciar);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String nombreUsuario = editTextNombre.getText().toString();
               String password = editTextPass.getText().toString();

               if (nombreUsuario.isEmpty() || password.isEmpty()){
                   //Nombre de usuario vacío
               }
               else{
                   if (nombreUsuario.equals("alex") && password.equals("1234")){
                       //Imprimir bienvenido
                       mensajito("Binevenido carnal");
                   }else{
                       //Imprimir datos erroneos
                       mensajito("Los datos son erroneos");
                   }
               }

            }
        });



    }
    public void mensajito(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}
