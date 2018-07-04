package com.udacity.gradle.builditbigger.backend;

import com.andalus.abomed7at55.jokeslibrary.JokeClass;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    /**
     * This method displays a random joke from the jokes library
     * @param flavor a key to define whether the app is in its free flavor or paid flavor
     * @return a random joke from the jokes library
     */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke(@Named("flavor") String flavor) {
        MyBean response = new MyBean();
        JokeClass jokeClass = new JokeClass();
        if(flavor.equals(JokeClass.FLAVOR_PAID)){
            jokeClass.addPremiumJokes();
        }
        response.setData(jokeClass.getJoke());

        return response;
    }

}
