## Spring Testing: meta-annotations for @ContextConfiguration

<ul>
<li> <b>meta-annotation that doesn't provide default location and uses @AliasFor annotation with explicitly specified attributes for attribute that aliases 'location' :</b> 
   <p>annotation class - </p>
   <span style="color: green">org.mytests.spring.springTestingMetaAnnotations.myAnnotations.CustomContextConfiguration</span>
   <p>test class - </p>
   <span style="color: green">org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestCustomMetaAnnotation</span>:
   <span style="color:blue">ok</span>.
</li>
<li> <b>meta-annotation that provides the default locations and uses @AliasFor annotation with explicitly specified attributes for attribute that aliases 'location' : </b>
   <p>annotation class -</p> 
  <span style="color: green">org.mytests.spring.springTestingMetaAnnotations.myAnnotations.CustomContextConfigurationWithDefaults</span>
   <p>test class that specifies the location explicitly -</p>
  <span style="color: green">org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestCustomMetaAnnotationWithDefaultsWithValue</span> : <span style="color:blue">ok</span>.
   <p>test class that uses default location from metaannotation -</p> 
  <span style="color: green">org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestCustomMetaAnnotationWithDefaultsNoValue</span> : <span style="color:red">context is not recognized</span>.
</li>
<li> <b>meta-annotation that provides the default locations and uses @AliasFor annotation without explicitly specified attributes for attribute that aliases 'location' :</b>
   <p>annotation class -</p> 
  <span style="color: green">org.mytests.spring.springTestingMetaAnnotations.myAnnotations.DefaultContextConfiguration</span>
   <p>test class that specifies the location explicitly -</p> 
  <span style="color: green">org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestDefaultMetaAnnotationWithValue</span> : <span style="color:red">incorrect context is used</span>.

   <p>test class that uses default location from metaannotation -</p> 
  <span style="color: green">org.mytests.spring.springTestingMetaAnnotations.contextConfigurationMetaTests.TestDefaultMetaAnnotationWithDefaults</span> : <span style="color:blue">ok</span>.
</li>
</ul>
<a href="https://youtrack.jetbrains.com/issue/IDEA-180603">IDEA-180603</a>