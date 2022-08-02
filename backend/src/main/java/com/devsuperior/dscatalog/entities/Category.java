package com.devsuperior.dscatalog.entities;

import java.io.Serial;
import java.io.Serializable;

public class Category implements Serializable {
    // padrão da linguagem para converte em bytes para passar pelas redes / boa pratica usada nas versões anteriores;
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return id.equals(category.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
