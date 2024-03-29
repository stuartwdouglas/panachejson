package io.quarkus.panache.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Rename {

    String oldName();

    String newName();

}
