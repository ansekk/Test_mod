package net.ansek.testmod.block;

import net.ansek.testmod.TestMod;
import net.ansek.testmod.block.custom.CellContollerBlock;
import net.ansek.testmod.block.custom.HeadComputerBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block INTERIOR_WALL = registerBlock("interior_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));

    public static final Block HEAD_COMPUTER = registerBlock("head_computer",
            new HeadComputerBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));

    public static final Block CELL_CONTROLLER = registerBlock("cell_controller",
            new CellContollerBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering blocks for " + TestMod.MOD_ID);
    }
}
