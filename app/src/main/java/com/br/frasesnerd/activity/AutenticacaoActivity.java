package com.br.frasesnerd.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.br.frasesnerd.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

import helpers.ConfiguracaoFirebase;

public class AutenticacaoActivity extends AppCompatActivity {

    private Button btnAcessar;
    private EditText campoEmail, campoSenha, registrar;
    private LinearLayout linearTipoUsuario;
    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autenticacao);

        inicializaComponentes();

        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();

        verificarUsuarioLogado();

        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = campoEmail.getText().toString();
                String senha = campoSenha.getText().toString();

                if (email.isEmpty() || senha.isEmpty()){

                    Toast.makeText(AutenticacaoActivity.this, "Os campos email e senha são obrigatórios!", Toast.LENGTH_LONG).show();

                }else{
                    autenticacao.signInWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful()){

                                startActivity(new Intent(getBaseContext(), InicioActivity.class));
                                finish();

                            }else{
                                Toast.makeText(AutenticacaoActivity.this, "Erro ao fazer login!" + task.getException(), Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                }
            }
        });
    }

    private void verificarUsuarioLogado() {

        FirebaseUser usuarioLogado = autenticacao.getCurrentUser();
        if( usuarioLogado != null){

            startActivity(new Intent(getBaseContext(), InicioActivity.class));
        }

    }

    private void inicializaComponentes() {
        campoEmail = findViewById(R.id.edtCadastroEmail);
        campoSenha = findViewById(R.id.edtCadastroSenha);

        btnAcessar = findViewById(R.id.btnAcessar);
    }

    public void cadastrar(View view) {
        startActivity(new Intent(getBaseContext(), RegistrarActivity.class));
    }



}

