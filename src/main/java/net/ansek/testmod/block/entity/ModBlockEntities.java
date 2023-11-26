package net.ansek.testmod.block.entity;

import net.ansek.testmod.TestMod;
import net.ansek.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<HeadComputerBlockEntity> HEAD_COMPUTER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TestMod.MOD_ID, "cell_controller_be"),
                    FabricBlockEntityTypeBuilder.create(HeadComputerBlockEntity::new,
                            ModBlocks.HEAD_COMPUTER).build());

    public static void registerBlockEntities() {
        TestMod.LOGGER.info("Registering Block entities for " + TestMod.MOD_ID);
    }
}
