import first.AnagramUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Copyright 2019 (C) Xplo
 * <p>
 * Created  : 5/25/2019
 * Author   : Xplo
 * Version  : 1.0
 * Desc     : PACKAGE_NAME
 * Comment  :
 */
public class AnagramUtilsTest {

    @Test
    public void testIsAnagram(){

        assertTrue(AnagramUtils.isAnagram("table","bleat"));
        assertTrue(AnagramUtils.isAnagram("boy","oyb"));
        assertTrue(AnagramUtils.isAnagram("bbb","bbb"));
        assertTrue(AnagramUtils.isAnagram("student","sdtetun"));


        assertFalse(AnagramUtils.isAnagram("tbdle","bleat"));
        assertFalse(AnagramUtils.isAnagram("byd","oyb"));
        assertFalse(AnagramUtils.isAnagram("bbd","bbb"));
        assertFalse(AnagramUtils.isAnagram("suddent","sdtetun"));
        assertFalse(AnagramUtils.isAnagram("hello","helo"));




    }

    @Test
    public void testSortString(){
        assertEquals("ehllo",AnagramUtils.sortString("hello"));
        assertEquals("abc",AnagramUtils.sortString("cba"));
        assertEquals("",AnagramUtils.sortString(""));

        assertNotEquals("ehllo0",AnagramUtils.sortString("hello"));
        assertNotEquals("ehllo0",AnagramUtils.sortString("hello8"));
    }
}
