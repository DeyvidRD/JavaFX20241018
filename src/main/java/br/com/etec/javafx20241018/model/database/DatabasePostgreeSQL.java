package br.com.etec.javafx20241018.model.database;

import java.sql.Connection;

public class DatabasePostgreeSQL implements Database{

    @Override
    public Connection conectar() {
        return null;
    }

    @Override
    public void desconectar() {

    }
}