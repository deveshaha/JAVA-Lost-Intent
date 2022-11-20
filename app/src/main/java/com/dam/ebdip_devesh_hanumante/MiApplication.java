package com.dam.ebdip_devesh_hanumante;

import android.app.Application;

public class MiApplication extends Application {
    private String usuario;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
