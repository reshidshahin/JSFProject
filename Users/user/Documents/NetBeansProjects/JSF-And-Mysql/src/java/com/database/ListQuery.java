/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import com.model.Student;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class ListQuery extends DBConnection implements Serializable {

    public List<Student> listStudent() {
        List<Student> list = new ArrayList<Student>();
        try {

            ps = connect().prepareStatement("select id,name,surname,age from sinama.student");
            Student s;
            rs = ps.executeQuery();

            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setSurname(rs.getString("surname"));
                s.setAge(rs.getInt("age"));
                list.add(s);
            }

            return list;
        } catch (Exception e) {
            return null;
        }
    }
}
