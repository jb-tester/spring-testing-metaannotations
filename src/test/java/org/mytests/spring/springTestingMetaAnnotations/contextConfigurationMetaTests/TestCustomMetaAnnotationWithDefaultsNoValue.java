package org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mytests.spring.springTestingMetaAnnotations.beans.Bean2;
import org.mytests.spring.springTestingMetaAnnotations.myAnnotations.CustomContextConfigurationWithDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@CustomContextConfigurationWithDefaults     // context is not recognized
public class TestCustomMetaAnnotationWithDefaultsNoValue {

    @Autowired
    private Bean2 b2;  // bean is not navigable

    @Test
    public void testB2() throws Exception {
        Assert.assertEquals(b2.getId(),"b2_from_beans");

    }
}
