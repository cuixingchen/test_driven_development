package com.cuixingchen.tdd.permutation;

import org.junit.Test;

import java.util.Arrays;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * 不同字符的全排列
 * 输入："abcd" 出参：全排列
 * 例如："ab"->"ab","ba"
 * Created by cuipengfei1 on 2018/5/16.
 */
public class PermutationTest {

    @Test
    public void input_a_should_return_a(){
        assertThat(PermutationService.deal("a")).isEqualTo(Arrays.asList("a"));
    }

    @Test
    public void input_ab_should_return_2(){
        assertThat(PermutationService.deal("ab")).isEqualTo(Arrays.asList("ab","ba"));
    }

    @Test
    public void input_abc_should_return_6(){
        assertThat(PermutationService.deal("abc")).isEqualTo(Arrays.asList("abc","acb","bac","bca","cab","cba"));
    }
}

