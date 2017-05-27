package cn.springlogic.homepage.jpa.entity.projection;

import cn.springlogic.homepage.jpa.entity.HomePage;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

/**
 * Created by kinginblue on 2017/5/8.
 */
@Projection(name = "full", types = {HomePage.class})
public interface HomePageFullProjection {

    Integer getId();

    String getModuleType();

    String getName();

    String getImage();

    Date getCreateTime();

}
