package io.leangen.graphql.annotations;

import io.leangen.graphql.util.ReservedStrings;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface GraphQLSubscription {

    String name() default "";

    String description() default "";

    String deprecationReason() default ReservedStrings.NULL;
}
