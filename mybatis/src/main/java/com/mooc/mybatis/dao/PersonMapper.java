package com.mooc.mybatis.dao;

import com.mooc.mybatis.bean.Person;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface PersonMapper {

//     单参数处理
     public  void  deletePerson(Integer id);

//     多参数处理
//     public Person getPersonByNameAndGender(Person person);

//     多参数处理封装类
     public Person getPersonByNameAndGender(Person person);

//     封装成map
     public Person getPersonByNameAndGender(Map<String,Object> param);

//     注解@param
     public Person getPersonByNameAndGender(@Param("username") String username, String gender);

//     collection参数处理
//     public Person getPersonByCollection(Collection list);

//     public Person getPersonByCollection(@Param("test") int[] ids);
//      foreach案例
       public List<Person> getPersonsByIds(int[] ids);

//       批量插入案例
     public int addPersons(@Param("persons") List<Person> persons);

//     ExecutorType添加数据
     public int addPerson(Person person);


}
