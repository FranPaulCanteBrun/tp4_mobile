package com.example.app_tp4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class UserLiveViewModel extends ViewModel {
    private MutableLiveData<List<Usuario>> listaUsuariosLiveData;
    private List<Usuario> listaUsuarios;

    public LiveData<List<Usuario>> getUserList() {
        if (listaUsuariosLiveData == null) {
            listaUsuariosLiveData = new MutableLiveData<>();
            listaUsuarios = new ArrayList<>();
        }
        return listaUsuariosLiveData;
    }

    public void addUser(Usuario usuario) {
        listaUsuarios.add(usuario);
        listaUsuariosLiveData.setValue(listaUsuarios);
    }
}
