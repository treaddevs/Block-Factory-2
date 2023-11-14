public class HouseBlock extends Block {
    public HouseBlock(Resource r1, Resource r2) {
        super(ResourceType.HOUSE, Const.HOUSE_WEIGHT);
        /* Checks that r1 is of type stone or wood, otherwise, exception is thrown */
        if (r1.getType() != ResourceType.STONE && r1.getType() != ResourceType.WOOD) {
            throw new IllegalArgumentException("Incorrect type");
        }
        /*
        Here both switch statements are initiated for r1 and r2
        To check if there is enough weight of each resource type to build a house block
        */
        switch (r1.getType()) {
            case STONE:
                if (r1.getWeight() < Const.STONE_WEIGHT * Const.HOUSE_NUM_STONE) {
                    throw new IllegalArgumentException("Insufficient Stone Blocks");
                }
                break;
            case WOOD:
                if (r1.getWeight() < Const.WOOD_WEIGHT * Const.HOUSE_NUM_WOOD) {
                    throw new IllegalArgumentException("Insufficient Wood Blocks");
                }
                break;
        }
        if (r2.getType() != ResourceType.STONE && r2.getType() != ResourceType.WOOD) {
            throw new IllegalArgumentException("Incorrect type");
        }
        switch (r2.getType()) {
            case STONE:
                if (r2.getWeight() < Const.STONE_WEIGHT * Const.HOUSE_NUM_STONE) {
                    throw new IllegalArgumentException("Insufficient Stone Blocks");
                }
                break;
            case WOOD:
                if (r2.getWeight() < Const.WOOD_WEIGHT * Const.HOUSE_NUM_WOOD) {
                    throw new IllegalArgumentException("Insufficient Wood Blocks");
                }
                break;
        }
        /*
        This exception is thrown if the resources are of the same type
        */
        if (r1.getType() == r2.getType()) {
            throw new IllegalArgumentException("Cannot be same type, one stone resource one wood resource required");
        }
    }
}



