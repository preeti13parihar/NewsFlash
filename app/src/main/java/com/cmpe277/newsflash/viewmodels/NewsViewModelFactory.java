package com.cmpe277.newsflash.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.cmpe277.newsflash.repository.NewsRepository;

public class NewsViewModelFactory implements ViewModelProvider.Factory {
    private Application application;
    private NewsRepository newsRepository;

    public NewsViewModelFactory(Application application) {
        this.application = application;
        newsRepository = NewsRepository.getInstance(application);
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new NewsViewModel(application, newsRepository);

    }
}
