package technologies.pure.command;

import technologies.pure.data.Product;

import java.util.List;

public interface Command {

    void execute(List<Product> products);

}
