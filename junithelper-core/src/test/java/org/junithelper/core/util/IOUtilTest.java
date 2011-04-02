package org.junithelper.core.util;

import org.junit.Test;

import java.io.*;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class IOUtilTest {

    @Test
    public void type() throws Exception {
        assertNotNull(IOUtil.class);
    }

    @Test
    public void getResourceAsStream_A$String() throws Exception {
        String name = "parser/impl/Sample.txt";
        InputStream actual = IOUtil.getResourceAsStream(name);
        assertNotNull(actual);
        IOUtil.close(actual);
    }

    @Test
    public void close_A$FileOutputStream() throws Exception {
        FileOutputStream fos = null;
        IOUtil.close(fos);
    }

    @Test
    public void readAsString_A$InputStream$String() throws Exception {
        String name = "parser/impl/Sample.txt";
        InputStream is = IOUtil.getResourceAsStream(name);
        String actual = IOUtil.readAsString(is, null);
        String expected = "package org.junithelper.core.parser.impl;\r\n\r\npublic class Sample {\r\n\r\n	public String doSomething(String arg) throws Exception {\r\n		// do something\r\n	}\r\n\r\n}\r\n";
        assertEquals(expected, actual);
    }

    @Test
    public void close_A$InputStream() throws Exception {
        InputStream is = null;
        IOUtil.close(is);
    }

    @Test
    public void close_A$InputStreamReader() throws Exception {
        InputStreamReader isr = null;
        IOUtil.close(isr);
    }

    @Test
    public void close_A$BufferedReader() throws Exception {
        BufferedReader br = null;
        IOUtil.close(br);
    }

    @Test
    public void close_A$BufferedInputStream() throws Exception {
        BufferedInputStream bis = null;
        IOUtil.close(bis);
    }

    @Test
    public void close_A$OutputStreamWriter() throws Exception {
        OutputStreamWriter osw = null;
        IOUtil.close(osw);
    }

    @Test
    public void readAsLineList_A$InputStream() throws Exception {
        // given
        String name = "parser/impl/Sample.txt";
        InputStream is = IOUtil.getResourceAsStream(name);
        // e.g. : given(mocked.called()).willReturn(1);
        // when
        List<String> actual = IOUtil.readAsLineList(is);
        // then
        // e.g. : verify(mocked).called();
        assertNotNull(actual);
    }

    @Test
    public void readAsLineList_A$InputStream_E$IOException() throws Exception {
        // given
        InputStream is = mock(InputStream.class);
        try {
            // when
            IOUtil.readAsLineList(is);
            fail("Expected exception was not thrown!");
        } catch (IOException e) {
            // then
        }
    }

}
