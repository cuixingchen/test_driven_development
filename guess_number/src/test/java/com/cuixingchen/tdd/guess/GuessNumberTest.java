package com.cuixingchen.tdd.guess;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * 目标字符"1234"
 * 入参："1234"、"4321"、"1243"
 * 输出：4A0B、0A4B、2A2B
 *
 * Created by cuipengfei1 on 2018/5/16.
 */
public class GuessNumberTest {

    @Test
    public void input_1234_should_return_4A0B(){
        assertThat(GuessNumberService.deal("1234")).isEqualTo("4A0B");
    }

    @Test
    public void input_4321_should_return_0A4B(){
        assertThat(GuessNumberService.deal("4321")).isEqualTo("0A4B");
    }

    @Test
    public void input_1243_should_return_2A2B(){
        assertThat(GuessNumberService.deal("1243")).isEqualTo("2A2B");
    }

    @Test
    public void input_null_should_throwException(){
        try {
            GuessNumberService.deal(null);
        } catch (Exception e) {
            assertThat(e).hasMessage("参数非法");
        }
    }

    @Test
    public void input_123456_should_throwException(){
        try {
            GuessNumberService.deal("123456");
        } catch (Exception e) {
            assertThat(e).hasMessage("参数非法");
        }
    }

    @Test
    public void input_1244_should_return_3A1B(){
        assertThat(GuessNumberService.deal("1244")).isEqualTo("3A1B");
    }


}
