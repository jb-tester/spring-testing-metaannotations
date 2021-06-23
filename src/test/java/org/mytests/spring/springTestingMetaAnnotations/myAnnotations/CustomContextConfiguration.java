package org.mytests.spring.springTestingMetaAnnotations.myAnnotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.GenericXmlContextLoader;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ContextConfiguration(loader =  GenericXmlContextLoader.class )
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
public @interface CustomContextConfiguration {


    /**
     * Overrides {@link ContextConfiguration#locations()}
     */
    @AliasFor(annotation = ContextConfiguration.class, attribute = "locations")
    String[] locations();
}