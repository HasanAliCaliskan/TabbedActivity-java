package com.hasanali.tabbedjavafragment.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel{

    // Değişebilen canlı veri
    private MutableLiveData<String> nameInput = new MutableLiveData<>();

    public void setName(String name){
        nameInput.setValue(name);
    }

    public LiveData<String> getName() {
        return nameInput;
    }

}