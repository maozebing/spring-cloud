package com.example.service1.api;

import com.example.service1.entity.TestEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
@Api(tags = "1.1", description = "用户管理", value = "用户管理")
public class TestAPI {

    @ApiOperation(value = "获取所有用户")
    @GetMapping()
    public ResponseEntity<List<TestEntity>> getTests() {
        List<TestEntity> list = new ArrayList<>();
        list.add(new TestEntity(1, "张三"));
        list.add(new TestEntity(2, "李四"));
        return ResponseEntity.ok(list);
    }

    @ApiOperation(value = "根据编号获取用户")
    //@ApiImplicitParam(name = "id", value = "用户编号", dataType = "long", paramType = "path")
    @GetMapping("/{id}")
    public ResponseEntity<TestEntity> getTest(@PathVariable("id") long id) {
        return ResponseEntity.ok(new TestEntity(1, "张三"));
    }

}
