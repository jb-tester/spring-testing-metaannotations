## Spring Testing: meta-annotations for @ContextConfiguration

<ul>
<li> meta-annotation that doesn't provide default location and uses @AliasFor annotation with explicitly specified attributes for attribute that aliases 'location' : 
   <p>annotation class - </p>
   org.mytests.spring.springTestingMetaAnnotations.myAnnotations.CustomContextConfiguration
   <p>test class - </p>
   org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestCustomMetaAnnotation
   <span style="color:blue">ok</span>.
</li>
<li> meta-annotation that provides the default locations and uses @AliasFor annotation with explicitly specified attributes for attribute that aliases 'location' : 
   <p>annotation class -</p> 
  org.mytests.spring.springTestingMetaAnnotations.myAnnotations.CustomContextConfigurationWithDefaults
   <p>test class that specifies the location explicitly -</p>
  org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestCustomMetaAnnotationWithDefaultsWithValue : <span style="color:blue">ok</span>.
   <p>test class that uses default location from metaannotation -</p> 
  org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestCustomMetaAnnotationWithDefaultsNoValue: <span style="color:red">context is not recognized</span>.
</li>
<li> meta-annotation that provides the default locations and uses @AliasFor annotation without explicitly specified attributes for attribute that aliases 'location' :
   <p>annotation class -</p> 
  org.mytests.spring.springTestingMetaAnnotations.myAnnotations.DefaultContextConfiguration
   <p>test class that specifies the location explicitly -</p> 
  org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestDefaultMetaAnnotationWithValue : <span style="color:red">incorrect context is used</span>.

   <p>test class that uses default location from metaannotation -</p> 
  org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestDefaultMetaAnnotationWithDefaults: <span style="color:blue">ok</span>.
</li>
</ul>
<a href="https://youtrack.jetbrains.com/issue/IDEA-180603">IDEA-180603</a>