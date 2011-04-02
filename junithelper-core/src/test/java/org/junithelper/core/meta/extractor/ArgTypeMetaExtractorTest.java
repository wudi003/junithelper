package org.junithelper.core.meta.extractor;

import org.junit.Test;
import org.junithelper.core.config.Configulation;
import org.junithelper.core.meta.ClassMeta;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArgTypeMetaExtractorTest {

    @Test
    public void type() throws Exception {
        assertNotNull(ArgTypeMetaExtractor.class);
    }

    @Test
    public void instantiation() throws Exception {
        Configulation config = null;
        ArgTypeMetaExtractor target = new ArgTypeMetaExtractor(config);
        assertNotNull(target);
    }

    @Test
    public void initialize_A$String() throws Exception {
        Configulation config = new Configulation();
        ArgTypeMetaExtractor target = new ArgTypeMetaExtractor(config);
        String sourceCodeString = "package hoge.foo; public class Sample { public Sample() {}\r\n public void doSomething(String str) { System.out.println(\"aaaa\") } }";
        target.initialize(sourceCodeString);
    }

    @Test
    public void initialize_A$ClassMeta$String() throws Exception {
        Configulation config = new Configulation();
        ArgTypeMetaExtractor target = new ArgTypeMetaExtractor(config);
        String sourceCodeString = "package hoge.foo; public class Sample { public Sample() {}\r\n public void doSomething(String str) { System.out.println(\"aaaa\") } }";
        ClassMeta classMeta = new ClassMetaExtractor(config)
                .extract(sourceCodeString);
        target.initialize(classMeta, sourceCodeString);
    }

    @Test
    public void doExtract_A$String() throws Exception {
        Configulation config = new Configulation();
        ArgTypeMetaExtractor target = new ArgTypeMetaExtractor(config);
        String sourceCodeString = "package hoge.foo; public class Sample { public Sample() {}\r\n public void doSomething(String str) { System.out.println(\"aaaa\") } }";
        target.initialize(sourceCodeString);
        String argsAreaString = "String str";
        target.doExtract(argsAreaString);
        assertEquals(target.getExtractedMetaList().size(), 1);
        assertEquals(target.getExtractedMetaList().get(0).name, "String");
        assertEquals(target.getExtractedNameList().size(), 1);
        assertEquals(target.getExtractedNameList().get(0), "str");
    }

    @Test
    public void initialize_A$ClassMeta() throws Exception {
        Configulation config = new Configulation();
        ArgTypeMetaExtractor target = new ArgTypeMetaExtractor(config);
        // given
        ClassMeta classMeta = mock(ClassMeta.class);
        // e.g. : given(mocked.called()).willReturn(1);
        // when
        ArgTypeMetaExtractor actual = target.initialize(classMeta);
        // then
        // e.g. : verify(mocked).called();
        ArgTypeMetaExtractor expected = target;
        assertEquals(expected, actual);
    }

}
