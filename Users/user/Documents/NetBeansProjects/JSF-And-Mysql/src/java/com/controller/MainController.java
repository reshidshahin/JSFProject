package com.controller;

import com.database.ListQuery;
import com.model.Student;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Shahin_Rashidbayli
 */
@ManagedBean(name = "main")
@SessionScoped
public class MainController implements Serializable {

    ListQuery query = new ListQuery();
    private List<Student> list = new ArrayList<Student>();

    public List<Student> getList() {
        list = query.listStudent();
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

}
