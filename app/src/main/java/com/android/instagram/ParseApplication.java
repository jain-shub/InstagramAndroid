package com.android.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cdc8Nv4OY9DAhUBUAZFPrU9UkT5CxJsfbOjBqpNW")
                .clientKey("qCIQITUQ64VSf8MkL936IjMoehkLVwDU7MH5sp5x")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
