package com.afoth.experiments.matprop;

import com.afoth.experiments.matprop.domain.Material;
import com.afoth.experiments.matprop.domain.Properties;
import com.afoth.experiments.matprop.domain.properties.Density;
import com.afoth.experiments.matprop.domain.properties.MeltingPoint;
import com.afoth.experiments.matprop.domain.properties.SeriesValue;
import com.afoth.experiments.matprop.domain.properties.ValueRange;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by des on 18.04.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialTest {

    @Autowired
    MaterialRepository repository;

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testMaterial() throws Exception {
        Density density = new Density();
        density.getValues().add(new SeriesValue(20.0, 6.0));
        density.getValues().add(new SeriesValue(30.0, 5.0));
        density.getValues().add(new SeriesValue(40.0, 4.0));

        MeltingPoint meltingPoint = new MeltingPoint();
        meltingPoint.setRange(new ValueRange(100.0, 150.0));

        Properties properties = new Properties();
        properties.setDensity(density);
        properties.setMeltingPoint(meltingPoint);

        Material material = Material.builder().properties(properties).build();
        repository.save(material);
        material = repository.findOne(material.getId());
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(material);

        Material material2 = mapper.readerFor(Material.class).readValue(json);
        material2.setId(2l);
        repository.save(material2);
        material2 = repository.findOne(2l);
        System.out.println(mapper.writeValueAsString(material2));
    }
}