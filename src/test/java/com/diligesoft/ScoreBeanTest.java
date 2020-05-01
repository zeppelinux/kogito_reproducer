package com.diligesoft;

import com.diligesoft.sheelon.beans.ScoreBean;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
public class ScoreBeanTest {

    @Inject
    ScoreBean scoreBean;

    @Test
    public void testIt() {
        assertTrue(scoreBean.getFactorValues().isEmpty());
    }
}
