package com.example.service1.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 描述 ：
 *
 * @author MZB
 * @version v1.00
 * @date 2019/2/22 9:49
 * @update : 修改人，修改时间，修改内容
 */
@Getter
@Setter
public class TestEntity {

    private long id;
    private String name;

    public TestEntity(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
