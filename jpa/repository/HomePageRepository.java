package cn.springlogic.homepage.jpa.repository;

import cn.springlogic.homepage.jpa.entity.HomePage;
import cn.springlogic.homepage.jpa.entity.projection.HomePageFullProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by admin on 2017/4/15.
 */
@RepositoryRestResource(path="homepage:homepage", excerptProjection = HomePageFullProjection.class)
public interface HomePageRepository extends JpaRepository<HomePage,Integer>{

    @Query("select p from HomePage p where p.banner IS NULL order by p.rank asc")
    @RestResource(path = "all",rel = "all")
    Page<HomePage> findAllExceptBanner(Pageable pageable);

}
