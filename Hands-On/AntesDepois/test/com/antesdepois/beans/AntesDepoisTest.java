package com.antesdepois.beans;

import org.junit.*;

import static org.junit.Assert.*;

public class AntesDepoisTest {

    @Before
    public void before(){
        System.out.println("@Before");
    }

    @After
    public void after(){
        System.out.println("@After");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("@AfterClass");
    }

    @Test
    public void test1(){
        System.out.println("Teste 1");
    }

    @Test
    public void test2(){
        System.out.println("Teste 2");
    }

    @Test
    public void test3(){
        System.out.println("Teste 3");
    }
}