package org.junithelper.command;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ForceJUnitVersion4CommandTest {

    @Test
    public void type() throws Exception {
        assertNotNull(ForceJUnitVersion4Command.class);
    }

    @Test
    @Ignore
    public void main_A$StringArray() throws Exception {
        // given
        String[] args = new String[] {};
        // when
        ForceJUnitVersion4Command.main(args);
        // then
    }

    @Test
    @Ignore
    public void main_A$StringArray_T$Exception() throws Exception {
        // given
        String[] args = new String[] {};
        try {
            // when
            ForceJUnitVersion4Command.main(args);
            fail("Expected exception was not thrown!");
        } catch (Exception e) {
            // then
        }
    }

}
