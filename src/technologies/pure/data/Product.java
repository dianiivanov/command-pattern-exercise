package technologies.pure.data;

import technologies.pure.data.enums.Type;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String description;
    private BigDecimal price;
    private Long quantity;
    private Type type;

    public Product(final String name, final String description, final BigDecimal price, final Long quantity,
                   final Type type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Type getType() {
        return type;
    }
}