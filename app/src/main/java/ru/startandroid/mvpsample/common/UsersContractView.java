package ru.startandroid.mvpsample.common;

import java.util.List;

import ru.startandroid.mvpsample.mvp.UserData;

public interface UsersContractView {
    UserData getUserData();

    void showUsers(List<User> users);

    void showToast(int resId);

    void showProgress();

    void hideProgress();
}
