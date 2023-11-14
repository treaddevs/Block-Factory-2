public final class Resource {
    /*
    The Resource class establishes the raw material a block can be built from
    The variables weight and ResourceType type are declared
    These indicate the characteristics of the material
    */
    private double weight;
    private final ResourceType type;

    public Resource(double weight, ResourceType type) {
        /* The Resource constructor takes a double weight and ResourceType type as arguments */
        this.weight = weight; /* Initializes Resource weight */
        this.type = type; /* Initializes Resource type */
    }

    public double getWeight() { /* Getter method to obtain resource weight */
        return weight;
    }

    public ResourceType getType() { /* Getter method to obtain resource type */
        return type;
    }

    public void addResource(double amount) { /* This method is used to add a resource */
        /* The added resource amount must be a positive number or an exception is thrown */
        if (amount < 0) {
            throw new IllegalArgumentException(("Cannot add a negative value to resource"));
        }
        weight += amount; /* Added resource increments up if correct value */
    }

    public void subtractResource(double amount) { /* This method is used to subtract a resource */
        /*
        Subtracted resource amount must not exceed the resource's weight
        In other words, the system does not allow to subtract more of a resource than it has stored
        Otherwise, and exception is thrown
        */
        if (amount > weight) {
            throw new IllegalArgumentException(("Cannot reduce a resource beyond current capacity " +
                    "(system does not allow for negative resource amount) "));
        }
        weight -= amount; /* Subtracted resource increments down if correct value */
    }
}

