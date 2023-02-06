package org.example.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    //SpringDataJpa에서 제공하지 않는 메소드는 아래와 같이 쿼리(@Query)로 작성해도 됨을 보여주는 예시
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

    /**위 쿼리는 예제일 뿐 SpringDataJpa에서 제공하는 기본 메소드 만으로 해결할 수 있음 다만 가독성 측면에서
     * @Query를 사용하는 것이 훨씬 가독성이 좋으니 선택해서 사용하도록 하자
     */
}
