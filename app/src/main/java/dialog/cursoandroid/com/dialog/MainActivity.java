package dialog.cursoandroid.com.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //criar aler dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //configurar o titulo
                dialog.setTitle("Título da Dialog");

                //configurar mensagem
                dialog.setMessage("Mensagem da dialog");

                // Não permite que o usuário não clique fora da dialog e a dialog desapareça
                dialog.setCancelable(false);

                dialog.setIcon(android.R.drawable.ic_dialog_alert);

                //botao negativo
                dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Pressionado botão não", Toast.LENGTH_SHORT).show();
                    }
                });

                //botao positivo
                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Pressionado botão sim", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.create();
                dialog.show();
            }
        });
    }
}
