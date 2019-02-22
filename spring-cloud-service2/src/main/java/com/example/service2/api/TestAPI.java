package com.example.service2.api;

import com.example.service2.entity.TestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述 ：
 *
 * @author MZB
 * @version v1.00
 * @date 2019/2/22 9:50
 * @update : 修改人，修改时间，修改内容
 */
@RestController
@RequestMapping(value = "test")
public class TestAPI {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<TestEntity>> getTests() {
        List<TestEntity> list = new ArrayList<>();
        list.add(new TestEntity(1, "王二"));
        list.add(new TestEntity(2, "刘大"));
        return ResponseEntity.ok(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<TestEntity> getTest(@PathVariable("id") long id) {
        return ResponseEntity.ok(new TestEntity(id, "王二"));
    }

}
