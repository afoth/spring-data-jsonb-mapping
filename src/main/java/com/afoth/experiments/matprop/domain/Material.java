package com.afoth.experiments.matprop.domain;

import com.afoth.experiments.matprop.util.JSONBUserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

/**
 * Created by des on 18.04.17.
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(name = "jsonb", typeClass = JSONBUserType.class, parameters = {
        @org.hibernate.annotations.Parameter(name = JSONBUserType.CLASS, value = "com.afoth.experiments.matprop.domain.Properties")})
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    @Type(type = "jsonb")
    private Properties properties;
}
