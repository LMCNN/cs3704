package com.cs3704.novel;

import com.cs3704.novel.entity.Author;
import com.cs3704.novel.entity.Novel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthorTests {
    private Author testAuthor;

    @Before
    public void setUp() throws Exception {
        testAuthor = new Author(1, "username", "name", "123", "test@test");
    }

    //    Unit Test 1
    @Test
    public void TestGetId() {
        Assert.assertEquals(testAuthor.getId(), 1);
    }

    //    Unit Test 2
    @Test
    public void TestSetId() {
        testAuthor.setId(2);
        Assert.assertEquals(testAuthor.getId(), 2);
    }

    //    Unit Test 3
    @Test
    public void TestGetUsername() {
        Assert.assertEquals(testAuthor.getUserName(), "username");
    }

    //    Unit Test 4
    @Test
    public void TestGetName() {
        Assert.assertEquals(testAuthor.getName(), "name");
    }

    //    Unit Test 5
    @Test
    public void TestSetName(){
        testAuthor.setName("new_name");
        Assert.assertEquals(testAuthor.getName(), "new_name");
        Assert.assertNotEquals(testAuthor.getName(), "name");
    }

    //    Unit Test 6
    @Test
    public void TestGetPassword(){
        Assert.assertEquals(testAuthor.getPassword(), "123");
    }

    //    Unit Test 7
    @Test
    public void TestSetPassword() {
        testAuthor.setPassword("123456");
        Assert.assertEquals(testAuthor.getPassword(), "123456");
        Assert.assertNotEquals(testAuthor.getPassword(), "123");
    }

    //    Unit Test 8
    @Test
    public void TestGetContact() {
        Assert.assertEquals(testAuthor.getContact(), "test@test");
    }

    //    Unit Test 9
    @Test
    public void TestSetContact() {
        testAuthor.setContact("new@test");
        Assert.assertEquals(testAuthor.getContact(), "new@test");
        Assert.assertNotEquals(testAuthor.getContact(), "test@test");
    }

    //    Unit Test 10
    @Test
    public void TestGetNovels() {
        testAuthor.addNovel(new Novel(1, "title1"));
        Assert.assertEquals(testAuthor.getNovels().toString(),"[Department [id=1, title=title1]]");
    }
    
    //    Unit Test 11
    @Test
    public void TestAddNovels() {
        Assert.assertEquals(testAuthor.getNovels().toString(), "[]");
        testAuthor.addNovel(new Novel(1, "title1"));
        Assert.assertEquals(testAuthor.getNovels().toString(),"[Department [id=1, title=title1]]");
        testAuthor.addNovel(new Novel(2, "title2"));
        Assert.assertEquals(testAuthor.getNovels().toString(), 
                "[Department [id=1,title=title1], [Department [id=2,title=title2]]");
    }

    //    Unit Test 12
    @Test
    public void TestToString() {
        Assert.assertEquals(testAuthor.toString(),
                "Employee{id=1, userName='username', name='name', contact='test@test'}");
    }
}
