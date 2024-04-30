package com.sismics.util;

import com.sismics.util.JsonUtil;
import org.junit.Test;

import javax.json.JsonValue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestJson {

    @Test
    public void nullableStringReturnsJsonValueForNonNullInput() {
        String input = "test";
        JsonValue result = JsonUtil.nullable(input);
        assertEquals(input, result.toString());
    }

    @Test
    public void nullableStringReturnsNullJsonValueForNullInput() {
        String input = null;
        JsonValue result = JsonUtil.nullable(input);
        assertTrue(result == JsonValue.NULL);
    }

    @Test
    public void nullableIntegerReturnsJsonValueForNonNullInput() {
        Integer input = 123;
        JsonValue result = JsonUtil.nullable(input);
        assertEquals(input.toString(), result.toString());
    }

    @Test
    public void nullableIntegerReturnsNullJsonValueForNullInput() {
        Integer input = null;
        JsonValue result = JsonUtil.nullable(input);
        assertTrue(result == JsonValue.NULL);
    }

    @Test
    public void nullableLongReturnsJsonValueForNonNullInput() {
        Long input = 123L;
        JsonValue result = JsonUtil.nullable(input);
        assertEquals(input.toString(), result.toString());
    }

    @Test
    public void nullableLongReturnsNullJsonValueForNullInput() {
        Long input = null;
        JsonValue result = JsonUtil.nullable(input);
        assertTrue(result == JsonValue.NULL);
    }
}