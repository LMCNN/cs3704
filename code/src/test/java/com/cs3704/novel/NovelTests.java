package com.cs3704.novel;

import com.cs3704.novel.entity.Author;
import com.cs3704.novel.entity.Novel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NovelTests {
    private Novel testNovel;

    @Before
    public void setUp() throws Exception {
        testNovel = new Novel(1, "title");
    }

    //    Unit Test 13
    @Test
    public void TestGetId() {
        Assert.assertEquals(testNovel.getId(), 1);
    }

    //    Unit Test 14
    @Test
    public void TestGetTitle() {
        Assert.assertEquals(testNovel.getTitle(), "title");
    }

    //    Unit Test 15
    @Test
    public void TestSetTitle() {
        testNovel.setTitle("new_title");
        Assert.assertEquals(testNovel.getTitle(), "new_title");
    }

    //    Unit Test 16
    @Test
    public void TestToString() {
        Assert.assertEquals(testNovel.toString(), "Novel [id=1, title=title]");
    }

    //    Unit Test 17
    @Test
    public void TestGetAuthors() {
        testNovel.addAuthor(new Author(1, "username", "name", "123", "test@test"));
        Assert.assertEquals(testNovel.getAuthors().toString(),
                "[Author{id=1, userName='username', name='name', contact='test@test'}]");
    }
    
//  Unit Test 18
  @Test
  public void TestAddAuthors() {
      Assert.assertEquals(testNovel.getAuthors().toString(), "[]");
      testNovel.addAuthor(new Author(1, "username", "name", "123", "test@test"));
      Assert.assertEquals(testNovel.getAuthors().toString(),
              "[Author{id=1, userName='username', name='name', contact='test@test'}]");
      testNovel.addAuthor(new Author(2, "username2", "name2", "1232", "test2@test"));
      Assert.assertEquals(testNovel.getAuthors().toString(),
              "[Author{id=1, userName='username', name='name', contact='test@test'},"
              + "Author{id=2, userName='username2', name='name2', contact='test2@test'}]");
  }
}
