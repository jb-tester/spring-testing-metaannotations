package org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mytests.spring.springTestingMetaAnnotations.beans.Bean2;
import org.mytests.spring.springTestingMetaAnnotations.myAnnotations.CustomContextConfigurationWithDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@CustomContextConfigurationWithDefaults(locations = "/custom_beans.xml")  // ok
public class TestCustomMetaAnnotationWithDefaultsWithValue {

    @Autowired
    private Bean2 b2; // ok
    @Test
    public void testB2() throws Exception {
        Assert.assertEquals(b2.getId(),"b2_from_custom_beans");

    }
}
