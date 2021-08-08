package com.example.bookfromlistapp;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bookfromlistapp.model.VolumeInfo;
import com.example.bookfromlistapp.retrofit.RetrofitClient;
import com.example.bookfromlistapp.retrofit.RetrofitInstance;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class BooksViewModel extends ViewModel {
    private MutableLiveData<VolumeInfo> mutableLiveData;
    RetrofitClient retrofitClient;
    CompositeDisposable compositeDisposable;
    public BooksViewModel(){
        mutableLiveData= new MutableLiveData<>();

    }
    MutableLiveData<VolumeInfo> getbooksobserve(){

        return mutableLiveData;
    }


    void Apicall(String q){
        compositeDisposable =new CompositeDisposable();
        retrofitClient= RetrofitInstance.getretroift().create(RetrofitClient.class);
        compositeDisposable.add(retrofitClient.getBooksfromApi(q)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(volumeInfo -> {
                    mutableLiveData.postValue(volumeInfo);

                }, throwable -> Log.i("Error",throwable.getMessage())));


    }


}
