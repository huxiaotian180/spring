package com.imooc.aspect.demo2;

public class CustomerDaoImpl implements CustomerDao {
    public void save() {
        System.out.println("保存客户...");
    }

    public String update() {
        System.out.println("修改客户...");
        return "spring";
    }

    public void delete() {
        System.out.println("删除客户...");
    }

    public void findOne() {
        System.out.println("查询一个客户...");
//       int a = 1/ 0;
    }

    public void findAll() {
        System.out.println("查询多个客户...");
//        int b = 1/0;
    }
}
