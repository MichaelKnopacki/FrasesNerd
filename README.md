# FrasesNerd
![frases](https://user-images.githubusercontent.com/77402918/114590603-5a8dca00-9c5f-11eb-8a08-e527212a1e8d.jpg)

## Descrição

Nesse projeto criamos a junção de alguns recursos práticados nos últimos encontros. Abaixo vou citar um a um:

### SPLASH

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



## Como contribuir

Aqui você pode colocar

Contribuições são sempre bem-vindas. Existem várias maneiras de contribuir com este projeto, como:

💪 Se juntando ao time de desenvolvimento.<br/>
🌟 Dando uma estrela no projeto.<br/>
🐛 Reportando um Bug.<br/>
😅 Indicando um vacilo que eu possa ter cometido.<br/>
📄 Ajudando a melhorar a documentação.<br/>
🚀 Compartilhando este projeto com seus amigos.<br/>
## Licença

Aqui você coloca o tipo de licença que o projeto precisa. (MIT, GNU ou afins)

## Status do Projeto

Aqui você informa como está o andamento do projeto. ( Finalizado, andamento, congelado e afins).