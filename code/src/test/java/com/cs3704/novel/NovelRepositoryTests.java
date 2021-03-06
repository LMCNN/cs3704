package com.cs3704.novel;

import com.cs3704.novel.repository.NovelRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NovelRepositoryTests {

    private NovelRepository novelRepository;

    @Before
    public void setUp() throws Exception {
        novelRepository = new NovelRepository();
    }

    //    Unit Test 23
    @Test
    public void TestALL() {
        Assert.assertEquals(novelRepository.getNovels().toString(),
                "[Novel [id=1, title=novel1], Novel [id=2, title=novel2]]");

        Assert.assertEquals(novelRepository.getNovel(1).toString(),
                "Novel [id=1, title=novel1]");
    }

    //    Unit Test 24
    @Test
    public void TestNULL() {
        Assert.assertNull(novelRepository.getNovel(0));
    }

    //    Unit Test 25
    @Test
    public void TestNovels() {
        NovelRepository novelRepository2 = new NovelRepository();
        Assert.assertEquals(novelRepository.getNovels(), novelRepository2.getNovels());
    }
}
