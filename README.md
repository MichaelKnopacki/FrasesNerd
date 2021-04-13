# FrasesNerd
![frases](https://user-images.githubusercontent.com/77402918/114590603-5a8dca00-9c5f-11eb-8a08-e527212a1e8d.jpg)

## Descrição

Nesse projeto criamos a junção de alguns recursos práticados nos últimos encontros. Abaixo vou citar um a um:

### __SPLASH__

O que é uma tela de Splash?

Essas telas de aberturas, tecnicamente conhecidas como Splash Screens, são telas que são apresentadas ao usuário no primeiro instante em que ele abre a App, justamente para apresentarmos uma marca, ou então realizarmos algum tipo de pré prossamento que exige alguns segundos.


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirAutenticacao();
            }
        }, 3000);
    }


    private void abrirAutenticacao(){
        Intent i = new Intent(MainActivity.this, AutenticacaoActivity.class);
        startActivity(i);
        finish();
    }

### __AUTENTICAÇÃO JUNTO AO FIREBASE__
<BR/>

![image](https://user-images.githubusercontent.com/77402918/114593526-90807d80-9c62-11eb-9eb3-0e25b41d643e.png)


~~~
public class ConfiguracaoFirebase {

    private static DatabaseReference databaseReference;
    private static FirebaseAuth firebaseAuth;
    private static StorageReference referenciaStorage;

    public static DatabaseReference getFirebase() {
        if (databaseReference == null) {
            databaseReference = FirebaseDatabase.getInstance().getReference();
        }
        return databaseReference;
    }

    public static FirebaseAuth getFirebaseAutenticacao() {
        if (firebaseAuth == null) {
            firebaseAuth = FirebaseAuth.getInstance();
        }
        return firebaseAuth;
    }

    public static StorageReference getReferenciaStorage() {
        if (referenciaStorage == null) {
            referenciaStorage = FirebaseStorage.getInstance().getReference();
        }
        return referenciaStorage;
    }
}
~~~

### __IMPLEMENTAÇÃO DE IMAGEM REDONDA__
<BR/>

~~~
implementation 'de.hdodenhof:circleimageview:3.1.0'

        <de.hdodenhof.circleimageview.CircleImageView
            android:id="@+id/image_perfil"
            android:layout_width="match_parent"
            android:layout_height="120dp"
            android:layout_marginTop="8dp"
            app:civ_border_color="@color/preto"
            app:civ_border_width="2dp"
            android:layout_marginBottom="16dp"
            android:src="@drawable/perfil"/>

~~~
# Tela Splash de abertura

![1](https://user-images.githubusercontent.com/77402918/114596974-9d9f6b80-9c66-11eb-888a-f3bfa59d21aa.png)

# Tela de acesso e/ou registro

![2](https://user-images.githubusercontent.com/77402918/114597021-aa23c400-9c66-11eb-8f0a-9e39aa66fd5e.png)

# Tela de registro

![3](https://user-images.githubusercontent.com/77402918/114597073-b6a81c80-9c66-11eb-89e4-2470b667d4b6.png)


## Como contribuir

Contribuições são sempre bem-vindas. Existem várias maneiras de contribuir com este projeto, como:

💪 Se juntando ao time de desenvolvimento.<br/>
🌟 Dando uma estrela no projeto.<br/>
🐛 Reportando um Bug.<br/>
😅 Indicando um vacilo que eu possa ter cometido.<br/>
📄 Ajudando a melhorar a documentação.<br/>
🚀 Compartilhando este projeto com seus amigos.<br/>


## Status do Projeto

Esse é um projeto apenas para prática do que nos foi ensinado nos últimos encontros. 