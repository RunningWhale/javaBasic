package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.Provice;

public class TestJson {
    public static void main(String[] args) throws JsonProcessingException {
        Provice provice=new Provice();
        provice.setId(1);
        provice.setName("陕西");
        provice.setJiancheng("秦");
        provice.setShenghui("西安");
        ObjectMapper om=new ObjectMapper();
        String json = om.writeValueAsString(provice);
        System.out.println(json);
    }
}
