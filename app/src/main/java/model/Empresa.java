package model;

import com.google.firebase.database.DatabaseReference;

import helpers.ConfiguracaoFirebase;

public class Empresa {

    private String idUsuario;
    private String nome;
    private String tempo;
    private String categoria;
    private Double precoEntrega;

    public Empresa () {

    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecoEntrega() {
        return precoEntrega;
    }

    public void setPrecoEntrega(Double precoEntrega) {
        this.precoEntrega = precoEntrega;
    }

    public void salvar (){
        DatabaseReference firebaseRef = ConfiguracaoFirebase.getFirebase    ();
        DatabaseReference empresaRef = firebaseRef.child("empresa")
                .child(getIdUsuario());

        empresaRef.setValue(this);
    }
}
