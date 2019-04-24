package com.cs3704.novel.repository;

import com.cs3704.novel.entity.Novel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class NovelRepository{
    private static Map<Integer, Novel> novels;

    static {
        novels = new HashMap<>();

        novels.put(1, new Novel(1, "novel1"));
        novels.put(2, new Novel(2, "novel2"));
    }

    public Collection<Novel> getNovels() {
        return novels.values();
    }

    public Novel getNovel(Integer id){
        return novels.get(id);
    }
}
