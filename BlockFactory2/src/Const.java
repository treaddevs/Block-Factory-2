public final class Const {
/*
Class Const (short for constant) declares the static variables STONE_WEIGHT and WOOD_WEIGHT
Both variables are of primitive type double and declared with the non-access modifier final
The final keyword ensures their values cannot be modified
Their respective weight values are set to STONE_WEIGHT = 20.0 and WOOD_WEIGHT = 10.0
These values represents the weight required to make a block of type STONE or WOOD (which never changes)
*/
    public static final double STONE_WEIGHT = 20.0; /* Static means I can say Const.STONE_WEIGHT from a different class */
    public static final double WOOD_WEIGHT = 10.0; /* Static means I can say Const.WOOD_WEIGHT from a different class */
    public static final int HOUSE_NUM_STONE = 2; /* Represents required number of stone blocks to build a house block */
    public static final int HOUSE_NUM_WOOD = 3; /* Represents required number of wood blocks to build a house block */
    public static final double HOUSE_WEIGHT = STONE_WEIGHT * HOUSE_NUM_STONE + WOOD_WEIGHT * HOUSE_NUM_WOOD;
    /*
    The house blocks weight is representative of the product of the number of stone blocks and wood blocks
    multiplied by their respective weights
    */
}
