package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {

    @Query(nativeQuery = true, value = "  SELECT  f.query as query,f.doc_id as docId, COUNT(*) AS cnt FROM " +
                    "    search_engine.tbl_feed_Back f " +
                    "GROUP BY " +
                    "    f.doc_id,f.query")
    List<Result> findFeedBackCount();
}
