package com.fintonic.fintonictestchallenge;

import com.fintonic.fintonictestchallenge.utils.StringUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kiketurry on 29/08/2017.
 */

public class StringUtilsTest {
    
    @Test
    public void testConcatenate() throws Exception {
        String result = StringUtils.nickAndName("Lobezno", "Logan");
        assertEquals("Lobezno (Logan)", result);
    }
    
}
