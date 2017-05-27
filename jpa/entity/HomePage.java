package cn.springlogic.homepage.jpa.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2017/4/15.
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class HomePage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "module_type")
    private String moduleType;

    private String name;

    private String image;

    @Column(name = "create_time")
    @CreationTimestamp
    private Date createTime;

    //排序 ,从0开始
    private Integer rank;

}
