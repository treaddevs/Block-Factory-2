public class HouseBlockFactory implements Factory {
    private int numStoneBlocks;
    private int numWoodBlocks;
    /*
    numStoneBlocks and numWoodBlocks represents the HouseBlockFactory's inventory
    This supply will be drawn from to build a house block once there is enough supply
    */
    public HouseBlockFactory() {
        numStoneBlocks = 0;
        numWoodBlocks = 0;
    }
    /*
    The supply of both block types is 0 before any resource has been mined
    and before any blocks have been produced
    */
    @Override
    public void takeResource(Object obj) {
        if(obj == null) return;
        if(!(obj instanceof Block)) {
            throw new IllegalArgumentException("Not a block");
        }
        Block block = (Block) obj;
        if(block instanceof StoneBlock) {
            numStoneBlocks += 1;
        }
        if(block instanceof WoodBlock) {
            numWoodBlocks += 1;
        }
        if(block.getType() != ResourceType.STONE && block.getType() != ResourceType.WOOD) {
            throw new IllegalArgumentException("Not of type stone or wood");
        }
        /*
        Requirements:
        Allow the take resource method to accept any object, but throw an exception if someone tries to send it something other than a block
        After it is safe to do so, typecast that object as a block and make sure it is a wood or stone block that was sent
        Throw an exception if it isn’t one of those two type
        */
    }
    @Override
    public Block produce() {
        if (numStoneBlocks < Const.HOUSE_NUM_STONE) {
            return null;
        }
        if (numWoodBlocks < Const.HOUSE_NUM_WOOD) {
            return null;
        }
        Resource r1 = new Resource(Const.STONE_WEIGHT*Const.HOUSE_NUM_STONE, ResourceType.STONE);
        Resource r2 = new Resource(Const.WOOD_WEIGHT*Const.HOUSE_NUM_WOOD, ResourceType.WOOD);
        numStoneBlocks -= Const.HOUSE_NUM_STONE;
        numWoodBlocks -= Const.HOUSE_NUM_WOOD;
        return new HouseBlock(r1, r2);
        /*
        Requirements:
        First check to see if it has enough of each type of blocks in its inventory to do so
        If it does, return a new house block; otherwise, just return null
        Make sure to use the constants you set up as conditionals for this operation
        When a block is produced, the factory’s inventory should decrease appropriately
        */
    }
    public void displayInventory() {
        System.out.println("Number of Stone Blocks:" + numStoneBlocks);
        System.out.println("Number of Wood Blocks:" + numWoodBlocks);
        /*
        This simply prints the number of each block type within
        the HouseBlockFactory's inventory
        */
    }
}
