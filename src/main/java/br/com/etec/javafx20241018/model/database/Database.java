package br.com.etec.javafx20241018.model.database;

import java.sql.Connection;
public interface Database {

    public Connection conectar();

    public void desconectar();
}