package org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mytests.spring.springTestingMetaAnnotations.beans.Bean2;
import org.mytests.spring.springTestingMetaAnnotations.myAnnotations.DefaultContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// https://youtrack.jetbrains.com/issue/IDEA-180603
@RunWith(SpringJUnit4ClassRunner.class)
@DefaultContextConfiguration(locations = "/custom_beans.xml") // navigates to beans.xml instead of custom_beans.xml
public class TestDefaultMetaAnnotationWithValue {

    @Autowired
    private Bean2 b2;  // navigates to bean from beans.xml
    @Test
    public void testB2() throws Exception {
        Assert.assertEquals(b2.getId(),"b2_from_custom_beans");

    }
}
