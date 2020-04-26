package com.kenny.travel.repository;

import com.kenny.travel.entity.Article;
import com.kenny.travel.entity.Consume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumeRepository extends JpaRepository<Consume,Integer> {
}
