package fr.kira.formation.demo;

import org.junit.jupiter.api.Test;

public class MesTest {

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void fail() {
        assert false;
    }
}
