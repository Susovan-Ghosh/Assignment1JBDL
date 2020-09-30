package com.JBDL.Assignment1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface BookRepository extends JpaRepository<Book, Long> {

    // JPQL
    @Transactional
    @Modifying
    @Query("UPDATE Book b SET b.authorName = :name WHERE b.authorName LIKE 'Will %' or  b.authorName = 'Will'")
    public void updateNames(@Param("name") String name);

    // Native MySQL
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Book b WHERE b.cost > :cost", nativeQuery = true)
    public void deleteEntries(@Param("cost") int cost);

}
