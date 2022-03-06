package com.example.parcergram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BKK6wYhQELtlU1FFHVzk6UQiGkdaho6KaIeQjRCT")
                .clientKey("Tmv7YeaskNamheOpwylfp1JKRQoNIUS9gh72A8cr")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
