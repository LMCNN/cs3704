package com.cs3704.novel;

import com.cs3704.novel.entity.Author;
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

    //    Unit Test 17
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

    //    Unit Test 18
    @Test
    public void TestFindByUserName() {
        Assert.assertNull(authorRepository.findByUserName("test"));
        Assert.assertEquals(authorRepository.findByUserName("admin").getPassword(),"123456");
    }
}
