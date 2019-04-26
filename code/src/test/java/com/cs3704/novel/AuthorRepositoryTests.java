package com.cs3704.novel;

import com.cs3704.novel.entity.Author;
import com.cs3704.novel.entity.Novel;
import com.cs3704.novel.repository.AuthorRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AuthorRepositoryTests {
    private AuthorRepository authorRepository;

    @Before
    public void setUp() throws Exception {
        authorRepository = new AuthorRepository();
    }

    //    Unit Test 19
    @Test
    public void TestGetAll() {

        // Test GetAll
        Assert.assertEquals(authorRepository.findAll().size(), 2);
        Assert.assertEquals(authorRepository.findAll().toArray()[0].toString(),
                "Author{id=1, userName='admin', name='superuser', contact='admin@abc'}");
        Assert.assertEquals(authorRepository.findAll().toArray()[1].toString(),
                "Author{id=2, userName='mingchi', name='mingchi', contact='mingchi@abc'}");

        // Test Get
        Assert.assertEquals(authorRepository.get(1).toString(),
                "Author{id=1, userName='admin', name='superuser', contact='admin@abc'}");

        //Test Save
        authorRepository.save(new Author(3, "test3", "test3", "test3", "test3@test"));
        Assert.assertEquals(authorRepository.findAll().size(), 3);

        //Test Delete
        authorRepository.delete(3);
        Assert.assertEquals(authorRepository.findAll().size(), 2);
    }

    //    Unit Test 20
    @Test
    public void TestFindByUserName() {
        Assert.assertNull(authorRepository.findByUserName("test"));
        Assert.assertEquals(authorRepository.findByUserName("admin").getPassword(),"123456");
    }
    //    Unit Test 21
    @Test
    public void TestFindIdByName(){
        Assert.assertTrue(authorRepository.findIdByName("admin")==1);
        Assert.assertNull(authorRepository.findIdByName("test"));
    }

    //    Unit Test 22
    @Test
    public void TestAddNovel(){
        Novel novel = new Novel(1, "testTitle");
        authorRepository.addNovel(1, novel);
        Assert.assertEquals(authorRepository.get(1).getNovels().toString(), "[Novel [id=1, title=testTitle]]");
        Assert.assertEquals(novel.getAuthors().toString(),
                "[Author{id=1, userName='admin', name='superuser', contact='admin@abc'}]");
    }
}
