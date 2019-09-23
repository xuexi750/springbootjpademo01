package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //声明一张表
@Table(name = "tb_persion")  //表的名称
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id //主键
    @GeneratedValue //自增的
    private Long id;

    @Column(name = "name" ,nullable = false,length = 100) //自定义名字,是否可以为空,长度
    private String name;

    @Column(name = "age",nullable = true,length = 10)
    private Integer age;


}
